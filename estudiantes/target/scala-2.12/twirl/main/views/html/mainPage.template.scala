
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

object mainPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(s : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""
"""),_display_(/*2.2*/main(s)/*2.9*/{_display_(Seq[Any](format.raw/*2.10*/("""

    """),format.raw/*4.5*/("""<div class="jumbotron">
        <h1>"""),_display_(/*5.14*/s),format.raw/*5.15*/("""</h1>
    </div>
""")))}))
      }
    }
  }

  def render(s:String): play.twirl.api.HtmlFormat.Appendable = apply(s)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (s) => apply(s)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 14:31:12 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/mainPage.scala.html
                  HASH: 873fe7f4e79c7b26b4ca686900ae379d56b15148
                  MATRIX: 951->1|1058->13|1086->16|1100->23|1138->24|1172->32|1236->70|1257->71
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|37->5|37->5
                  -- GENERATED --
              */
          