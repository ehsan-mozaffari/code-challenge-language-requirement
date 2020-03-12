package codility.lessons

import org.scalatest.{FlatSpec, Matchers}

class BinarySearchSpec extends FlatSpec with Matchers{

  "binarySearchRec" should "search rec" in {

    val testArr = Array(9,6,4,5,3,1,2)
    BinarySearch.binarySearchRec(testArr.sorted, 10) shouldEqual false
    BinarySearch.binarySearchRec(testArr.sorted, 4) shouldEqual true
  }
}
