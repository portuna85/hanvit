package Ch08.sec01.geometry;

public class PackageExam1 {
    public static void main(String[] args) {
        Circle obj = new Circle(5);
        System.out.println("반지름 : "+obj.radius);
        System.out.println("면적 = "+obj.getAreas());
    }
}
