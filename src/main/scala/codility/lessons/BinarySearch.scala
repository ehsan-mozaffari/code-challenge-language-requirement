package codility.lessons

import scala.annotation.tailrec

object BinarySearch {

  @tailrec
  def binarySearchRecursive(array: Array[Int], x: Int, left: Int, right: Int): Boolean = {

    lazy val mid = left + ((right - left) / 2)

    if (left > right) false
    else if (array(mid) == x) true
    else if (x < array(mid)) binarySearchRecursive(array, x, left, mid - 1)
    else binarySearchRecursive(array, x, mid + 1, right)
  }

  def binarySearchRec(array: Array[Int], x: Int): Boolean = binarySearchRecursive(array,x, 0, array.length - 1)
}
