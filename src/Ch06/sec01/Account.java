package Ch06.sec01;

class Account {
    String accountNo;
    String ownerName;
    int balance;

    Account (String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    int withdraw(int amount) throws Exception {
        if (balance < amount) {
            throw new Exception("잔액 부족");
        }
        balance -= amount;
        return amount;
    }
}
