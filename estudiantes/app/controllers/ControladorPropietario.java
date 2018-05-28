package controllers;

import io.ebean.Ebean;
import io.ebean.Query;
import models.Propietario;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import  views.html.*;
import views.html.viewsPropietario.buscarPropietario;
import views.html.viewsPropietario.crearPropietario;
import views.html.viewsPropietario.listaPropietarios;
import views.html.viewsPropietario.mostarPropietario;

import javax.inject.Inject;
import java.util.List;

public class ControladorPropietario extends Controller {

    private FormFactory formFactory;

    @Inject
    public ControladorPropietario (FormFactory formFactory)
    {
        this.formFactory=formFactory;
    }

    public Result index()
    {
        return ok(mainPage.render("Estructura de datos"));
    }

    public Result indexCrear()
    {
        Form<Propietario> form= formFactory.form(Propietario.class);
        return ok(crearPropietario.render(form));
    }
    public Result crearPropietario()
    {
        DynamicForm data=formFactory.form().bindFromRequest();
        String cedula=data.get("cedula");
        String nombre=data.get("nombres");
        String apellidos=data.get("apellidos");
        Propietario p= new Propietario();
        p.setCedula(Long.parseLong(cedula));
        p.setNombres(nombre);
        p.setApellidos(apellidos);
        try
        {
            Ebean.save(p);
            return listaPropietarios();
        }
        catch (Exception e) {
            //return badRequest("No agrego"+ e.getMessage());
            return ok(mainPage.render("No agrego"+ e.getMessage()));
        }
    }
    public Result listaPropietarios()
    {
        Query<Propietario> query=Ebean.find(Propietario.class);
        List<Propietario>   propietarios= query.findList();
        return  ok(listaPropietarios.render(propietarios));
     }
     public Result buscar(Long cedula)
     {
         Form<Propietario> form= formFactory.form(Propietario.class);
         Propietario propietario= Ebean.find(Propietario.class,cedula);
         if(propietario!=null)
         {
             return ok(mostarPropietario.render(propietario,form));
         }
         else
         {
             return ok(mainPage.render("No se ecuentra el propietarios con cedula: " + cedula.toString()));
         }
     }
     public Result buscarProp()
     {
         Form<Propietario> form= formFactory.form(Propietario.class);
         return  ok(buscarPropietario.render(form));
     }
     public Result buscarRedireccionar()
     {
         DynamicForm data=formFactory.form().bindFromRequest();
         String cedula=data.get("cedula");
         Long cc=Long.parseLong(cedula);
         return buscar(cc);
     }
}
