package Ch05.sec02;

public class ObjectExam1 {
    public static void main(String[] args) {
        StringBuffer obj;
        obj = new StringBuffer("Hey, JAVA!");
        obj.deleteCharAt(1);
        obj.deleteCharAt(1);
        obj.insert(1, 'i');
        System.out.println(obj);

    }
}
