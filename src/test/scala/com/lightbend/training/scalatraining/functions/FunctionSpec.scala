package com.lightbend.training.scalatraining.functions

import org.scalatest.{Matchers, WordSpec}
import com.lightbend.training.scalatraining.functions.Function._
class FunctionSpec extends WordSpec with Matchers{

  "Function" should {
    "True comparing if 10 is greater than 5" in {
      executeFunction(greaterThan, 10, 5) shouldBe true
    }

    "True comparing if 10 is less than 15" in {
      executeFunction(lessThan, 10, 15) shouldBe true
    }

    "Add 10 to 20 result in 30" in {
      executeGenericFunction(sumTen,20) shouldBe 30
    }

    "Say hello to Vicente name" in {
      executeGenericFunction(sayHelloTo,"Vicente") shouldBe "Hello Vicente"
    }

    "Using function that returns a function like sayHiToSomeone" in {
      sayHelloToSomeone("Vicente") shouldBe "Hello Vicente"
    }

    "Using a composition of functions, language english" in {
      greetingSomeone("english", "Vicente", "Ayala") shouldBe "Hello Vicente Ayala"
    }

    "Using a composition of functions, language spanish" in {
      greetingSomeone("spanish", "Martha", "Duque") shouldBe "Hola Martha Duque"
    }

    "Using a composition of functions, language french" in {
      greetingSomeone("french", "Isabel", "Ayala") shouldBe "Salut Isabel Ayala"
    }
  }

}
