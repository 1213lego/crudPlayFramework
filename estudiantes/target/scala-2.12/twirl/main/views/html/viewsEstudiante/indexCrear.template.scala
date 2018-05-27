
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
    """),format.raw/*4.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.50*/routes/*4.56*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*4.98*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("css/bootstrap-theme.min.css")),format.raw/*5.104*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Assets.versioned("css/style.css")),format.raw/*6.90*/("""">

"""),_display_(/*8.2*/helper/*8.8*/.form(action=routes.HomeController.crear())/*8.51*/{_display_(Seq[Any](format.raw/*8.52*/("""
    """),format.raw/*9.5*/("""<h1>Crear un estudiante</h1>
  """),_display_(/*10.4*/helper/*10.10*/.CSRF.formField),format.raw/*10.25*/("""
  """),_display_(/*11.4*/helper/*11.10*/.inputText(formularioEstudiante("Identificacion"),'class -> "form-control")),format.raw/*11.85*/("""
  """),_display_(/*12.4*/helper/*12.10*/.inputText(formularioEstudiante("Nombres"),'class -> "form-control")),format.raw/*12.78*/("""
  """),_display_(/*13.4*/helper/*13.10*/.inputText(formularioEstudiante("Apellidos"),'class ->" form-control")),format.raw/*13.80*/("""
  """),_display_(/*14.4*/helper/*14.10*/.inputText(formularioEstudiante("Semestre"),'class -> "form-control")),format.raw/*14.79*/("""
  """),format.raw/*15.3*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus"></i> Crear Estudiante</button>
""")))}),format.raw/*16.2*/("""
    """),_display_(/*17.6*/helper/*17.12*/.form(action=routes.HomeController.search())/*17.56*/{_display_(Seq[Any](format.raw/*17.57*/("""
        """),format.raw/*18.9*/("""<h1>Buscar un Estudiante</h1>
        """),_display_(/*19.10*/helper/*19.16*/.CSRF.formField),format.raw/*19.31*/("""
        """),_display_(/*20.10*/helper/*20.16*/.inputText(formularioEstudiante("Identificacion a buscar"),'class ->"form-control")),format.raw/*20.99*/("""
        """),format.raw/*21.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-search"></i> Bucar</button>
    """)))}),format.raw/*22.6*/("""

    """),format.raw/*24.5*/("""<script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("js/jquery-3.3.1.min.js")),format.raw/*24.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*25.19*/routes/*25.25*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*25.65*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*26.19*/routes/*26.25*/.Assets.versioned("js/custom.js")),format.raw/*26.58*/("""" type="text/javascript"></script>

""")))}),format.raw/*28.2*/("""
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
                  DATE: Sun May 27 00:00:27 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/indexCrear.scala.html
                  HASH: f085d66d31eb1b077390102a27e727e397828f0b
                  MATRIX: 979->1|1114->41|1144->46|1175->69|1214->71|1246->77|1317->122|1331->128|1393->170|1472->223|1486->229|1555->277|1634->330|1648->336|1702->370|1734->377|1747->383|1798->426|1836->427|1868->433|1927->466|1942->472|1978->487|2009->492|2024->498|2120->573|2151->578|2166->584|2255->652|2286->657|2301->663|2392->733|2423->738|2438->744|2528->813|2559->817|2704->932|2737->939|2752->945|2805->989|2844->990|2881->1000|2948->1040|2963->1046|2999->1061|3037->1072|3052->1078|3156->1161|3193->1171|3333->1281|3368->1289|3409->1303|3424->1309|3488->1352|3569->1406|3584->1412|3645->1452|3726->1506|3741->1512|3795->1545|3864->1584
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|40->8|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|48->16|49->17|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|54->22|56->24|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|60->28
                  -- GENERATED --
              */
          