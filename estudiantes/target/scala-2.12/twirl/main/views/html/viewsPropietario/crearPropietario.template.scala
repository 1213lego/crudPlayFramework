
package views.html.viewsPropietario

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

object crearPropietario extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Propietario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formularioPropietarios: Form[Propietario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""
"""),_display_(/*2.2*/main("Crear Propietarios")/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""


    """),format.raw/*5.5*/("""<div class="jumbotron">

    """),_display_(/*7.6*/helper/*7.12*/.form(action=routes.ControladorPropietario.crearPropietario())/*7.74*/{_display_(Seq[Any](format.raw/*7.75*/("""
        """),_display_(/*8.10*/helper/*8.16*/.CSRF.formField),format.raw/*8.31*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(formularioPropietarios("cedula"),'class -> "form-control", 'placeholder -> "cedula")),format.raw/*9.111*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(formularioPropietarios("nombres"),'class ->" form-control",'placeholder -> "nombre" )),format.raw/*10.112*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(formularioPropietarios("apellidos"),'class ->" form-control",'placeholder -> "apellidos" )),format.raw/*11.117*/("""
        """),format.raw/*12.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus"></i>Crear Propietario</button>
    """)))}),format.raw/*13.6*/("""


    """),format.raw/*16.5*/("""</div>

""")))}))
      }
    }
  }

  def render(formularioPropietarios:Form[Propietario]): play.twirl.api.HtmlFormat.Appendable = apply(formularioPropietarios)

  def f:((Form[Propietario]) => play.twirl.api.HtmlFormat.Appendable) = (formularioPropietarios) => apply(formularioPropietarios)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 14:26:04 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsPropietario/crearPropietario.scala.html
                  HASH: df156275e7fbad87f5ac746f1c20565e19c810c0
                  MATRIX: 987->1|1125->44|1153->47|1187->73|1225->74|1261->84|1318->116|1332->122|1402->184|1440->185|1477->196|1491->202|1526->217|1563->228|1577->234|1693->329|1731->340|1746->346|1864->442|1902->453|1917->459|2040->560|2077->570|2226->689|2263->699
                  LINES: 28->1|33->1|34->2|34->2|34->2|37->5|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|45->13|48->16
                  -- GENERATED --
              */
          