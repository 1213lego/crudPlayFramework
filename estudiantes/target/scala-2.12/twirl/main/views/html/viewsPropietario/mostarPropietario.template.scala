
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
                <a class="btn btn-success" href="#" contenteditable="false">
                    <i class="glyphicon glyphicon-trash"></i>
                    Eliminar
                </a>

            </div>
            <div class="col-sm-8">
            """),_display_(/*25.14*/helper/*25.20*/.form(action = routes.ControladorPropietario.index())/*25.73*/{_display_(Seq[Any](format.raw/*25.74*/("""
                """),_display_(/*26.18*/helper/*26.24*/.CSRF.formField),format.raw/*26.39*/("""
                """),format.raw/*27.17*/("""<p class="h2">Cedula: """),_display_(/*27.40*/propietario/*27.51*/.getCedula),format.raw/*27.61*/("""</p>
                """),_display_(/*28.18*/helper/*28.24*/.inputText(formularioPropietarios("nombres"),'class -> "form-control", 'placeholder -> "nombres",'readonly ->"true")),format.raw/*28.140*/("""
                """),_display_(/*29.18*/helper/*29.24*/.inputText(formularioPropietarios("apellidos"),'class -> "form-control", 'placeholder -> "apellidos")),format.raw/*29.125*/("""

          """),format.raw/*31.161*/("""
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
                  DATE: Mon May 28 00:20:26 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsPropietario/mostarPropietario.scala.html
                  HASH: aa4e449a9546ab353763190e1fe17ad062891d2c
                  MATRIX: 1000->1|1165->71|1193->74|1230->103|1268->104|1300->110|1486->270|1505->281|1535->291|1644->373|1664->384|1696->395|1807->479|1827->490|1861->503|1906->604|1952->622|2285->928|2300->934|2362->987|2401->988|2447->1007|2462->1013|2498->1028|2544->1046|2594->1069|2614->1080|2645->1090|2695->1113|2710->1119|2848->1235|2894->1254|2909->1260|3032->1361|3075->1525|3121->1543|3271->1662|3313->1676
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|41->9|41->9|41->9|43->11|43->11|43->11|45->13|45->13|45->13|47->15|48->16|57->25|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|63->31|64->32|65->33|66->34
                  -- GENERATED --
              */
          