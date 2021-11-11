package Ch05.sec03;

public class SubscriberInfo {
    String name, id, password;
    String address, phoneNo;

    SubscriberInfo() {
    }

    SubscriberInfo(String name,String id,String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
    SubscriberInfo(String name,String id,String password, String address, String phoneNo) {
        this(name, id, password);
        this.address = address;
        this.phoneNo = phoneNo;
    }
    void changePassword(String password) {
        this.password = password;
    }
    void setAddress(String address) {
        this.address = address;
    }
    void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
