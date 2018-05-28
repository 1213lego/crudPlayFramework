
package views.html.viewsVehiculo

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

object buscarVehiculo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Vehiculo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formularioVehiculos: Form[Vehiculo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""
"""),_display_(/*2.2*/main("Buscar Propietario")/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""


    """),format.raw/*5.5*/("""<div class="jumbotron">
    """),_display_(/*6.6*/helper/*6.12*/.form(action=routes.ControladorVehiculo.formBuscarVehiculo())/*6.73*/{_display_(Seq[Any](format.raw/*6.74*/("""
        """),_display_(/*7.10*/helper/*7.16*/.CSRF.formField),format.raw/*7.31*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(formularioVehiculos("placa"),'class -> "form-control", 'placeholder -> "placa")),format.raw/*8.106*/("""
        """),format.raw/*9.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-search"></i>Buscar Vehiculo</button>
    """)))}),format.raw/*10.6*/("""

    """),format.raw/*12.5*/("""</div>

""")))}))
      }
    }
  }

  def render(formularioVehiculos:Form[Vehiculo]): play.twirl.api.HtmlFormat.Appendable = apply(formularioVehiculos)

  def f:((Form[Vehiculo]) => play.twirl.api.HtmlFormat.Appendable) = (formularioVehiculos) => apply(formularioVehiculos)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 15:07:59 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsVehiculo/buscarVehiculo.scala.html
                  HASH: e59194322b5f0d66e57ac8de53d94b7ef717b399
                  MATRIX: 979->1|1111->38|1139->41|1173->67|1211->68|1247->78|1302->108|1316->114|1385->175|1423->176|1460->187|1474->193|1509->208|1546->219|1560->225|1671->315|1707->325|1856->444|1891->452
                  LINES: 28->1|33->1|34->2|34->2|34->2|37->5|38->6|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|42->10|44->12
                  -- GENERATED --
              */
          