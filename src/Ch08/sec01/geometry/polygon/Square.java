package Ch08.sec01.geometry.polygon;

public class Square {
    public int sideLength;
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
    public double getArea() {
        return sideLength * sideLength;
    }
}
