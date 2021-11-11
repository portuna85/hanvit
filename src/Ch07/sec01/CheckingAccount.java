package Ch07.sec01;

public class CheckingAccount extends Account {
    String cardNo;
    CheckingAccount (String accountNo, String ownerName, int balance, String cardNo) {
        super(accountNo, ownerName, balance);
        this.cardNo = cardNo;
    }
    int pay(String cardNo, int amount) throws Exception {
        if (!cardNo.equals(this.cardNo) || (balance < amount)) {
            throw new Exception("지불 불가");
        }
        return withdraw(amount);
    }
}
