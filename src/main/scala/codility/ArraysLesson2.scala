package codility

object ArraysLesson2 {

  def cyclicRotation() = {

  }


  def oddOccurrencesInArray(a: Array[Int]): Int = {

    val accuranceArray = new Array[Int](10)

    for (i <- 0 to a.length - 1 ) {
      accuranceArray(a(i)) += 1
    }

    (for {
      j <- 0 to accuranceArray.length -1 if (accuranceArray(j) % 2 > 0)
    } yield {
      j
    }).headOption.getOrElse(-1)
  }
}
