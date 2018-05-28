
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
    """),_display_(/*3.6*/helper/*3.12*/.form(action=routes.ControladorPropietario.crearPropietario())/*3.74*/{_display_(Seq[Any](format.raw/*3.75*/("""
        """),_display_(/*4.10*/helper/*4.16*/.CSRF.formField),format.raw/*4.31*/("""
        """),_display_(/*5.10*/helper/*5.16*/.inputText(formularioPropietarios("cedula"),'class -> "form-control", 'placeholder -> "cedula")),format.raw/*5.111*/("""
        """),_display_(/*6.10*/helper/*6.16*/.inputText(formularioPropietarios("nombres"),'class ->" form-control",'placeholder -> "nombre" )),format.raw/*6.112*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(formularioPropietarios("apellidos"),'class ->" form-control",'placeholder -> "apellidos" )),format.raw/*7.117*/("""
        """),format.raw/*8.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus"></i>Crear Propietario</button>
    """)))}),format.raw/*9.6*/("""
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
                  DATE: Mon May 28 00:00:05 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsPropietario/crearPropietario.scala.html
                  HASH: 395cb7273df490fc4bcd8e30244c7360c2a61827
                  MATRIX: 987->1|1125->44|1153->47|1187->73|1225->74|1257->81|1271->87|1341->149|1379->150|1416->161|1430->167|1465->182|1502->193|1516->199|1632->294|1669->305|1683->311|1800->407|1837->418|1851->424|1973->525|2009->535|2157->654
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|41->9
                  -- GENERATED --
              */
          