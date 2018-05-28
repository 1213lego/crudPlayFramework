package controllers;

import io.ebean.Ebean;
import io.ebean.Query;
import models.Propietario;
import models.Vehiculo;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import javax.inject.Inject;
import java.util.List;

import views.html.mainPage;
import views.html.viewsVehiculo.*;
public class ControladorVehiculo extends Controller {
    private FormFactory formFactory;

    @Inject
    public ControladorVehiculo(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result listaVehiculos() {
        Query<Vehiculo> query = Ebean.find(Vehiculo.class);
        List<Vehiculo> vehiculos = query.findList();
        return ok(listaVehiculos.render(vehiculos));
    }

    public Result indexCrearVehiculo() {
        Form<Vehiculo> form = formFactory.form(Vehiculo.class);
        return ok(crearVehiculo.render(form));
    }

    public Result crearVehiculo() {
        try {
            DynamicForm data = formFactory.form().bindFromRequest();
            String placa = data.get("placa");
            String cc = data.get("cc propietario");
            String marca = data.get("marca");
            String modelo = data.get("modelo");
            String tipo = data.get("tipo");
            String pasajeros = data.get("cantidad pasajeros");
            Vehiculo v = new Vehiculo();
            v.setPlaca(placa);
            v.setPropietario(Ebean.find(Propietario.class, Long.parseLong(cc)));
            v.setMarca(marca);
            v.setModelo(Integer.parseInt(modelo));
            v.setTipo(tipo);
            v.setPasajeros(Integer.parseInt(pasajeros));
            Ebean.save(v);
            return listaVehiculos();
        } catch (Exception e) {
            return ok(mainPage.render("Error al crear el vehiculo: " + e.getMessage()));
        }
    }

    public Result buscarVehiculo(String placa) {
        Form<Vehiculo> form = formFactory.form(Vehiculo.class);
        Vehiculo v = Ebean.find(Vehiculo.class, placa);
        if (v != null) {
            return ok(mostarVehiculo.render(v, form));
        } else {
            return ok(mainPage.render("No se encuentrea el vehiculo con placa: " + placa));
        }
    }

    public Result formularioBuscarVehiculo() {
        Form<Vehiculo> form = formFactory.form(Vehiculo.class);
        return ok(buscarVehiculo.render(form));
    }

    public Result formBuscarVehiculo() {
        DynamicForm data = formFactory.form().bindFromRequest();
        String placa = data.get("placa");
        return buscarVehiculo(placa);
    }


    public Result modificarvehiculo(String placa) {
        try {
            DynamicForm data = formFactory.form().bindFromRequest();
            Vehiculo v = Ebean.find(Vehiculo.class, placa);
            String marca = data.get("marca");
            String modelo = data.get("modelo");
            String tipo = data.get("tipo");
            String pasajeros = data.get("cantidad pasajeros");
            v.setMarca(marca);
            v.setModelo(Integer.parseInt(modelo));
            v.setTipo(tipo);
            v.setPasajeros(Integer.parseInt(pasajeros));
            Ebean.update(v);
            return listaVehiculos();
        } catch (Exception e) {
            return ok(mainPage.render("No se modifico el vehiculo con placa: " + placa + " Error: " + e.getMessage()));
        }
    }

    public Result eliminarVehiculo(String placa)
    {
        Vehiculo v= Ebean.find(Vehiculo.class,placa);
        boolean elimino=Ebean.delete(v);
        if(elimino)
        {
            return listaVehiculos();
        }
        else
        {
            return  ok(mainPage.render("No se elimino el vehiculo con la placa: " + placa));
        }
    }
}
