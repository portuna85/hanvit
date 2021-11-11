package Ch07.sec01;

public class RefTypeExam6 {
    public static void main(String[] args) {
        Account obj1 =new CheckingAccount("4567-9746-44664",
                "홍길동",1000000,"6469-7964-4649-4612");
        CheckingAccount obj2 = (CheckingAccount) obj1;
        try {
            int amount = obj2.pay("6469-7964-4649-4612", 47000);
            System.out.println("인출액 : " + amount);
            System.out.println("카드번호 : " + obj2.cardNo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
