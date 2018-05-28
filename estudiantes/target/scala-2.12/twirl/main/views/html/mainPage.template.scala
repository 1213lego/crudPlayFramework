
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
    """),format.raw/*3.5*/("""<div class="jumbotron">
        <h1>"""),_display_(/*4.14*/s),format.raw/*4.15*/("""</h1>
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
                  DATE: Sun May 27 18:35:39 COT 2018
                  SOURCE: C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/app/views/mainPage.scala.html
                  HASH: dbabe314210426ec24eae56dfd744dbe1dc9bbbe
                  MATRIX: 951->1|1058->13|1086->16|1100->23|1138->24|1170->30|1234->68|1255->69
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|36->4|36->4
                  -- GENERATED --
              */
          