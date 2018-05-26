
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

object indexBuscar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Estudiante,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(estudiante: Estudiante):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/content/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.12*/("""
        """),format.raw/*3.9*/("""<h1>Id: """),_display_(/*3.18*/estudiante/*3.28*/.getIdentificacion()),format.raw/*3.48*/("""</h1>
        <p>Nombres: """),_display_(/*4.22*/estudiante/*4.32*/.getNombres()),format.raw/*4.45*/("""</p>
        <p>Apellidos: """),_display_(/*5.24*/estudiante/*5.34*/.getApellidos()),format.raw/*5.49*/("""</p>
        <p>Semestre: """),_display_(/*6.23*/estudiante/*6.33*/.getSemestre()),format.raw/*6.47*/("""</p>
        <p>                                     </p>
      <form action=""""),_display_(/*8.22*/routes/*8.28*/.HomeController.eliminar(estudiante.getIdentificacion)),format.raw/*8.82*/(""""> <input type="submit" value="Eliminar"> </form>
        <p>                                     </p>
        <form action=""""),_display_(/*10.24*/routes/*10.30*/.HomeController.indexList()),format.raw/*10.57*/(""""> <input type="submit" value="Regresar"> </form>

""")))};
Seq[Any](format.raw/*1.26*/("""
"""),format.raw/*12.2*/("""
"""),_display_(/*13.2*/main(estudiante.getIdentificacion().toString())/*13.49*/(content)),format.raw/*13.58*/("""
"""))
      }
    }
  }

  def render(estudiante:Estudiante): play.twirl.api.HtmlFormat.Appendable = apply(estudiante)

  def f:((Estudiante) => play.twirl.api.HtmlFormat.Appendable) = (estudiante) => apply(estudiante)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 26 16:29:05 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/indexBuscar.scala.html
                  HASH: 59dcd18c247173c08556d8414c850392b5e0b851
                  MATRIX: 974->1|1076->28|1090->35|1170->38|1206->48|1241->57|1259->67|1299->87|1353->115|1371->125|1404->138|1459->167|1477->177|1512->192|1566->220|1584->230|1618->244|1725->325|1739->331|1813->385|1968->513|1983->519|2031->546|2124->25|2153->600|2182->603|2238->650|2268->659
                  LINES: 28->1|32->2|32->2|34->2|35->3|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|40->8|40->8|40->8|42->10|42->10|42->10|45->1|46->12|47->13|47->13|47->13
                  -- GENERATED --
              */
          