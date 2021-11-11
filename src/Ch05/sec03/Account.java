package Ch05.sec03;

public class Account {
    String accountNo, ownerName;
    int balance;
    Account(String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    void deposit(int amount) {
        balance += amount;
    }
    int withdraw(int amount) throws Exception {
        if(amount > balance) {
            throw new Exception("잔액 부족");           // 익셉션 발생
        }
        balance -= amount;
        return amount;
    }
}
