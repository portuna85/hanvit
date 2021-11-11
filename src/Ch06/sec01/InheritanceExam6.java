package Ch06.sec01;

public class InheritanceExam6 {
    public static void main(String[] args) {
        EMailSender obj1 = new EMailSender("생일을 축하합니다.","고객센터",
                "admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
        SMSSender obj2 = new SMSSender("생일축하 합니다.", "고객센터",
                "02-796-4686", "20% 할인쿠폰이 발행되었습니다.");
        obj1.sendMessage("hatman@yeyeye.com");
        obj1.sendMessage("stickman@hahaha.com");
        obj2.sendMessage("016-798-6435");
    }
}
