
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

            <style>
                    table """),format.raw/*6.27*/("""{"""),format.raw/*6.28*/("""
                        """),format.raw/*7.25*/("""font-family: arial, sans-serif;
                        border-collapse: collapse;
                        width: 100%;
                    """),format.raw/*10.21*/("""}"""),format.raw/*10.22*/("""

                    """),format.raw/*12.21*/("""td, th """),format.raw/*12.28*/("""{"""),format.raw/*12.29*/("""
                        """),format.raw/*13.25*/("""border: 1px solid #dddddd;
                        text-align: left;
                        padding: 8px;
                    """),format.raw/*16.21*/("""}"""),format.raw/*16.22*/("""

                    """),format.raw/*18.21*/("""tr:nth-child(even) """),format.raw/*18.40*/("""{"""),format.raw/*18.41*/("""
                        """),format.raw/*19.25*/("""background-color: #dddddd;
                    """),format.raw/*20.21*/("""}"""),format.raw/*20.22*/("""
            """),format.raw/*21.13*/("""</style>
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
                """),_display_(/*34.18*/for(p <- listaEstudiantes) yield /*34.44*/{_display_(Seq[Any](format.raw/*34.45*/("""
                    """),format.raw/*35.21*/("""<tr>
                        <td><a href=""""),_display_(/*36.39*/routes/*36.45*/.HomeController.buscar(p.getIdentificacion)),format.raw/*36.88*/("""">"""),_display_(/*36.91*/p/*36.92*/.getIdentificacion()),format.raw/*36.112*/("""</a></td>
                        <td>"""),_display_(/*37.30*/p/*37.31*/.getNombres()),format.raw/*37.44*/("""</td>
                        <td>"""),_display_(/*38.30*/p/*38.31*/.getApellidos),format.raw/*38.44*/("""</td>
                        <td>"""),_display_(/*39.30*/p/*39.31*/.getSemestre()),format.raw/*39.45*/("""</td>
                        <td> <form action=""""),_display_(/*40.45*/routes/*40.51*/.HomeController.eliminar(p.getIdentificacion)),format.raw/*40.96*/(""""> <input type="submit" value="Eliminar"> </form> </td>
                    </tr>
                """)))}),format.raw/*42.18*/("""
            """),format.raw/*43.13*/("""</table>
            <form action=""""),_display_(/*44.28*/routes/*44.34*/.HomeController.crear()),format.raw/*44.57*/("""">  <input type="submit" value="Crear estudiantes">  </form>


        </body>
""")))}),format.raw/*48.2*/("""

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
                  DATE: Sun May 27 15:55:21 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/indexList.scala.html
                  HASH: 82f83702f35ed6faa14762d0eff25475b1e59391
                  MATRIX: 978->1|1109->37|1141->44|1171->66|1209->67|1245->77|1329->134|1357->135|1410->161|1581->304|1610->305|1662->329|1697->336|1726->337|1780->363|1938->493|1967->494|2019->518|2066->537|2095->538|2149->564|2225->612|2254->613|2296->627|2730->1034|2772->1060|2811->1061|2861->1083|2932->1127|2947->1133|3011->1176|3041->1179|3051->1180|3093->1200|3160->1240|3170->1241|3204->1254|3267->1290|3277->1291|3311->1304|3374->1340|3384->1341|3419->1355|3497->1406|3512->1412|3578->1457|3710->1558|3752->1572|3816->1609|3831->1615|3875->1638|3989->1722
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|38->6|38->6|39->7|42->10|42->10|44->12|44->12|44->12|45->13|48->16|48->16|50->18|50->18|50->18|51->19|52->20|52->20|53->21|66->34|66->34|66->34|67->35|68->36|68->36|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|74->42|75->43|76->44|76->44|76->44|80->48
                  -- GENERATED --
              */
          