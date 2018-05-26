
package views.html.prueba

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object prueba extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Estudiante],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaEstudiantes: List[Estudiante]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/content/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.12*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
    <html>
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
            <link rel="stylesheet" href="https://v40.pingendo.com/assets/4.0.0/default/theme.css" type="text/css"> </head>

        <body>
            <div class="py-5">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <h1 class="text-center text-dark display-4" id="tituloPropietarios">
                                <b>Lista estudiantes</b>
                            </h1>
                        </div>
                    </div>
                </div>
            </div>
            <div class="py-5">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Id</th>
                                        <th>Nombres
                                            <br> </th>
                                        <th>Apellidos
                                            <br> </th>
                                        <th>Semestre
                                            <br> </th>
                                    </tr>
                                </thead>
                                <tbody>

                                    """),_display_(/*42.38*/for(p <- listaEstudiantes) yield /*42.64*/{_display_(Seq[Any](format.raw/*42.65*/("""
                                        """),format.raw/*43.41*/("""<tr>
                                            <td><a href=""""),_display_(/*44.59*/routes/*44.65*/.HomeController.buscar(p.getIdentificacion)),format.raw/*44.108*/("""">"""),_display_(/*44.111*/p/*44.112*/.getIdentificacion()),format.raw/*44.132*/("""</a></td>
                                            <td>"""),_display_(/*45.50*/p/*45.51*/.getNombres()),format.raw/*45.64*/("""</td>
                                            <td>"""),_display_(/*46.50*/p/*46.51*/.getApellidos()),format.raw/*46.66*/("""</td>
                                            <td>"""),_display_(/*47.50*/p/*47.51*/.getSemestre()),format.raw/*47.65*/("""</td>
                                        </tr>
                                    """)))}),format.raw/*49.38*/("""
                                    """),format.raw/*50.37*/("""<tr></tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <div class="py-5">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <a class="btn btn-primary" href=""""),_display_(/*61.63*/routes/*61.69*/.HomeController.crear()),format.raw/*61.92*/("""" contenteditable="false">Crear un Estudiante</a>
                        </div>
                    </div>
                </div>
            </div>
            <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        </body>
    </html>
""")))};
Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*71.2*/("""
"""),_display_(/*72.2*/main("Estudiante")/*72.20*/(content)))
      }
    }
  }

  def render(listaEstudiantes:List[Estudiante]): play.twirl.api.HtmlFormat.Appendable = apply(listaEstudiantes)

  def f:((List[Estudiante]) => play.twirl.api.HtmlFormat.Appendable) = (listaEstudiantes) => apply(listaEstudiantes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 26 14:21:27 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/prueba/prueba.scala.html
                  HASH: 774a7a6bd6b6ca9e384878377db766ff9363065a
                  MATRIX: 966->1|1080->42|1094->49|1174->52|1202->54|2976->1801|3018->1827|3057->1828|3127->1870|3218->1934|3233->1940|3298->1983|3329->1986|3340->1987|3382->2007|3469->2067|3479->2068|3513->2081|3596->2137|3606->2138|3642->2153|3725->2209|3735->2210|3770->2224|3892->2315|3958->2353|4403->2771|4418->2777|4462->2800|5313->37|5344->3612|5373->3615|5400->3633
                  LINES: 28->1|32->3|32->3|34->3|35->4|73->42|73->42|73->42|74->43|75->44|75->44|75->44|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|80->49|81->50|92->61|92->61|92->61|103->1|105->71|106->72|106->72
                  -- GENERATED --
              */
          