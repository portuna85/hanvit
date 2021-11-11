package Ch05.sec03;

public class ClassExam1 {
    public static void main(String[] args) {
        GoodsStock obj;
        obj = new GoodsStock();
        obj.goodCode="52135";
        obj.stockNum=200;

        System.out.println("상품코드 : "+obj.goodCode);
        System.out.println("상품재고 : "+obj.stockNum);
        obj.addStock(1000);
        System.out.println("상품코드 : "+obj.goodCode);
        System.out.println("재고수량 : "+obj.stockNum);
    }
}
