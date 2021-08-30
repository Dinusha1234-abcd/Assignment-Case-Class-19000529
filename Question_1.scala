case class Point(a:Int,b:Int){
    def x:Int = a
    def y:Int = b
    
    def add(r:Point) = new Point(this.x+r.x,this.y+r.y)
    override def toString: String = s"Point($x,$y)"
    
}
object Question_1 extends App{
   
    println("Enter The First Point in X1")
    var x1 = scala.io.StdIn.readInt()
    println("Enter The First Point in Y2")
    var y1 = scala.io.StdIn.readInt()
    println("Enter The First Point in X2")
    var x2 = scala.io.StdIn.readInt()
    println("Enter The First Point in Y2")
    var y2 = scala.io.StdIn.readInt()

    val p1 = Point(x1,y1)
    val p2 = Point(x2,y2)

    println("Your Enter Point are "+"X1 : "+x1 +"Y1 : "+y1+"X2 : "+x2+"Y2 : "+y2)
    println("Add Point is "+p1.add(p2).toString())

}