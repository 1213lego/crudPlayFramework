
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

"""),_display_(/*3.2*/main("Estudiantes")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),_display_(/*4.2*/helper/*4.8*/.form(action=routes.HomeController.crear())/*4.51*/{_display_(Seq[Any](format.raw/*4.52*/("""
    """),format.raw/*5.5*/("""<h1>Crear un estudiante</h1>
  """),_display_(/*6.4*/helper/*6.10*/.CSRF.formField),format.raw/*6.25*/("""
  """),_display_(/*7.4*/helper/*7.10*/.inputText(formularioEstudiante("Identificacion"))),format.raw/*7.60*/("""
  """),_display_(/*8.4*/helper/*8.10*/.inputText(formularioEstudiante("Nombres"))),format.raw/*8.53*/("""
  """),_display_(/*9.4*/helper/*9.10*/.inputText(formularioEstudiante("Apellidos"))),format.raw/*9.55*/("""
  """),_display_(/*10.4*/helper/*10.10*/.inputText(formularioEstudiante("Semestre"))),format.raw/*10.54*/("""
  """),format.raw/*11.3*/("""<input type="submit" value="Crear"/>
""")))}),format.raw/*12.2*/("""
    """),_display_(/*13.6*/helper/*13.12*/.form(action=routes.HomeController.search())/*13.56*/{_display_(Seq[Any](format.raw/*13.57*/("""
        """),format.raw/*14.9*/("""<h1>Buscar un Estudiante</h1>
        """),_display_(/*15.10*/helper/*15.16*/.CSRF.formField),format.raw/*15.31*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputText(formularioEstudiante("Identificacion a buscar"))),format.raw/*16.75*/("""
        """),format.raw/*17.9*/("""<input type="submit" value="Buscar"/>
    """)))}),format.raw/*18.6*/("""
""")))}),format.raw/*19.2*/("""
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
                  DATE: Sat May 26 10:40:13 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/indexCrear.scala.html
                  HASH: 6690b29951f65d8fa78e8facb59046e9059d996e
                  MATRIX: 979->1|1114->41|1144->46|1171->65|1210->67|1238->70|1251->76|1302->119|1340->120|1372->126|1430->159|1444->165|1479->180|1509->185|1523->191|1593->241|1623->246|1637->252|1700->295|1730->300|1744->306|1809->351|1840->356|1855->362|1920->406|1951->410|2020->449|2053->456|2068->462|2121->506|2160->507|2197->517|2264->557|2279->563|2315->578|2353->589|2368->595|2448->654|2485->664|2559->708|2592->711
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|44->12|45->13|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|50->18|51->19
                  -- GENERATED --
              */
          