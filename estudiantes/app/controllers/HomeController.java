package controllers;

import io.ebean.Ebean;
import io.ebean.Query;
import models.Estudiante;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.viewsEstudiante.*;

import javax.inject.Inject;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;
    @Inject
    public HomeController(FormFactory pforFormFactory)
    {
        formFactory=pforFormFactory;
    }

    public Result mainPage()
    {
        return ok(mainPage.render("Estudiante"));
    }
    public Result indexList()
    {
        Query<Estudiante> estudianteQuery= Ebean.find(Estudiante.class);
        List<Estudiante> estudiantes= estudianteQuery.findList();
        //return ok(indexList.render(estudiantes));
        return ok(prueba.render(estudiantes));
    }
    public Result indexCrear()
    {
        Form<Estudiante> estudianteForm = formFactory.form(Estudiante.class);
        return ok(indexCrear.render(estudianteForm));
    }
    public  Result crear()
    {
        DynamicForm data=formFactory.form().bindFromRequest();
        String identidicion= data.get("identificacion");
        String nombres= data.get("nombres");
        String apellidos= data.get("apellidos");
        String semestre=data.get("semestre");
        Estudiante estudiante= new Estudiante();
        estudiante.setIdentificacion(Long.parseLong(identidicion));
        estudiante.setNombres(nombres);
        estudiante.setApellidos(apellidos);
        Integer seme= Integer.parseInt(semestre);
        estudiante.setSemestre(seme);
        try
        {
            Ebean.save(estudiante);
            return indexList();
        }
        catch (Exception e)
        {
            return ok(mainPage.render("El estudiante con Id: " + identidicion + " No se creo"+ e.getMessage()));
        }
    }
    public Result buscar(Long identificacion)
    {
        Estudiante estudiante= Ebean.find(Estudiante.class,identificacion);
        if(estudiante!=null)
        {
            return ok(indexBuscar.render(estudiante));
        }
        else
        {
            String mensaje="No existe el estudiante con Id: " + identificacion.toString();
            return ok(mainPage.render(mensaje));
        }
    }

    public Result search() {
        DynamicForm data=formFactory.form().bindFromRequest();
        String identificacion= data.get("Identificacion a buscar");
        Long idd=Long.parseLong(identificacion);
        return buscar(idd);
    }
    public Result eliminar(Long id)
    {
        Estudiante estudiante= Ebean.find(Estudiante.class,id);
        boolean elimino= Ebean.delete(estudiante);
        if(elimino)
        {
            return indexList();
        }
        else {
            return ok(mainPage.render("No se elimino"));
        }
    }
}
