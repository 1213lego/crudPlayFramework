
package views.html.viewsEstudiante

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

object indexCrear extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Estudiante],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formularioEstudiante: Form[Estudiante]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/mainMenu("Estudiantes")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""


"""),_display_(/*6.2*/helper/*6.8*/.form(action=routes.HomeController.crear())/*6.51*/{_display_(Seq[Any](format.raw/*6.52*/("""
    """),format.raw/*7.5*/("""<h1>Crear un estudiante</h1>
  """),_display_(/*8.4*/helper/*8.10*/.CSRF.formField),format.raw/*8.25*/("""
  """),_display_(/*9.4*/helper/*9.10*/.inputText(formularioEstudiante("identificacion"),'class -> "form-control")),format.raw/*9.85*/("""
  """),_display_(/*10.4*/helper/*10.10*/.inputText(formularioEstudiante("nombres"),'class -> "form-control")),format.raw/*10.78*/("""
  """),_display_(/*11.4*/helper/*11.10*/.inputText(formularioEstudiante("apellidos"),'class ->" form-control")),format.raw/*11.80*/("""
  """),_display_(/*12.4*/helper/*12.10*/.inputText(formularioEstudiante("semestre"),'class -> "form-control")),format.raw/*12.79*/("""
  """),format.raw/*13.3*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus"></i> Crear Estudiante</button>
""")))}),format.raw/*14.2*/("""
    """),_display_(/*15.6*/helper/*15.12*/.form(action=routes.HomeController.search())/*15.56*/{_display_(Seq[Any](format.raw/*15.57*/("""
        """),format.raw/*16.9*/("""<h1>Buscar un Estudiante</h1>
        """),_display_(/*17.10*/helper/*17.16*/.CSRF.formField),format.raw/*17.31*/("""
        """),_display_(/*18.10*/helper/*18.16*/.inputText(formularioEstudiante("Identificacion a buscar"),'class ->"form-control")),format.raw/*18.99*/("""
        """),format.raw/*19.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-search"></i> Bucar</button>
    """)))}),format.raw/*20.6*/("""



""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(formularioEstudiante:Form[Estudiante]): play.twirl.api.HtmlFormat.Appendable = apply(formularioEstudiante)

  def f:((Form[Estudiante]) => play.twirl.api.HtmlFormat.Appendable) = (formularioEstudiante) => apply(formularioEstudiante)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 27 15:55:21 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/indexCrear.scala.html
                  HASH: c8fccb96b81759d912851f640492fd7fc4ebdacc
                  MATRIX: 979->1|1114->41|1144->46|1175->69|1214->71|1246->78|1259->84|1310->127|1348->128|1380->134|1438->167|1452->173|1487->188|1517->193|1531->199|1626->274|1657->279|1672->285|1761->353|1792->358|1807->364|1898->434|1929->439|1944->445|2034->514|2065->518|2210->633|2243->640|2258->646|2311->690|2350->691|2387->701|2454->741|2469->747|2505->762|2543->773|2558->779|2662->862|2699->872|2839->982|2878->991
                  LINES: 28->1|33->1|35->3|35->3|35->3|38->6|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|52->20|56->24
                  -- GENERATED --
              */
          