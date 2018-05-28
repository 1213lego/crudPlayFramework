
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

object mainPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),_display_(/*2.2*/mainMenu("Estudiantes")/*2.25*/{_display_(Seq[Any](format.raw/*2.26*/("""
        """),format.raw/*3.9*/("""<div class="jumbotron">
            <h1>"""),_display_(/*4.18*/title),format.raw/*4.23*/("""</h1>
        </div>
""")))}))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 27 18:02:42 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/viewsEstudiante/mainPage.scala.html
                  HASH: a094374003df2c3328f4047a12457aada1c22bce
                  MATRIX: 967->1|1077->16|1105->19|1136->42|1174->43|1210->53|1278->95|1303->100
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|36->4|36->4
                  -- GENERATED --
              */
          