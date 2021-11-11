package Ch05.sec03;

public class GoodsStock {
    String goodCode;
    int stockNum;
    void addStock(int amount) {
        stockNum += amount;
    }
    int subtractStock(int amount) {
        if (stockNum < amount) {
            return 0;
        }
        stockNum -= amount;
        return amount;
    }
}
