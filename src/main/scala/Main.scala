
/**
  * Learning scala ATM, so there is my attempts + some leetcode tasks
  */
object Main {

  def main(args: Array[String]): Unit = {
    val leetcodeTasks = new LeetCodeTasks()
    val ar1 = Array.from(List(3,0,8,4))
    val ar2 = Array.from(List(2,4,5,7))
    val ar3 = Array.from(List(9,2,6,3))
    val ar4 = Array.from(List(1,2,3,4))

    printArray(leetcodeTasks.productExceptSelf(ar4))
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

