
/**
  * Learning scala ATM, so there is my attempts + some leetcode tasks
  */
object Main {

  def main(args: Array[String]): Unit = {
    val leetcodeTasks = new LeetCodeTasks()
    val ar = Array.from(List(-4,-1,0,3,10))

    printArray(leetcodeTasks.sortedSquares(ar))
  }

  //some support functions
  def printArray[A](arr: Array[Array[A]]): Unit = {
    for (a <- arr) {
      for (ar <- a) {
        print(ar + " ")
      }
      println()
    }
  }

  def printArray[A](arr: Array[A]): Unit = {
    for (ar <- arr) {
      print(ar + " ")
    }
    println()
  }
}

