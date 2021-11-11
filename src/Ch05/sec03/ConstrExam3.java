package Ch05.sec03;

public class ConstrExam3 {
    public static void main(String[] args) {
        SubscriberInfo obj;
        obj = new SubscriberInfo();
        printSubscriberInfo(obj);
    }
    static void printSubscriberInfo(SubscriberInfo obj) {
        System.out.println("이름 : "+obj.name);
        System.out.println("아이디 : "+obj.id);
        System.out.println("비번 : "+obj.password);
        System.out.println("주소 : "+obj.address);
        System.out.println("전화번호 : "+obj.phoneNo);
        System.out.println();
    }
}
