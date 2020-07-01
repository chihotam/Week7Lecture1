package functions

class Point(val x: Double, val y: Double) {
  def add(point: Point): Point = {
    val newPoint: Point = new Point(x+point.x, y+point.y)
    newPoint
  }
  def multiplyByScalar(num: Double): Point = {
    val newPoint: Point = new Point(x*num, y*num)
    newPoint
  }
}
