package basics.scala.fundamentals.arrays

import org.scalatest.FunSuite

import scala.language.postfixOps

class SetRiviewTest extends FunSuite{

  val set = Set(1,2,3,4,5)
  val set2 = Set(3,4,5,6,7,8)

  test("Set.contains"){
    assert(set.contains(2))
  }

  test("Set.&"){
    val setResult: Set[Int] = set & set2
    println(setResult)
    assert(setResult.contains(5))
    assert(setResult.size == 3)
  }

  test("Set.count"){
    val greaterThan2: Int = set.count(num => num > 2)
    assert(greaterThan2==3)
  }

  test("Set.diff"){
    val setResultDiff: Set[Int] = set.diff(set2)
    assert(setResultDiff.size == 2)
    assert(setResultDiff.head == 1)
    assert(setResultDiff.last == 2)
  }

  test("Set.iterator"){
    val iterator: Iterator[Int] = set.iterator
    iterator.foreach(num => print(num))
  }

  test("Set.map"){
    val setResult = set.map(num => num * num)
    print(setResult)
    assert(setResult.contains(25))
  }

  test("Set.product"){
    val setProduct: Int = set.product
    println(setProduct)
    assert(120 == setProduct)
  }


}
