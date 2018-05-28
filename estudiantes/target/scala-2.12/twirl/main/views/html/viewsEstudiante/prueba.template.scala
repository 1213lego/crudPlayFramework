
package views.html.viewsEstudiante

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


Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*2.2*/mainMenu("Estudiante")/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<!DOCTYPE html>
    <html>
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">


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

                                """),_display_(/*40.34*/for(p <- listaEstudiantes) yield /*40.60*/{_display_(Seq[Any](format.raw/*40.61*/("""
                                    """),format.raw/*41.37*/("""<tr>
                                        <td><a class="btn btn-link" href=""""),_display_(/*42.76*/routes/*42.82*/.HomeController.buscar(p.getIdentificacion)),format.raw/*42.125*/("""">"""),_display_(/*42.128*/p/*42.129*/.getIdentificacion()),format.raw/*42.149*/("""</a></td>
                                        <td>"""),_display_(/*43.46*/p/*43.47*/.getNombres()),format.raw/*43.60*/("""</td>
                                        <td>"""),_display_(/*44.46*/p/*44.47*/.getApellidos()),format.raw/*44.62*/("""</td>
                                        <td>"""),_display_(/*45.46*/p/*45.47*/.getSemestre()),format.raw/*45.61*/("""</td>
                                    </tr>
                                """)))}),format.raw/*47.34*/("""
                                """),format.raw/*48.33*/("""<tr></tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <a class="btn btn-success" href=""""),_display_(/*55.43*/routes/*55.49*/.HomeController.crear()),format.raw/*55.72*/("""" contenteditable="false">
            <i class="glyphicon glyphicon-plus-sign"></i>
            Crear un Estudiante
        </a>

    </body>
    </html>

""")))}))
      }
    }
  }

  def render(listaEstudiantes:List[Estudiante]): play.twirl.api.HtmlFormat.Appendable = apply(listaEstudiantes)

  def f:((List[Estudiante]) => play.twirl.api.HtmlFormat.Appendable) = (listaEstudiantes) => apply(listaEstudiantes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 27 15:55:21 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/prueba.scala.html
                  HASH: 8d79a68c46be94a7816e4514274cec6aba68432b
                  MATRIX: 975->1|1106->37|1134->40|1164->62|1202->63|1234->69|2623->1431|2665->1457|2704->1458|2770->1496|2878->1577|2893->1583|2958->1626|2989->1629|3000->1630|3042->1650|3125->1706|3135->1707|3169->1720|3248->1772|3258->1773|3294->1788|3373->1840|3383->1841|3418->1855|3532->1938|3594->1972|3834->2185|3849->2191|3893->2214
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|72->40|72->40|72->40|73->41|74->42|74->42|74->42|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|79->47|80->48|87->55|87->55|87->55
                  -- GENERATED --
              */
          