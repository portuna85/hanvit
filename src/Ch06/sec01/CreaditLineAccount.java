package Ch06.sec01;

public class CreaditLineAccount extends Account {
    int creaditLine;
    CreaditLineAccount(String accountNo, String ownerName, int balance, int creaditLine) {
        super(accountNo, ownerName, balance);
        this.creaditLine = creaditLine;
    }
    int withdraw(int amount) throws Exception {
        if((balance + creaditLine) < amount){
            throw new Exception("인출 불가!!");
        }
        balance -= amount;
        return amount;
    }
}
