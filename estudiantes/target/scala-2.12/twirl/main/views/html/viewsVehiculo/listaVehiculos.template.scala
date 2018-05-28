
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

    """),format.raw/*4.5*/("""<div class="jumbotron">

        <table class="table table-bordered table-dark">
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


            """),_display_(/*20.14*/for(p <- listaVehiculos) yield /*20.38*/{_display_(Seq[Any](format.raw/*20.39*/("""
                """),format.raw/*21.17*/("""<tr>
                    <th scope="row"><a class="glyphicon glyphicon-eye-open" href=""""),_display_(/*22.84*/routes/*22.90*/.ControladorVehiculo.buscarVehiculo(p.getPlaca)),format.raw/*22.137*/("""">"""),_display_(/*22.140*/p/*22.141*/.getPlaca),format.raw/*22.150*/("""</a></th>
                    <td><a class="glyphicon glyphicon-eye-open" href=""""),_display_(/*23.72*/routes/*23.78*/.ControladorPropietario.buscar(p.getPropietario().getCedula())),format.raw/*23.140*/("""">"""),_display_(/*23.143*/p/*23.144*/.getPropietario().getCedula()),format.raw/*23.173*/("""</a></td>
                    <td>"""),_display_(/*24.26*/p/*24.27*/.getMarca),format.raw/*24.36*/("""</td>
                    <td>"""),_display_(/*25.26*/p/*25.27*/.getModelo),format.raw/*25.37*/("""</td>
                    <td>"""),_display_(/*26.26*/p/*26.27*/.getTipo),format.raw/*26.35*/("""</td>
                    <td>"""),_display_(/*27.26*/p/*27.27*/.getPasajeros),format.raw/*27.40*/("""</td>
                </tr>
            """)))}),format.raw/*29.14*/("""
            """),format.raw/*30.13*/("""</tbody>
        </table>


    </div>


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
                  DATE: Mon May 28 13:13:36 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsVehiculo/listaVehiculos.scala.html
                  HASH: e1a27a3b5577f4c2c27e539a540acb186b8160f5
                  MATRIX: 979->1|1107->34|1135->37|1169->63|1207->64|1241->72|1792->596|1832->620|1871->621|1917->639|2033->728|2048->734|2117->781|2148->784|2159->785|2190->794|2299->876|2314->882|2398->944|2429->947|2440->948|2491->977|2554->1013|2564->1014|2594->1023|2653->1055|2663->1056|2694->1066|2753->1098|2763->1099|2792->1107|2851->1139|2861->1140|2895->1153|2969->1196|3011->1210
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|52->20|52->20|52->20|53->21|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|61->29|62->30
                  -- GENERATED --
              */
          