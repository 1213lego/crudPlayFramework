
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

object indexBuscar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Estudiante,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(estudiante: Estudiante):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""
"""),_display_(/*2.2*/mainMenu(estudiante.getIdentificacion().toString())/*2.53*/{_display_(Seq[Any](format.raw/*2.54*/("""
    """),format.raw/*3.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.50*/routes/*3.56*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*3.98*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*4.50*/routes/*4.56*/.Assets.versioned("css/bootstrap-theme.min.css")),format.raw/*4.104*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("css/style.css")),format.raw/*5.90*/("""">
    <body>
        <h1>Id: """),_display_(/*7.18*/estudiante/*7.28*/.getIdentificacion()),format.raw/*7.48*/("""</h1>
        <p>Nombres: """),_display_(/*8.22*/estudiante/*8.32*/.getNombres()),format.raw/*8.45*/("""</p>
        <p>Apellidos: """),_display_(/*9.24*/estudiante/*9.34*/.getApellidos()),format.raw/*9.49*/("""</p>
        <p>Semestre: """),_display_(/*10.23*/estudiante/*10.33*/.getSemestre()),format.raw/*10.47*/("""</p>
        <p>                                     </p>
        <a class="btn btn-danger" href=""""),_display_(/*12.42*/routes/*12.48*/.HomeController.eliminar(estudiante.getIdentificacion)),format.raw/*12.102*/("""">Eliminar</a>   <a class="btn btn-primary" href=""""),_display_(/*12.153*/routes/*12.159*/.HomeController.indexList()),format.raw/*12.186*/("""">Regresar</a>
        <p>                                     </p>

        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.versioned("js/jquery-3.3.1.min.js")),format.raw/*15.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*16.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("js/custom.js")),format.raw/*17.62*/("""" type="text/javascript"></script>
    </body>
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(estudiante:Estudiante): play.twirl.api.HtmlFormat.Appendable = apply(estudiante)

  def f:((Estudiante) => play.twirl.api.HtmlFormat.Appendable) = (estudiante) => apply(estudiante)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 27 00:14:31 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/indexBuscar.scala.html
                  HASH: 0abac338011d59677a28be2b0dcf4559c50ff91b
                  MATRIX: 974->1|1093->25|1121->28|1180->79|1218->80|1250->86|1321->131|1335->137|1397->179|1476->232|1490->238|1559->286|1638->339|1652->345|1706->379|1765->412|1783->422|1823->442|1877->470|1895->480|1928->493|1983->522|2001->532|2036->547|2091->575|2110->585|2145->599|2273->700|2288->706|2364->760|2443->811|2459->817|2508->844|2629->938|2644->944|2708->987|2793->1045|2808->1051|2869->1091|2954->1149|2969->1155|3023->1188|3103->1238
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|44->12|44->12|44->12|44->12|44->12|44->12|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|51->19
                  -- GENERATED --
              */
          