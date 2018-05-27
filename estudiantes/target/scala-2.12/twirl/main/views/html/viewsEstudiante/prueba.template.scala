
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
            <link rel="stylesheet" media="screen" href=""""),_display_(/*8.58*/routes/*8.64*/.Assets.versioned("../../../public/css/bootstrap.min.css")),format.raw/*8.122*/("""">
            <link rel="stylesheet" media="screen" href=""""),_display_(/*9.58*/routes/*9.64*/.Assets.versioned("../../../public/css/bootstrap-theme.min.css")),format.raw/*9.128*/("""">
            <link rel="stylesheet" media="screen" href=""""),_display_(/*10.58*/routes/*10.64*/.Assets.versioned("../../../public/css/style.css")),format.raw/*10.114*/("""">

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

                                """),_display_(/*42.34*/for(p <- listaEstudiantes) yield /*42.60*/{_display_(Seq[Any](format.raw/*42.61*/("""
                                    """),format.raw/*43.37*/("""<tr>
                                        <td><a class="btn btn-link" href=""""),_display_(/*44.76*/routes/*44.82*/.HomeController.buscar(p.getIdentificacion)),format.raw/*44.125*/("""">"""),_display_(/*44.128*/p/*44.129*/.getIdentificacion()),format.raw/*44.149*/("""</a></td>
                                        <td>"""),_display_(/*45.46*/p/*45.47*/.getNombres()),format.raw/*45.60*/("""</td>
                                        <td>"""),_display_(/*46.46*/p/*46.47*/.getApellidos()),format.raw/*46.62*/("""</td>
                                        <td>"""),_display_(/*47.46*/p/*47.47*/.getSemestre()),format.raw/*47.61*/("""</td>
                                    </tr>
                                """)))}),format.raw/*49.34*/("""
                                """),format.raw/*50.33*/("""<tr></tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <a class="btn btn-success" href=""""),_display_(/*57.43*/routes/*57.49*/.HomeController.crear()),format.raw/*57.72*/("""" contenteditable="false">
            <i class="glyphicon glyphicon-plus-sign"></i>
            Crear un Estudiante
        </a>

        <script src=""""),_display_(/*62.23*/routes/*62.29*/.Assets.versioned("../../../public/js/jquery-3.3.1.min.js")),format.raw/*62.88*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*63.23*/routes/*63.29*/.Assets.versioned("../../../public/js/bootstrap.min.js")),format.raw/*63.85*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*64.23*/routes/*64.29*/.Assets.versioned("../../../public/js/custom.js")),format.raw/*64.78*/("""" type="text/javascript"></script>

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
                  DATE: Sat May 26 23:08:20 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/prueba.scala.html
                  HASH: ccfffa3a1738b38f8d1ca1bc1a061b78b2d4ce9d
                  MATRIX: 975->1|1106->37|1134->40|1164->62|1202->63|1234->69|1480->289|1494->295|1573->353|1660->414|1674->420|1759->484|1847->545|1862->551|1934->601|3162->1802|3204->1828|3243->1829|3309->1867|3417->1948|3432->1954|3497->1997|3528->2000|3539->2001|3581->2021|3664->2077|3674->2078|3708->2091|3787->2143|3797->2144|3833->2159|3912->2211|3922->2212|3957->2226|4071->2309|4133->2343|4373->2556|4388->2562|4432->2585|4617->2743|4632->2749|4712->2808|4797->2866|4812->2872|4889->2928|4974->2986|4989->2992|5059->3041
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|74->42|74->42|74->42|75->43|76->44|76->44|76->44|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|81->49|82->50|89->57|89->57|89->57|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|96->64
                  -- GENERATED --
              */
          