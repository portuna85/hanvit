package Ch06.sec02;

public class InterfaceExam1 {
    public static void main(String[] args) {
        SeparateVolume obj1 = new SeparateVolume("863?774개","개미","베르베르");
        AppCDInfo obj2 = new AppCDInfo("2005-7001","RedHat Fedora");
        obj1.checkOut("김영숙","20210806");
        obj2.checkOut("박희경","20211105");
        obj1.checkIn();
        obj2.checkIn();
    }
}
