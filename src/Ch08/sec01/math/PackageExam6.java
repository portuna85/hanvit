package Ch08.sec01.math;

import Ch08.sec01.geometry.polygon.*;

public class PackageExam6 {
    public static void main(String[] args) {
        Square obj1 = new Square(7);
        Rectangle obj2 = new Rectangle(5, 6);
        if(obj1.getArea() > obj2.getArea()) {
            System.out.println("정사각형의 면적이 더 넓습니다.");
        } else {
            System.out.println("정사각형의 면적이 직사각형의 면적보다 같거나 작습니다.");
        }
    }
}