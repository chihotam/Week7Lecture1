package tests

import org.scalatest._
import functions.Point

class TestPoint extends FunSuite {
  test("") {
    val point: Point = new Point(1.0,2.0)
    val input: Point = new Point(4.0,1.0)
    val output: Point = point.add(input)
    assert(output.x == 5.0)
    assert(output.y == 3.0)
    val output2: Point = point.multiplyByScalar(2.0)
    assert(output2.x == 2.0)
    assert(output2.y == 4.0)
  }
}
