package Ch06.sec01;

public class InheritanceExam4 {
    public static void main(String[] args) {
        BonusPointAccount obj = new BonusPointAccount("333-12-12362421", "김미영",
                0,0);
        obj.deposit(10000000);
        System.out.println("잔액 : " + obj.balance);
        System.out.println("보너스 포인트 : " + obj.bonusPoint);
    }
}
