package language.basics

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.immutable

class CollectionLanguageBasic extends FlatSpec with Matchers {


  "" should "" in {

  }

  "Create 3 dimensional List" should "" in {

    // lists are homogeneous: the elements of a list all have the same type. The type of a list that
    // has elements of type T is written List[T].

    // First, lists are immutable. Second, lists have a recursive structure (i.e., a linked list),
    // whereas arrays are flat.

    // The list type in Scala is covariant. This means that for each pair of types S and T, if S
    // is a subtype of T, then List[S] is a subtype of List[T].
    val threeDimList = List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )
    threeDimList.size shouldEqual 3

    //    type T = List[String]
    //    val l1 : List[List[String]] = List.empty
    //    val l2:List[T] = List.empty
    //    l1 shouldEqual l2

  }

  "Empty list" should " Nil" in {

    type T = List[List[Int]]
    List.empty[String] shouldEqual Nil
    List.empty[Object] shouldEqual Nil
    List.empty[T] shouldEqual Nil
  }

  "Array constructor" should "return the same as by value." in {

    val intArray1 = new Array[Int](3)
    intArray1(0) = 10
    intArray1(1) = 20
    intArray1(2) = 30

    val intArray2 = Array(10, 20, 30)

    intArray1 shouldEqual intArray2
    intArray1.length shouldEqual intArray2.size
  }

  "List Pattern matching" should "take apart list" in {

    val fruits = List("apple", "orange", "tangerine")
    val List(a, b, c) = fruits

    a shouldEqual "apple"
    b shouldEqual "orange"
    c shouldEqual "tangerine"
  }

  "cons mark" should "put an item to the first element of a list" in {

    val firstList = List(1, 2, 3)
    val secondList = List(4, 5, 6)
    val newInteger = 7
    val firstSecondList = firstList :: secondList
    val newIntAddedList: List[Int] = newInteger :: firstList
    val consList: immutable.Seq[Int] = 1 :: 2 :: 3 :: Nil
    val consListParentheses = 1 :: (2 :: (3 :: Nil))

    firstSecondList shouldEqual List(List(1, 2, 3), 4, 5, 6)
    newIntAddedList shouldEqual List(7, 1, 2, 3)
    consList shouldEqual List(1, 2, 3)
    consList shouldEqual consListParentheses
  }

  "First-order concatenating method" should "cocat two list into one list" in {
    val firstList = List(1, 2, 3)
    val secondList = List(4, 5, 6)
    val firstSecondList: List[Int] = firstList ::: secondList

    firstSecondList shouldEqual List(1,2,3, 4, 5, 6)
  }
}
