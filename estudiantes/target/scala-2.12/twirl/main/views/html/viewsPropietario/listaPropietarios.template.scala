
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

    """),format.raw/*4.5*/("""<div class="jumbotron">

        <table class="table table-bordered table-dark">
            <thead>
                <tr>
                    <th scope="col">Cedula</th>
                    <th scope="col">Nombres</th>
                    <th scope="col">Apellidos</th>
                </tr>
            </thead>
            <tbody>


            """),_display_(/*17.14*/for(p <- listaPropietarios) yield /*17.41*/{_display_(Seq[Any](format.raw/*17.42*/("""
                """),format.raw/*18.17*/("""<tr>
                    <th scope="row"><a class="glyphicon glyphicon-eye-open" href=""""),_display_(/*19.84*/routes/*19.90*/.ControladorPropietario.buscar(p.getCedula)),format.raw/*19.133*/("""">"""),_display_(/*19.136*/p/*19.137*/.getCedula),format.raw/*19.147*/("""</a></th>
                    <td>"""),_display_(/*20.26*/p/*20.27*/.getNombres),format.raw/*20.38*/("""</td>
                    <td>"""),_display_(/*21.26*/p/*21.27*/.getApellidos),format.raw/*21.40*/("""</td>
                </tr>
            """)))}),format.raw/*23.14*/("""
            """),format.raw/*24.13*/("""</tbody>
        </table>


    </div>

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
                  DATE: Mon May 28 13:12:22 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsPropietario/listaPropietarios.scala.html
                  HASH: 8d28edb8bae547c1a17d96ca39b28d001fd3e268
                  MATRIX: 988->1|1122->40|1150->43|1184->69|1222->70|1256->78|1644->439|1687->466|1726->467|1772->485|1888->574|1903->580|1968->623|1999->626|2010->627|2042->637|2105->673|2115->674|2147->685|2206->717|2216->718|2250->731|2324->774|2366->788
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|49->17|49->17|49->17|50->18|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|55->23|56->24
                  -- GENERATED --
              */
          