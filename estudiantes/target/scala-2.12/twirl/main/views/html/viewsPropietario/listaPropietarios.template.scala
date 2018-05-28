
package views.html.viewsPropietario

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

object listaPropietarios extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Propietario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaPropietarios : List[Propietario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""
"""),_display_(/*2.2*/main("Lista Propietarios")/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""
    """),format.raw/*3.5*/("""<table class="table table-bordered table-dark">
        <thead>
            <tr>
                <th scope="col">Cedula</th>
                <th scope="col">Nombres</th>
                <th scope="col">Apellidos</th>
            </tr>
        </thead>
        <tbody>


            """),_display_(/*14.14*/for(p <- listaPropietarios) yield /*14.41*/{_display_(Seq[Any](format.raw/*14.42*/("""
                """),format.raw/*15.17*/("""<tr>
                    <th scope="row"><a class="glyphicon glyphicon-eye-open" href=""""),_display_(/*16.84*/routes/*16.90*/.ControladorPropietario.buscar(p.getCedula)),format.raw/*16.133*/("""">"""),_display_(/*16.136*/p/*16.137*/.getCedula),format.raw/*16.147*/("""</a></th>
                    <td>"""),_display_(/*17.26*/p/*17.27*/.getNombres),format.raw/*17.38*/("""</td>
                    <td>"""),_display_(/*18.26*/p/*18.27*/.getApellidos),format.raw/*18.40*/("""</td>
                </tr>
            """)))}),format.raw/*20.14*/("""
        """),format.raw/*21.9*/("""</tbody>
    </table>
""")))}))
      }
    }
  }

  def render(listaPropietarios:List[Propietario]): play.twirl.api.HtmlFormat.Appendable = apply(listaPropietarios)

  def f:((List[Propietario]) => play.twirl.api.HtmlFormat.Appendable) = (listaPropietarios) => apply(listaPropietarios)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 27 23:31:10 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsPropietario/listaPropietarios.scala.html
                  HASH: c38a755a35470491f75bacc3f498c6d027053df7
                  MATRIX: 988->1|1122->40|1150->43|1184->69|1222->70|1254->76|1575->370|1618->397|1657->398|1703->416|1819->505|1834->511|1899->554|1930->557|1941->558|1973->568|2036->604|2046->605|2078->616|2137->648|2147->649|2181->662|2255->705|2292->715
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|46->14|46->14|46->14|47->15|48->16|48->16|48->16|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|52->20|53->21
                  -- GENERATED --
              */
          