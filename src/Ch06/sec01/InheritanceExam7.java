package Ch06.sec01;

public class InheritanceExam7 {
    public static void main(String[] args) {
        Account obj1 = new Account("111-2112-124512","임꺽정",500000);
        CheckingAccount obj2 = new CheckingAccount("444-1245-123214",
                "홍길동",20000,"9467-7934-4676-7621");
        CreaditLineAccount obj3 = new CreaditLineAccount("152-2145-142423",
                "김선달",30000,2000000);
        BonusPointAccount obj4 = new BonusPointAccount("000-00-000000",
                "김미영",0,0);
        printAccountInfo(obj1);
        printAccountInfo(obj2);
        printAccountInfo(obj3);
        printAccountInfo(obj4);
    }

    static void printAccountInfo(Account obj) {
        System.out.println("계좌번호 : " +obj.accountNo);
        System.out.println("예금주 이름 : " + obj.ownerName);
        System.out.println("잔액 : " + obj.balance);
        System.out.println();
    }
}
