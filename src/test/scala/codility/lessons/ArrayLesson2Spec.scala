package codility.lessons

import org.scalatest.{FlatSpec, Matchers}

class ArrayLesson2Spec extends FlatSpec with Matchers{

  "oddOccurrencesInArray" should "return the odd number" in {

    ArraysLesson2.oddOccurrencesInArray(Array(9,3,9,3,7,9)) shouldEqual 7
    ArraysLesson2.oddOccurrencesInArray(Array(9,3,9,3,7,9,7,9)) shouldEqual -1
  }
}
