
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

object indexList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Estudiante],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaEstudiantes: List[Estudiante]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""
    """),_display_(/*2.6*/mainMenu("Estudiante")/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""
        """),format.raw/*3.9*/("""<head>
            <link rel="stylesheet" media="screen" href=""""),_display_(/*4.58*/routes/*4.64*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*4.106*/("""">
            <link rel="stylesheet" media="screen" href=""""),_display_(/*5.58*/routes/*5.64*/.Assets.versioned("css/bootstrap-theme.min.css")),format.raw/*5.112*/("""">
            <link rel="stylesheet" media="screen" href=""""),_display_(/*6.58*/routes/*6.64*/.Assets.versioned("css/style.css")),format.raw/*6.98*/("""">
            <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.63*/routes/*7.69*/.Assets.versioned("images/favicon.png")),format.raw/*7.108*/("""">
            <style>
                    table """),format.raw/*9.27*/("""{"""),format.raw/*9.28*/("""
                        """),format.raw/*10.25*/("""font-family: arial, sans-serif;
                        border-collapse: collapse;
                        width: 100%;
                    """),format.raw/*13.21*/("""}"""),format.raw/*13.22*/("""

                    """),format.raw/*15.21*/("""td, th """),format.raw/*15.28*/("""{"""),format.raw/*15.29*/("""
                        """),format.raw/*16.25*/("""border: 1px solid #dddddd;
                        text-align: left;
                        padding: 8px;
                    """),format.raw/*19.21*/("""}"""),format.raw/*19.22*/("""

                    """),format.raw/*21.21*/("""tr:nth-child(even) """),format.raw/*21.40*/("""{"""),format.raw/*21.41*/("""
                        """),format.raw/*22.25*/("""background-color: #dddddd;
                    """),format.raw/*23.21*/("""}"""),format.raw/*23.22*/("""
            """),format.raw/*24.13*/("""</style>
        </head>
        <body>

            <table>
                <tr>
                    <th>Identificacion  </th>
                    <th>Nombres         </th>
                    <th>Apellidos       </th>
                    <th>Semestre        </th>
                    <th>               </th>
                </tr>
                <h1>Lista Estudiantes!</h1>
                """),_display_(/*37.18*/for(p <- listaEstudiantes) yield /*37.44*/{_display_(Seq[Any](format.raw/*37.45*/("""
                    """),format.raw/*38.21*/("""<tr>
                        <td><a href=""""),_display_(/*39.39*/routes/*39.45*/.HomeController.buscar(p.getIdentificacion)),format.raw/*39.88*/("""">"""),_display_(/*39.91*/p/*39.92*/.getIdentificacion()),format.raw/*39.112*/("""</a></td>
                        <td>"""),_display_(/*40.30*/p/*40.31*/.getNombres()),format.raw/*40.44*/("""</td>
                        <td>"""),_display_(/*41.30*/p/*41.31*/.getApellidos),format.raw/*41.44*/("""</td>
                        <td>"""),_display_(/*42.30*/p/*42.31*/.getSemestre()),format.raw/*42.45*/("""</td>
                        <td> <form action=""""),_display_(/*43.45*/routes/*43.51*/.HomeController.eliminar(p.getIdentificacion)),format.raw/*43.96*/(""""> <input type="submit" value="Eliminar"> </form> </td>
                    </tr>
                """)))}),format.raw/*45.18*/("""
            """),format.raw/*46.13*/("""</table>
            <form action=""""),_display_(/*47.28*/routes/*47.34*/.HomeController.crear()),format.raw/*47.57*/("""">  <input type="submit" value="Crear estudiantes">  </form>

            <script src=""""),_display_(/*49.27*/routes/*49.33*/.Assets.versioned("js/jquery-3.3.1.min.js")),format.raw/*49.76*/("""" type="text/javascript"></script>
            <script src=""""),_display_(/*50.27*/routes/*50.33*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*50.73*/("""" type="text/javascript"></script>
            <script src=""""),_display_(/*51.27*/routes/*51.33*/.Assets.versioned("js/custom.js")),format.raw/*51.66*/("""" type="text/javascript"></script>
        </body>
""")))}),format.raw/*53.2*/("""

"""))
      }
    }
  }

  def render(listaEstudiantes:List[Estudiante]): play.twirl.api.HtmlFormat.Appendable = apply(listaEstudiantes)

  def f:((List[Estudiante]) => play.twirl.api.HtmlFormat.Appendable) = (listaEstudiantes) => apply(listaEstudiantes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 26 21:25:28 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/indexList.scala.html
                  HASH: 61fa514726872fa02cdfffa99ee817fd60d2ada4
                  MATRIX: 978->1|1109->37|1141->44|1171->66|1209->67|1245->77|1336->142|1350->148|1413->190|1500->251|1514->257|1583->305|1670->366|1684->372|1738->406|1830->472|1844->478|1904->517|1982->568|2010->569|2064->595|2235->738|2264->739|2316->763|2351->770|2380->771|2434->797|2592->927|2621->928|2673->952|2720->971|2749->972|2803->998|2879->1046|2908->1047|2950->1061|3384->1468|3426->1494|3465->1495|3515->1517|3586->1561|3601->1567|3665->1610|3695->1613|3705->1614|3747->1634|3814->1674|3824->1675|3858->1688|3921->1724|3931->1725|3965->1738|4028->1774|4038->1775|4073->1789|4151->1840|4166->1846|4232->1891|4364->1992|4406->2006|4470->2043|4485->2049|4529->2072|4646->2162|4661->2168|4725->2211|4814->2273|4829->2279|4890->2319|4979->2381|4994->2387|5048->2420|5132->2474
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|42->10|45->13|45->13|47->15|47->15|47->15|48->16|51->19|51->19|53->21|53->21|53->21|54->22|55->23|55->23|56->24|69->37|69->37|69->37|70->38|71->39|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|77->45|78->46|79->47|79->47|79->47|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|85->53
                  -- GENERATED --
              */
          