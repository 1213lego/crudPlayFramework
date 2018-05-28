
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*14.102*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("css/bootstrap-theme.min.css")),format.raw/*15.108*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("public/css/style.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">

    </head>
    <body>
        """),format.raw/*22.32*/("""
        """),format.raw/*23.9*/("""<div class="container">
        """),_display_(/*24.10*/content),format.raw/*24.17*/("""
        """),format.raw/*25.9*/("""</div>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("js/jquery-3.3.1.min.js")),format.raw/*26.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*27.23*/routes/*27.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*27.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("js/custom.js")),format.raw/*28.62*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 27 15:55:21 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/main.scala.html
                  HASH: 8062cb2e4c604b9c128e3168e0444e6067e76ac2
                  MATRIX: 1227->266|1352->296|1382->300|1465->408|1502->418|1537->426|1563->431|1653->494|1668->500|1732->542|1816->599|1831->605|1901->653|1985->710|2000->716|2063->757|2152->819|2167->825|2228->864|2295->994|2332->1004|2393->1038|2421->1045|2458->1055|2515->1085|2530->1091|2594->1134|2679->1192|2694->1198|2755->1238|2840->1296|2855->1302|2909->1335
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|52->22|53->23|54->24|54->24|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28
                  -- GENERATED --
              */
          