package com.Angelo

import org.scalatest._

class MainSpec extends FlatSpec with Matchers{

  "Main message" should "start with Hello, World" in {

    val message = Main.greet

    message should startWith("Hello, World")
  }

}
