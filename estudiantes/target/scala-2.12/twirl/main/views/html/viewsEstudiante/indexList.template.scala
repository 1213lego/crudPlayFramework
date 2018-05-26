
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

def /*2.2*/content/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.11*/("""
        """),format.raw/*3.9*/("""<head>
            <style>
                    table """),format.raw/*5.27*/("""{"""),format.raw/*5.28*/("""
                        """),format.raw/*6.25*/("""font-family: arial, sans-serif;
                        border-collapse: collapse;
                        width: 100%;
                    """),format.raw/*9.21*/("""}"""),format.raw/*9.22*/("""

                    """),format.raw/*11.21*/("""td, th """),format.raw/*11.28*/("""{"""),format.raw/*11.29*/("""
                        """),format.raw/*12.25*/("""border: 1px solid #dddddd;
                        text-align: left;
                        padding: 8px;
                    """),format.raw/*15.21*/("""}"""),format.raw/*15.22*/("""

                    """),format.raw/*17.21*/("""tr:nth-child(even) """),format.raw/*17.40*/("""{"""),format.raw/*17.41*/("""
                        """),format.raw/*18.25*/("""background-color: #dddddd;
                    """),format.raw/*19.21*/("""}"""),format.raw/*19.22*/("""
            """),format.raw/*20.13*/("""</style>
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
                """),_display_(/*33.18*/for(p <- listaEstudiantes) yield /*33.44*/{_display_(Seq[Any](format.raw/*33.45*/("""
                    """),format.raw/*34.21*/("""<tr>
                        <td><a href=""""),_display_(/*35.39*/routes/*35.45*/.HomeController.buscar(p.getIdentificacion)),format.raw/*35.88*/("""">"""),_display_(/*35.91*/p/*35.92*/.getIdentificacion()),format.raw/*35.112*/("""</a></td>
                        <td>"""),_display_(/*36.30*/p/*36.31*/.getNombres()),format.raw/*36.44*/("""</td>
                        <td>"""),_display_(/*37.30*/p/*37.31*/.getApellidos),format.raw/*37.44*/("""</td>
                        <td>"""),_display_(/*38.30*/p/*38.31*/.getSemestre()),format.raw/*38.45*/("""</td>
                        <td> <form action=""""),_display_(/*39.45*/routes/*39.51*/.HomeController.eliminar(p.getIdentificacion)),format.raw/*39.96*/(""""> <input type="submit" value="Eliminar"> </form> </td>
                    </tr>
                """)))}),format.raw/*41.18*/("""
            """),format.raw/*42.13*/("""</table>
            <form action=""""),_display_(/*43.28*/routes/*43.34*/.HomeController.crear()),format.raw/*43.57*/("""">  <input type="submit" value="Crear estudiantes">  </form>
        </body>
""")))};
Seq[Any](format.raw/*1.38*/("""
"""),format.raw/*45.2*/("""
    """),_display_(/*46.6*/main("Estudiante")/*46.24*/(content)),format.raw/*46.33*/("""
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
                  DATE: Sat May 26 16:26:44 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/indexList.scala.html
                  HASH: 6f4f1f3faff81339783590b9f5488ab38d66a02c
                  MATRIX: 978->1|1092->40|1106->47|1186->49|1222->59|1304->114|1332->115|1385->141|1555->284|1583->285|1635->309|1670->316|1699->317|1753->343|1911->473|1940->474|1992->498|2039->517|2068->518|2122->544|2198->592|2227->593|2269->607|2703->1014|2745->1040|2784->1041|2834->1063|2905->1107|2920->1113|2984->1156|3014->1159|3024->1160|3066->1180|3133->1220|3143->1221|3177->1234|3240->1270|3250->1271|3284->1284|3347->1320|3357->1321|3392->1335|3470->1386|3485->1392|3551->1437|3683->1538|3725->1552|3789->1589|3804->1595|3848->1618|3967->37|3996->1698|4029->1705|4056->1723|4086->1732
                  LINES: 28->1|32->2|32->2|34->2|35->3|37->5|37->5|38->6|41->9|41->9|43->11|43->11|43->11|44->12|47->15|47->15|49->17|49->17|49->17|50->18|51->19|51->19|52->20|65->33|65->33|65->33|66->34|67->35|67->35|67->35|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|73->41|74->42|75->43|75->43|75->43|78->1|79->45|80->46|80->46|80->46
                  -- GENERATED --
              */
          