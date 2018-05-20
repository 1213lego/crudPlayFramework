
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Estudiante],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaEstudiantes: List[Estudiante]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("Estudiante")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
  """),format.raw/*4.3*/("""<h1>Listado estudiantes!</h1>
    <ul>
    """),_display_(/*6.6*/for(p <- listaEstudiantes) yield /*6.32*/ {_display_(Seq[Any](format.raw/*6.34*/("""
        """),format.raw/*7.9*/("""<li>"""),_display_(/*7.14*/p/*7.15*/.getNombres()),format.raw/*7.28*/("""</li>
    """)))}),format.raw/*8.6*/("""
    """),format.raw/*9.5*/("""</ul>
""")))}),format.raw/*10.2*/("""
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
                  DATE: Fri May 18 12:28:03 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/estudiantes/app/views/index.scala.html
                  HASH: b68b84385f2ea3a8d089d3dc498cc9442ab5c8e1
                  MATRIX: 958->1|1089->37|1119->42|1145->60|1184->62|1214->66|1285->112|1326->138|1365->140|1401->150|1432->155|1441->156|1474->169|1515->181|1547->187|1585->195
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|41->9|42->10
                  -- GENERATED --
              */
          