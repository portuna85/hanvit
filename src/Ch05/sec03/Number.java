package Ch05.sec03;

public class Number {
    int num[];
    Number(int num[]) {
        this.num = num;
    }
    int getTotal() {
        int total = 0;
        for(int cnt=0;cnt < num.length; cnt++){
            total += num[cnt];
        }
        return total;
    }
    int getAverage() {
        int total;
        int average;
        total = getTotal();
        average = total/num.length;
        return average;
    }
}