case class Point(a:Int,b:Int){
    def x:Int = a
    def y:Int = b

    def distance(p:Point):Double={
        var dx = math.pow((this.x-p.x),2)
        var dy = math.pow((this.y-p.y),2)
           return math.pow(dx+dy,0.5);

    }
}
object Question_4 extends App{
    var p1 = Point(1,2)
    var p2 = Point(2,2)
    println( "Distance : "+p1.distance(p2))

}