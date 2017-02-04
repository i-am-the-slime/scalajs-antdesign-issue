package example

import japgolly.scalajs.react.ReactComponentB
import org.scalajs.dom
import shared.SharedMessages
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js
import org.scalajs.dom.document

import scalajs.antdesign.Input

object ScalaJSExample extends js.JSApp {
  val component = ReactComponentB[String]("Hello")
    .render_P{name =>
      <.div("Hello there ", name)(
        Input(defaultValue = name)()
      )
    }
    .build


  def main(): Unit = {
    val content = document.getElementById("react-container")

    ReactDOM.render(component("Test"), content)

    dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks
  }
}
