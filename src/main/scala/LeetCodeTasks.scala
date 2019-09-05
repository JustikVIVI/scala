class LeetCodeTasks {

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

  /**
    * Medium
    *
    * https://leetcode.com/problems/max-increase-to-keep-city-skyline/
    *
    * In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there. We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). Height 0 is considered to be a building as well.
    *
    * At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.
    *
    * What is the maximum total sum that the height of the buildings can be increased?
    *
    * Runtime: 304 ms, faster than 82.35% of Scala online submissions for Max Increase to Keep City Skyline.
    * Memory Usage: 51.5 MB, less than 100.00% of Scala online submissions for Max Increase to Keep City Skyline.
    *
    * @param grid 2 dimensional array grid, each value grid[i][j] represents the height of a building located there
    * @return maximum total sum that the height of the buildings can be increased
    */
  def maxIncreaseKeepingSkyline(grid: Array[Array[Int]]): Int = {
    val horizontalView = new Array[Int](grid.length)
    val verticalView = new Array[Int](grid(0).length)

    var counter = 0

    for (i <- grid.indices) {
      horizontalView(i) = grid(i).max
    }

    for (i <- grid(0).indices) {
      verticalView(i) = getCol(i, grid).max
    }

    for (i <- grid.indices; j <- grid(0).indices) {
      val min = Math.min(verticalView(j), horizontalView(i))
      counter = counter + min - grid(i)(j)
    }
    counter
  }

  private def getCol(n: Int, a: Array[Array[Int]]) = a.map{_(n)}

  /**
    * Medium
    *
    * FIXME: NOT WORKING ATM
    *
    * Given an array nums of n integers where n > 1,
    * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
    *
    * Note: Please solve it without division and in O(n).
    *
    * @param nums array nums of n integers where n > 1
    * @return an array output such that output[i] is equal to the product of all the elements of nums except nums[i]
    */
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val left = Array.fill(nums.length){ 1 }
    val right = Array.fill(nums.length){ 1 }
    val answer = Array.fill(nums.length){ 1 }

    left(0) = 1
    for (i <- 1 until nums.length) {
      left(i) = nums(i - 1) * left(i - 1)
    }

    right(nums.length - 1) = 1
    for (i <- nums.length - 2 until  0 by -1) {
      right(i) = nums(i + 1) * right(i + 1)
    }

    for (i <- nums.indices) {
      answer(i) = left(i) * right(i)
    }

    answer
  }
}
