package Ch05.sec04;

public class LimitedValue {
    final static int UPPER_LIMITED = 100000;            // 상수 필드의 선언
    int value;
    void setValue(int value) {
        if(value > UPPER_LIMITED) {
            this.value = UPPER_LIMITED;
        } else {
            this.value = value;
        }
    }
}
