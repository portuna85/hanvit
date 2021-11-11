package Ch05.sec03;

public class ConstrExam2 {
    public static void main(String[] args) {
        SubscriberInfo obj1, obj2;
        obj1 = new SubscriberInfo("연놀부", "richman", "superrich");
        obj2 = new SubscriberInfo("연흥부", "poorman", "superpoor",
                "서울특별시 강남구", "010-1234-5678");
        printSubscriberInfo(obj1);
        printSubscriberInfo(obj2);
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
