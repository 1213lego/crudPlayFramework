
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
    """),_display_(/*3.6*/helper/*3.12*/.form(action=routes.ControladorVehiculo.crearVehiculo())/*3.68*/{_display_(Seq[Any](format.raw/*3.69*/("""
        """),_display_(/*4.10*/helper/*4.16*/.CSRF.formField),format.raw/*4.31*/("""
        """),_display_(/*5.10*/helper/*5.16*/.inputText(formularioVehiculos("placa"),'class -> "form-control", 'placeholder -> "placa")),format.raw/*5.106*/("""
        """),_display_(/*6.10*/helper/*6.16*/.inputText(formularioVehiculos("cc propietario"),'class ->" form-control",'placeholder -> "cedula propietario" )),format.raw/*6.128*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(formularioVehiculos("marca"),'class ->" form-control",'placeholder -> "marca" )),format.raw/*7.106*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(formularioVehiculos("modelo"),'class ->" form-control",'placeholder -> "modelo" )),format.raw/*8.108*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(formularioVehiculos("tipo"),'class ->" form-control",'placeholder -> "tipo" )),format.raw/*9.104*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(formularioVehiculos("cantidad pasajeros"),'class ->" form-control",'placeholder -> "cantidad" )),format.raw/*10.122*/("""
        """),format.raw/*11.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus"></i>Crear Vehiculo</button>
    """)))}),format.raw/*12.6*/("""
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
                  DATE: Mon May 28 12:14:10 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsVehiculo/crearVehiculo.scala.html
                  HASH: cd963472d7ed82eb735a7d7c66d831b05524c150
                  MATRIX: 978->1|1110->38|1138->41|1172->67|1210->68|1242->75|1256->81|1320->137|1358->138|1395->149|1409->155|1444->170|1481->181|1495->187|1606->277|1643->288|1657->294|1790->406|1827->417|1841->423|1952->513|1989->524|2003->530|2116->622|2153->633|2167->639|2276->727|2314->738|2329->744|2457->850|2494->860|2640->976
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|44->12
                  -- GENERATED --
              */
          