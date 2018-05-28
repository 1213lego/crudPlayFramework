
package views.html.viewsVehiculo

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

object listaVehiculos extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Vehiculo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaVehiculos : List[Vehiculo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""
"""),_display_(/*2.2*/main("Lista Propietarios")/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""
    """),format.raw/*3.5*/("""<table class="table table-bordered table-dark">
        <thead>
            <tr>
                <th scope="col">Placa</th>
                <th scope="col">Cedula Propietario</th>
                <th scope="col">Marca</th>
                <th scope="col">Modelo</th>
                <th scope="col">Tipo</th>
                <th scope="col">Cantidad Pasajeros</th>
            </tr>
        </thead>
        <tbody>


            """),_display_(/*17.14*/for(p <- listaVehiculos) yield /*17.38*/{_display_(Seq[Any](format.raw/*17.39*/("""
                """),format.raw/*18.17*/("""<tr>
                    <th scope="row"><a class="glyphicon glyphicon-eye-open" href=""""),_display_(/*19.84*/routes/*19.90*/.ControladorVehiculo.buscarVehiculo(p.getPlaca)),format.raw/*19.137*/("""">"""),_display_(/*19.140*/p/*19.141*/.getPlaca),format.raw/*19.150*/("""</a></th>
                    <td><a class="glyphicon glyphicon-eye-open" href=""""),_display_(/*20.72*/routes/*20.78*/.ControladorPropietario.buscar(p.getPropietario().getCedula())),format.raw/*20.140*/("""">"""),_display_(/*20.143*/p/*20.144*/.getPropietario().getCedula()),format.raw/*20.173*/("""</a></td>
                    <td>"""),_display_(/*21.26*/p/*21.27*/.getMarca),format.raw/*21.36*/("""</td>
                    <td>"""),_display_(/*22.26*/p/*22.27*/.getModelo),format.raw/*22.37*/("""</td>
                    <td>"""),_display_(/*23.26*/p/*23.27*/.getTipo),format.raw/*23.35*/("""</td>
                    <td>"""),_display_(/*24.26*/p/*24.27*/.getPasajeros),format.raw/*24.40*/("""</td>
                </tr>
            """)))}),format.raw/*26.14*/("""
        """),format.raw/*27.9*/("""</tbody>
    </table>
""")))}))
      }
    }
  }

  def render(listaVehiculos:List[Vehiculo]): play.twirl.api.HtmlFormat.Appendable = apply(listaVehiculos)

  def f:((List[Vehiculo]) => play.twirl.api.HtmlFormat.Appendable) = (listaVehiculos) => apply(listaVehiculos)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 12:34:40 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsVehiculo/listaVehiculos.scala.html
                  HASH: 9dabbe543af7e8389d13d8835d22d211eb5c1b6f
                  MATRIX: 979->1|1107->34|1135->37|1169->63|1207->64|1239->70|1711->515|1751->539|1790->540|1836->558|1952->647|1967->653|2036->700|2067->703|2078->704|2109->713|2218->795|2233->801|2317->863|2348->866|2359->867|2410->896|2473->932|2483->933|2513->942|2572->974|2582->975|2613->985|2672->1017|2682->1018|2711->1026|2770->1058|2780->1059|2814->1072|2888->1115|2925->1125
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|49->17|49->17|49->17|50->18|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|58->26|59->27
                  -- GENERATED --
              */
          