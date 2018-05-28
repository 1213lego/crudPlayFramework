
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

    """),format.raw/*4.5*/("""<div class="jumbotron">

    """),_display_(/*6.6*/helper/*6.12*/.form(action=routes.ControladorPropietario.buscarRedireccionar())/*6.77*/{_display_(Seq[Any](format.raw/*6.78*/("""
        """),_display_(/*7.10*/helper/*7.16*/.CSRF.formField),format.raw/*7.31*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(formularioPropietarios("cedula"),'class -> "form-control")),format.raw/*8.85*/("""
        """),format.raw/*9.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-search"></i>Buscar Propietario</button>
    """)))}),format.raw/*10.6*/("""

    """),format.raw/*12.5*/("""</div>


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
                  DATE: Mon May 28 14:24:20 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsPropietario/buscarPropietario.scala.html
                  HASH: d81959a71a39ea9572a936fbc71e7ce306783db4
                  MATRIX: 988->1|1126->44|1154->47|1188->73|1226->74|1260->82|1317->114|1331->120|1404->185|1442->186|1479->197|1493->203|1528->218|1565->229|1579->235|1668->304|1704->314|1856->436|1891->444
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|38->6|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|42->10|44->12
                  -- GENERATED --
              */
          