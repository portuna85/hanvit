package Ch06.sec01;

public class InheritanceExam3 {
    public static void main(String[] args) {
        CreaditLineAccount obj = new CreaditLineAccount("3214-457-5682565", "강부자", 50000,
                2000000);
        try {
            int amount = obj.withdraw(560000);
            System.out.println("인출액 : " + amount);
            System.out.println("잔액 : " + obj.balance);
            System.out.println("마이너스 한도 : " + obj.creaditLine);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
