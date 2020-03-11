package codility.lessons

object ArraysLesson2 {

  def cyclicRotation() = {

  }


  def oddOccurrencesInArray(a: Array[Int]): Int = {

    val occArr = new Array[Int](10)

    for (i <- 0 to a.length - 1 ) {
      occArr(a(i)) += 1
    }

    (for {
      j <- 0 to occArr.length -1 if (occArr(j) % 2 > 0)
    } yield {
      j
    }).headOption.getOrElse(-1)
  }
}
