package Ch05.sec03;

public class MethodExam6 {
    public static void main(String[] args) {
        PhysicalInfo obj;
        obj = new PhysicalInfo("혜리",10,145.0f,35.0f);
        printPhysicalInfo(obj);
        obj.update(11,149.0f,40.0f);
        printPhysicalInfo(obj);
        obj.update(12,153.0f);
        printPhysicalInfo(obj);
        obj.update(13);
        printPhysicalInfo(obj);
    }
    static void printPhysicalInfo(PhysicalInfo obj) {
        System.out.println("이름 : "+obj.name);
        System.out.println("나이 : "+obj.age);
        System.out.println("키 : "+obj.height);
        System.out.println("몸무게 : "+obj.weight);
        System.out.println();
    }
}
