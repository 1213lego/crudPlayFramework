
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

object mainMenu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*5.62*/("""
        """),format.raw/*6.9*/("""<title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*7.102*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("css/bootstrap-theme.min.css")),format.raw/*8.108*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("css/style.css")),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">

    </head>
    <body>

        <head>
            <div class="navbar navbar-default">
                <div clas="container">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="exnav">
                        <span classs="icon-bar"></span>
                        <span classs="icon-bar"></span>
                        <span classs="icon-bar"></span>
                    </button>
                    <a href=""""),_display_(/*23.31*/routes/*23.37*/.HomeController.mainPage()),format.raw/*23.63*/("""" class="navbar-brand">Home</a>
                </div>
                <div class="collapse navbar-collapse" id="exnav">
                    <ul class="nav navbar-nav navbar-left">
                        <li><a href=""""),_display_(/*27.39*/routes/*27.45*/.HomeController.indexList()),format.raw/*27.72*/("""">
                                <i class="glyphicon glyphicon-list"></i>
                                Lista Estudiantes</a> </li>

                        <li><a href=""""),_display_(/*31.39*/routes/*31.45*/.HomeController.crear()),format.raw/*31.68*/("""">
                            <i class="glyphicon glyphicon-plus"></i>
                            CrearEstudiante</a> </li>
                    </ul>
                </div>
            </div>
        </head>

        """),format.raw/*40.31*/("""
        """),format.raw/*41.9*/("""<div class="container">
        """),_display_(/*42.10*/content),format.raw/*42.17*/("""
        """),format.raw/*43.9*/("""</div>


        <script src=""""),_display_(/*46.23*/routes/*46.29*/.Assets.versioned("js/jquery-3.3.1.min.js")),format.raw/*46.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*47.23*/routes/*47.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*47.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*48.23*/routes/*48.29*/.Assets.versioned("js/custom.js")),format.raw/*48.62*/("""" type="text/javascript"></script>
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
                  DATE: Sun May 27 00:00:13 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/mainMenu.scala.html
                  HASH: bc91f7f4a7ff5c5d8300b7172c381f7df2924460
                  MATRIX: 972->1|1097->31|1125->33|1207->141|1243->151|1277->159|1302->164|1391->227|1405->233|1468->275|1551->332|1565->338|1634->386|1717->443|1731->449|1785->483|1874->545|1889->551|1950->590|2456->1069|2471->1075|2518->1101|2768->1324|2783->1330|2831->1357|3037->1536|3052->1542|3096->1565|3351->1882|3388->1892|3449->1926|3477->1933|3514->1943|3575->1977|3590->1983|3654->2026|3739->2084|3754->2090|3815->2130|3900->2188|3915->2194|3969->2227
                  LINES: 28->1|33->1|34->2|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|55->23|55->23|55->23|59->27|59->27|59->27|63->31|63->31|63->31|71->40|72->41|73->42|73->42|74->43|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48
                  -- GENERATED --
              */
          