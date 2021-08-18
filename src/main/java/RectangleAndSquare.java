public class RectangleAndSquare {
    public int areaOfRectangle(int length, int breadth){return (length>0 && breadth>0)?length*breadth:0;}
    public int perimeterOfRectangle(int length, int breadth){return (length>0 && breadth>0)?2*(length+breadth):0;}

    public int areaOfSquare(int side){return (side>0)?side*side:0;}
    public int perimeterOfSquare(int side){return (side>0)?4*side:0;}
}
