
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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*5.54*/routes/*5.60*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*5.102*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("css/bootstrap-theme.min.css")),format.raw/*6.108*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("css/style.css")),format.raw/*7.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""">
        """),format.raw/*9.62*/("""
        """),format.raw/*10.9*/("""<title>"""),_display_(/*10.17*/title),format.raw/*10.22*/("""</title>
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
                    <a href=""""),_display_(/*22.31*/routes/*22.37*/.HomeController.mainPage()),format.raw/*22.63*/("""" class="navbar-brand">Home</a>
                </div>
                <div class="collapse navbar-collapse" id="exnav">
                    <ul class="nav navbar-nav navbar-left">
                        <li><a href=""""),_display_(/*26.39*/routes/*26.45*/.HomeController.indexList()),format.raw/*26.72*/("""">
                                <i class="glyphicon glyphicon-list"></i>
                                Lista Estudiantes</a> </li>

                        <li><a href=""""),_display_(/*30.39*/routes/*30.45*/.HomeController.crear()),format.raw/*30.68*/("""">
                            <i class="glyphicon glyphicon-plus"></i>
                            CrearEstudiante</a> </li>
                    </ul>
                </div>
            </div>
        </head>

        """),format.raw/*39.31*/("""

        """),format.raw/*41.9*/("""<div class="container">
                <h1>"""),_display_(/*42.22*/content),format.raw/*42.29*/("""</h1>
        </div>

        <script src=""""),_display_(/*45.23*/routes/*45.29*/.Assets.versioned("js/jquery-3.3.1.min.js")),format.raw/*45.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*46.23*/routes/*46.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*46.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*47.23*/routes/*47.29*/.Assets.versioned("js/custom.js")),format.raw/*47.62*/("""" type="text/javascript"></script>
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
                  DATE: Sun May 27 18:02:42 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/mainMenu.scala.html
                  HASH: 935e502f57ae54d39dec5fa6a6d99cd180f301a9
                  MATRIX: 972->1|1097->31|1125->33|1251->133|1265->139|1328->181|1411->238|1425->244|1494->292|1577->349|1591->355|1645->389|1733->451|1747->457|1807->496|1846->561|1883->571|1918->579|1944->584|2454->1067|2469->1073|2516->1099|2766->1322|2781->1328|2829->1355|3035->1534|3050->1540|3094->1563|3349->1880|3388->1892|3461->1938|3489->1945|3563->1992|3578->1998|3642->2041|3727->2099|3742->2105|3803->2145|3888->2203|3903->2209|3957->2242
                  LINES: 28->1|33->1|34->2|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|54->22|54->22|54->22|58->26|58->26|58->26|62->30|62->30|62->30|70->39|72->41|73->42|73->42|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47
                  -- GENERATED --
              */
          