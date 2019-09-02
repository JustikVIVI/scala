
/**
  * Learning scala ATM, so there is my attempts + some leetcode tasks
  */
object Main {

  def main(args: Array[String]): Unit = {
    val ar = Array.from(List(-4,-1,0,3,10))

    printArray(sortedSquares(ar))
  }

  /**
    * Easy
    * https://leetcode.com/problems/flipping-an-image/
    *
    * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
    * To flip an image horizontally means that each row of the image is reversed.
    * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
    *
    * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
    * For example, inverting [0, 1, 1] results in [1, 0, 0].
    *
    * Runtime: 304 ms, faster than 51.67% of Scala online submissions for Flipping an Image.
    * Memory Usage: 51.2 MB, less than 100.00% of Scala online submissions for Flipping an Image.
    *
    * @param A a binary matrix
    * @return flipped and inverted image
    */
  def flipAndInvertImage(A: Array[Array[Int]]): Array[Array[Int]] = {
    A.map(arr => {
      arr
        .reverse
        .map(a => if (a == 0) 1 else 0)
    }
    )
  }

  /**
    * Easy
    * https://leetcode.com/problems/squares-of-a-sorted-array/
    *
    * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
    * also in sorted non-decreasing order.
    *
    * Runtime: 7240 ms, faster than 60.29% of Scala online submissions for Squares of a Sorted Array.
    * Memory Usage: 56.2 MB, less than 100.00% of Scala online submissions for Squares of a Sorted Array.
    *
    * @param A Given an array of integers
    * @return an array of the squares of each number,  also in sorted non-decreasing order.
    */
  def sortedSquares(A: Array[Int]): Array[Int] = {
    A.map(it => it * it).sorted
  }

  /**
    * Easy
    * https://leetcode.com/problems/defanging-an-ip-address/
    *
    * Given a valid (IPv4) IP address, return a defanged version of that IP address.
    * A defanged IP address replaces every period "." with "[.]".
    *
    * Submitted solution:
    * Runtime: 232 ms, faster than 34.04% of Scala online submissions for Defanging an IP Address.
    * Memory Usage: 43 MB, less than 100.00% of Scala online submissions for Defanging an IP Address.
    *
    * @param address A valid (IPv4) IP address
    * @return defanged version of that IP address
    */
  def defangIPaddr(address: String): String = {
    address.replace(".", "[.]")
  }

  /**
    * Easy
    * https://leetcode.com/problems/sort-array-by-parity/
    *
    * Given an array A of non-negative integers, return an array consisting of all the even elements of A,
    * followed by all the odd elements of A. You may return any answer array that satisfies this condition.
    *
    * Runtime: 1172 ms, faster than 27.94% of Scala online submissions for Sort Array By Parity.
    * Memory Usage: 63.1 MB, less than 100.00% of Scala online submissions for Sort Array By Parity.
    *
    * @param A an array A of non-negative integers
    * @returnan array consisting of all the even elements of A, followed by all the odd elements of A
    */
  def sortArrayByParity(A: Array[Int]): Array[Int] = {
    val even = A.filter(elem => elem % 2 == 0)
    val odd = A.filter(elem => elem % 2 == 1)

    even ++ odd
  }

  /**
    * Easy
    * https://leetcode.com/problems/to-lower-case/
    *
    * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
    *
    * Runtime: 220 ms, faster than 42.61% of Scala online submissions for To Lower Case.
    * Memory Usage: 42.4 MB, less than 100.00% of Scala online submissions for To Lower Case.
    *
    * @param str Input string
    * @return InputString in lower case
    */
  def toLowerCase(str: String): String = {
    str.map(c => c.toLower)
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

