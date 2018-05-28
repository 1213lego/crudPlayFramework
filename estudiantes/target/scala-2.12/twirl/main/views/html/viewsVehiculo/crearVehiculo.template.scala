
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

object crearVehiculo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Vehiculo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formularioVehiculos: Form[Vehiculo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""
"""),_display_(/*2.2*/main("Crear Propietarios")/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""

    """),format.raw/*4.5*/("""<div class="jumbotron">

    """),_display_(/*6.6*/helper/*6.12*/.form(action=routes.ControladorVehiculo.crearVehiculo())/*6.68*/{_display_(Seq[Any](format.raw/*6.69*/("""
        """),_display_(/*7.10*/helper/*7.16*/.CSRF.formField),format.raw/*7.31*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(formularioVehiculos("placa"),'class -> "form-control", 'placeholder -> "placa")),format.raw/*8.106*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(formularioVehiculos("cc propietario"),'class ->" form-control",'placeholder -> "cedula propietario" )),format.raw/*9.128*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(formularioVehiculos("marca"),'class ->" form-control",'placeholder -> "marca" )),format.raw/*10.106*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(formularioVehiculos("modelo"),'class ->" form-control",'placeholder -> "modelo" )),format.raw/*11.108*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(formularioVehiculos("tipo"),'class ->" form-control",'placeholder -> "tipo" )),format.raw/*12.104*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(formularioVehiculos("cantidad pasajeros"),'class ->" form-control",'placeholder -> "cantidad" )),format.raw/*13.122*/("""
        """),format.raw/*14.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus"></i>Crear Vehiculo</button>
    """)))}),format.raw/*15.6*/("""

    """),format.raw/*17.5*/("""</div>

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
                  DATE: Mon May 28 14:24:21 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsVehiculo/crearVehiculo.scala.html
                  HASH: 95d4f7caf99bcf96963950f4d8f0c8c7ecaeb8cc
                  MATRIX: 978->1|1110->38|1138->41|1172->67|1210->68|1244->76|1301->108|1315->114|1379->170|1417->171|1454->182|1468->188|1503->203|1540->214|1554->220|1665->310|1702->321|1716->327|1849->439|1887->450|1902->456|2014->546|2052->557|2067->563|2181->655|2219->666|2234->672|2344->760|2382->771|2397->777|2525->883|2562->893|2708->1009|2743->1017
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|38->6|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|47->15|49->17
                  -- GENERATED --
              */
          