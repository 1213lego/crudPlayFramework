
package views.html

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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("css/style.css")),format.raw/*16.94*/("""">

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.59*/routes/*18.65*/.Assets.versioned("images/favicon.png")),format.raw/*18.104*/("""">

    </head>
    <body>

        <nav class="navbar navbar-default navbar-dark bg-dark">
            <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*33.52*/routes/*33.58*/.ControladorPropietario.index()),format.raw/*33.89*/("""">Home</a>
                </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href=""""),_display_(/*39.39*/routes/*39.45*/.ControladorPropietario.listaPropietarios()),format.raw/*39.88*/(""""> <i class="glyphicon glyphicon-list"></i>Lista Propietarios <span class="sr-only">(current)</span></a></li>
                        <li><a href=""""),_display_(/*40.39*/routes/*40.45*/.ControladorPropietario.indexCrear()),format.raw/*40.81*/(""""><i class="glyphicon glyphicon-plus"></i>Crear Propietarios</a></li>
                        <li><a href=""""),_display_(/*41.39*/routes/*41.45*/.ControladorPropietario.buscarProp()),format.raw/*41.81*/(""""><i class="glyphicon glyphicon-search"></i>Buscar Propietarios</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-list"></i>Lista Vehiculos</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Separated link</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                    </ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        """),format.raw/*62.32*/("""
        """),format.raw/*63.9*/("""<div class="container">
        """),_display_(/*64.10*/content),format.raw/*64.17*/("""
        """),format.raw/*65.9*/("""</div>

        <script src=""""),_display_(/*67.23*/routes/*67.29*/.Assets.versioned("js/jquery-3.3.1.min.js")),format.raw/*67.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*68.23*/routes/*68.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*68.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*69.23*/routes/*69.29*/.Assets.versioned("js/custom.js")),format.raw/*69.62*/("""" type="text/javascript"></script>
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
                  DATE: Sun May 27 23:29:00 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/main.scala.html
                  HASH: e025166e8dd3fc87a14b091be6477fef52d23770
                  MATRIX: 1211->266|1336->296|1366->300|1449->408|1486->418|1521->426|1547->431|1637->494|1652->500|1716->542|1800->599|1815->605|1885->653|1969->710|1984->716|2039->750|2130->814|2145->820|2206->859|2991->1617|3006->1623|3058->1654|3391->1960|3406->1966|3470->2009|3646->2158|3661->2164|3718->2200|3854->2309|3869->2315|3926->2351|5163->3651|5200->3661|5261->3695|5289->3702|5326->3712|5385->3744|5400->3750|5464->3793|5549->3851|5564->3857|5625->3897|5710->3955|5725->3961|5779->3994
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|64->33|64->33|64->33|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|92->62|93->63|94->64|94->64|95->65|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69
                  -- GENERATED --
              */
          