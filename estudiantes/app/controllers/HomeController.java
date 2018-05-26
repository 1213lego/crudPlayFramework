package controllers;

import io.ebean.Ebean;
import io.ebean.Query;
import models.Estudiante;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.prueba.prueba;
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
    public Result indexList()
    {
        Query<Estudiante> estudianteQuery= Ebean.find(Estudiante.class);
        List<Estudiante> estudiantes= estudianteQuery.findList();
        return ok(indexList.render(estudiantes));
        //return ok(prueba.render(estudiantes));
    }
    public Result indexCrear()
    {
        Form<Estudiante> estudianteForm = formFactory.form(Estudiante.class);
        return ok(indexCrear.render(estudianteForm));
    }
    public  Result crear()
    {
        DynamicForm data=formFactory.form().bindFromRequest();
        String identidicion= data.get("Identificacion");
        String nombres= data.get("Nombres");
        String apellidos= data.get("Apellidos");
        String semestre=data.get("Semestre");
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
            return badRequest("ya existe");
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
            return badRequest("No existe");
        }
    }

    public Result search() {
        DynamicForm data=formFactory.form().bindFromRequest();
        String identificacion= data.get("Identificacion a buscar");
        Long idd=Long.parseLong(identificacion);
        Estudiante est= Ebean.find(Estudiante.class,idd);
        if(est!=null)
        {
            return ok(indexBuscar.render(est));
        }
        else
        {
            return indexCrear();
        }
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
            return badRequest("No se elimino nada");
        }
    }
}
