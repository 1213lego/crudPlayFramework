
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

object mostarPropietario extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Propietario,Form[Propietario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(propietario: Propietario, formularioPropietarios : Form[Propietario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""
"""),_display_(/*2.2*/main("Busqueda Propietarios")/*2.31*/{_display_(Seq[Any](format.raw/*2.32*/("""
    """),format.raw/*3.5*/("""<div class="jumbotron">


        <div class="row">
            <div class="col-sm-4">
                <p>    </p>
                <p class="h2">Cedula: """),_display_(/*9.40*/propietario/*9.51*/.getCedula),format.raw/*9.61*/("""</p>
                <p>    </p>
                <p class="display-4">Nombres: """),_display_(/*11.48*/propietario/*11.59*/.getNombres),format.raw/*11.70*/("""</p>
                <p>    </p>
                <p class="display-4">Apellidos: """),_display_(/*13.50*/propietario/*13.61*/.getApellidos),format.raw/*13.74*/("""</p>

         """),format.raw/*15.94*/("""
                """),format.raw/*16.17*/("""<p>    </p>
                <p>    </p>
                <a class="btn btn-success" href=""""),_display_(/*18.51*/routes/*18.57*/.ControladorPropietario.eliminar(propietario.getCedula())),format.raw/*18.114*/("""" contenteditable="false">
                    <i class="glyphicon glyphicon-trash"></i>
                    Eliminar
                </a>

            </div>
            <div class="col-sm-8">
            """),_display_(/*25.14*/helper/*25.20*/.form(action = routes.ControladorPropietario.modificar(propietario.getCedula))/*25.98*/{_display_(Seq[Any](format.raw/*25.99*/("""
                """),_display_(/*26.18*/helper/*26.24*/.CSRF.formField),format.raw/*26.39*/("""
                """),_display_(/*27.18*/helper/*27.24*/.inputText(formularioPropietarios("cedula"),'class -> "form-control", 'placeholder -> propietario.getCedula, 'readonly ->"true")),format.raw/*27.152*/("""
                """),_display_(/*28.18*/helper/*28.24*/.inputText(formularioPropietarios("nombres"),'class -> "form-control", 'placeholder -> "nombres")),format.raw/*28.121*/("""
                """),_display_(/*29.18*/helper/*29.24*/.inputText(formularioPropietarios("apellidos"),'class -> "form-control", 'placeholder -> "apellidos")),format.raw/*29.125*/("""

            """),format.raw/*31.192*/("""
                """),format.raw/*32.17*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-edit"></i>Modificar</button>
            """)))}),format.raw/*33.14*/("""
            """),format.raw/*34.13*/("""</div>
        </div>

    </div>
""")))}))
      }
    }
  }

  def render(propietario:Propietario,formularioPropietarios:Form[Propietario]): play.twirl.api.HtmlFormat.Appendable = apply(propietario,formularioPropietarios)

  def f:((Propietario,Form[Propietario]) => play.twirl.api.HtmlFormat.Appendable) = (propietario,formularioPropietarios) => apply(propietario,formularioPropietarios)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 11:14:39 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsPropietario/mostarPropietario.scala.html
                  HASH: 87e1b35cbbe3457d6408e0bcf859f33fb2f5364b
                  MATRIX: 1000->1|1165->71|1193->74|1230->103|1268->104|1300->110|1486->270|1505->281|1535->291|1644->373|1664->384|1696->395|1807->479|1827->490|1861->503|1906->604|1952->622|2071->714|2086->720|2165->777|2406->991|2421->997|2508->1075|2547->1076|2593->1095|2608->1101|2644->1116|2690->1135|2705->1141|2855->1269|2901->1288|2916->1294|3035->1391|3081->1410|3096->1416|3219->1517|3264->1712|3310->1730|3460->1849|3502->1863
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|41->9|41->9|41->9|43->11|43->11|43->11|45->13|45->13|45->13|47->15|48->16|50->18|50->18|50->18|57->25|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|63->31|64->32|65->33|66->34
                  -- GENERATED --
              */
          