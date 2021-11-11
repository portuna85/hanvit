package Ch05.sec04;

public class StaticFieldExam2 {
    public static void main(String[] args) {
        LimitedValue speed = new LimitedValue();
        speed.setValue(200000);
        System.out.println("speed.value : "+speed.value);
        System.out.println("상한값 : "+LimitedValue.UPPER_LIMITED);
    }
}
