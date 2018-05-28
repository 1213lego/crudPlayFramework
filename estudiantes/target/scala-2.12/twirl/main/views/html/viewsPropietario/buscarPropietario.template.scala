
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

object buscarPropietario extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Propietario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formularioPropietarios: Form[Propietario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""
"""),_display_(/*2.2*/main("Buscar Propietario")/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""
    """),_display_(/*3.6*/helper/*3.12*/.form(action=routes.ControladorPropietario.buscarRedireccionar())/*3.77*/{_display_(Seq[Any](format.raw/*3.78*/("""
        """),_display_(/*4.10*/helper/*4.16*/.CSRF.formField),format.raw/*4.31*/("""
        """),_display_(/*5.10*/helper/*5.16*/.inputText(formularioPropietarios("cedula"),'class -> "form-control")),format.raw/*5.85*/("""
        """),format.raw/*6.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus"></i>Buscar Propietario</button>
    """)))}),format.raw/*7.6*/("""
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
                  DATE: Sun May 27 23:26:55 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsPropietario/buscarPropietario.scala.html
                  HASH: a5ebb78b3a96b28ec9992e139717a87b4dae56ac
                  MATRIX: 988->1|1126->44|1154->47|1188->73|1226->74|1258->81|1272->87|1345->152|1383->153|1420->164|1434->170|1469->185|1506->196|1520->202|1609->271|1645->281|1794->401
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|39->7
                  -- GENERATED --
              */
          