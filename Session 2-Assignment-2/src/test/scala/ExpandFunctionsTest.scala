package com.knoldus.assignment2

import org.scalatest.funsuite.AnyFunSuite

class ExpandFunctionsTest extends AnyFunSuite {
  test("add should return the sum of (10, 11) is 21") {
    assert(ExpandFunctions.add(10, 11) == 21)

  }
  test("add should return the sum of two numbers (0, 0) == 0") {
    assert(ExpandFunctions.add(0, 0) == 0)
  }

  test("add should return the sum of two numbers (-5, 7) == 2") {
    assert(ExpandFunctions.add(-5, 7) == 2)
  }


  test("sumOfList should return the sum of all elements in a list of (4, 5, 6)) == 15") {
    assert(ExpandFunctions.sumOfList(List(4, 5, 6)) == 15)

  }
  test("sumOfList should return the sum of all elements in a list of (-2, 0, 2)) == 0") {
    assert(ExpandFunctions.sumOfList(List(-2, 0, 2)) == 0)

  }
  test("sumOfList should return the sum of all elements in a list of integers List() == 0") {
    assert(ExpandFunctions.sumOfList(List()) == 0)
  }

  test("higherOrderFunction should apply the given function to the given integer (num: Int) => num + num, 10) == 20") {
    assert(ExpandFunctions.higherOrderFunction((num: Int) => num + num, 10) == 20)
  }
  test("higherOrderFunction should apply the given function to the given integer (num: Int) => num * 2, 5) == 10") {
    assert(ExpandFunctions.higherOrderFunction((num: Int) => num * 2, 5) == 10)

  }
  test("higherOrderFunction should apply the given function to the given integer (num: Int) => num / 2, 8) == 4)") {
    assert(ExpandFunctions.higherOrderFunction((num: Int) => num / 2, 8) == 4)
  }
}


