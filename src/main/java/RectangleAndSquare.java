public class RectangleAndSquare {
    int length, breadth;
    RectangleAndSquare(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    RectangleAndSquare(int side){
        this.length=side;
        this.breadth=side;
    }
    public int areaOfRectangleOrSquare(){return (length>0 && breadth>0)?(length==breadth)?length*length:length*breadth:0;}
    public int perimeterOfRectangleOrSquare(){return (length>0 && breadth>0)?(length==breadth)?4*length:2*(length+breadth):0;}
}
