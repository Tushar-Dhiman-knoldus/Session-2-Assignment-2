package com.knoldus.assignment2

object ExpandFunctions {

  // val add: (Int, Int) => Int = (num1: Int, num2: Int) => num1 + num2
  // The expanded version of the function is:-

  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    override def apply(num1: Int, num2: Int): Int = num1 + num2
  }

  //val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  // The expanded version of the function is:-

  val sumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int] {
    override def apply(list: List[Int]): Int = list.sum
  }

  //val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => f(num)
  // The expanded version of the function is:-

  val higherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    override def apply(f: Int => Int, num: Int): Int = f(num)
  }


}
