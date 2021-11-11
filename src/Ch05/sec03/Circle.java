package Ch05.sec03;

public class Circle {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double getRadius() {
        double area;
        area = radius * radius * 3.14;
        return area;
    }
}
