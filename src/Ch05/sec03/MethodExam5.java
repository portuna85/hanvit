package Ch05.sec03;

public class MethodExam5 {
    public static void main(String[] args) {
        Account obj = new Account("9797-461-4613", "최부자",500);
        try {
            int amount = obj.withdraw(10000);
            System.out.println("인출액 : "+ amount);
        } catch (Exception e) {
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }
}
