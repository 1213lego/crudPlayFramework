
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
    """),_display_(/*3.6*/helper/*3.12*/.form(action=routes.ControladorVehiculo.formBuscarVehiculo())/*3.73*/{_display_(Seq[Any](format.raw/*3.74*/("""
        """),_display_(/*4.10*/helper/*4.16*/.CSRF.formField),format.raw/*4.31*/("""
        """),_display_(/*5.10*/helper/*5.16*/.inputText(formularioVehiculos("placa"),'class -> "form-control", 'placeholder -> "placa")),format.raw/*5.106*/("""
        """),format.raw/*6.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-search"></i>Buscar Vehiculo</button>
    """)))}),format.raw/*7.6*/("""
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
                  DATE: Mon May 28 12:56:20 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsVehiculo/buscarVehiculo.scala.html
                  HASH: 47dc9dc5e0c8677230341f5467e419728bebc62c
                  MATRIX: 979->1|1111->38|1139->41|1173->67|1211->68|1243->75|1257->81|1326->142|1364->143|1401->154|1415->160|1450->175|1487->186|1501->192|1612->282|1648->292|1796->411
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|39->7
                  -- GENERATED --
              */
          