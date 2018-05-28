
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


Seq[Any](format.raw/*1.26*/("""
"""),_display_(/*2.2*/mainMenu(estudiante.getIdentificacion().toString())/*2.53*/{_display_(Seq[Any](format.raw/*2.54*/("""

    """),format.raw/*4.5*/("""<body>
        <h1>Id: """),_display_(/*5.18*/estudiante/*5.28*/.getIdentificacion()),format.raw/*5.48*/("""</h1>
        <p>Nombres: """),_display_(/*6.22*/estudiante/*6.32*/.getNombres()),format.raw/*6.45*/("""</p>
        <p>Apellidos: """),_display_(/*7.24*/estudiante/*7.34*/.getApellidos()),format.raw/*7.49*/("""</p>
        <p>Semestre: """),_display_(/*8.23*/estudiante/*8.33*/.getSemestre()),format.raw/*8.47*/("""</p>
        <p>                                     </p>
        <a class="btn btn-primary" href=""""),_display_(/*10.43*/routes/*10.49*/.HomeController.indexList()),format.raw/*10.76*/("""">Regresar</a> <a class="btn btn-danger" href=""""),_display_(/*10.124*/routes/*10.130*/.HomeController.eliminar(estudiante.getIdentificacion)),format.raw/*10.184*/("""">Eliminar</a>
        <p>                                     </p>

    </body>
""")))}),format.raw/*14.2*/("""
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
                  DATE: Sun May 27 15:55:20 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/indexBuscar.scala.html
                  HASH: d5c2a87362ba06f8b12eb8bf8bc1829925b9d548
                  MATRIX: 974->1|1093->25|1121->28|1180->79|1218->80|1252->88|1303->113|1321->123|1361->143|1415->171|1433->181|1466->194|1521->223|1539->233|1574->248|1628->276|1646->286|1680->300|1809->402|1824->408|1872->435|1948->483|1964->489|2040->543|2156->629
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|46->14
                  -- GENERATED --
              */
          