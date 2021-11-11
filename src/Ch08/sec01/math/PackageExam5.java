package Ch08.sec01.math;

import Ch08.sec01.geometry.Circle;
import Ch08.sec01.geometry.polygon.Rectangle;

public class PackageExam5 {
    public static void main(String[] args) {
        Circle obj = new Circle(5);
        Rectangle obj2 = new Rectangle(8,9);
        if(obj.getAreas() > obj2.getArea()) {
            System.out.println("원의 면적이 더 넓습니다.");
        } else {
            System.out.println("원의 면적은 직사각형의 면적보다 작거나 같습니다.");
        }
    }
}