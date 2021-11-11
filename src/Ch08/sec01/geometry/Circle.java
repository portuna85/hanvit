package Ch08.sec01.geometry;

public class Circle {
   public int radius;
   public Circle(int radius) {
        this.radius = radius;
    }
   public double getAreas() {
        return radius * radius * 3.14;
    }
}
