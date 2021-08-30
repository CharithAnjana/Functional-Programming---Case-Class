object CaseClass extends App{
  val p1 = Point(1,2)
  val p2 = Point(4,5)

  val p3 = p1 + p2
  val p4 = p1.move(1,1)
  val d:Double = p2.distance(p1)
  val p5 = p1.invert()

  println("Addition")
  println(p3)
  println()

  println("Move")
  println(p4)
  println()

  println("Distance")
  println(d)
  println()

  println("Invert")
  println(p5)
  println()

}

case class Point(a:Int, b:Int ){
  def x:Int = a
  def y:Int = b

  def +(p:Point) = Point(this.x + p.x, this.y + p.y)
  def move(dx:Int, dy:Int) = Point(this.x + dx, this.y + dy)
  def distance(p:Point) = Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2))
  def invert() = Point(this.y, this.x)
}
