case class Point(a:Int,b:Int){
    def x:Int = a
    def y:Int = b
    
    def invert() = new Point(this.y,this.x)
    override def toString: String = s"Point($x,$y)"
    
}
object Question_4 extends App{
   
   var p = Point(1,2)
   println("New Point P(x,y) :"+p.invert())
}