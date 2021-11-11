package Ch05.sec03;

public class FieldExam2 {
    public static void main(String[] args) {
        Circle obj = new Circle(0.0);
        obj.radius = 5.0;
        double area = obj.getRadius();
        System.out.println(obj.radius);
        System.out.println(area);

    }
}
