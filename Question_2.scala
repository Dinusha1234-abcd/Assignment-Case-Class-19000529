case class Point(a:Int,b:Int){
   def x:Float = a.toFloat
   def y:Float = b.toFloat

   def distance():Double={
       var dx = this.x * this.x
       var dy = this.y * this.y
       return math.pow(dy+dx,0.5)
   }
    override def toString: String = s"Point ($x,$y)"

}
object Question_2 extends App{
    var p = Point(3,4)
    println("Distance"+p.distance())
}
