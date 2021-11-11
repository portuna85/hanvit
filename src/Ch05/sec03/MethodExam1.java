package Ch05.sec03;

public class MethodExam1 {
    public static void main(String[] args) throws Exception {
        Account obj1, obj2;
        obj1 = new Account("111-22-3344556","김입금",200000);
        obj2 = new Account("221-412-512451","이출금",100000);
        obj1.deposit(20000);
        obj2.withdraw(9900);

        printAccount(obj1);
        printAccount(obj2);
    }
    static void printAccount(Account obj) {
        System.out.println("계좌번호 : "+obj.accountNo);
        System.out.println("예금주 이름 : "+obj.ownerName);
        System.out.println("잔액 : "+obj.balance);
    }

}
