package Ch02.sec07;

public class ParamEx1 {
     public static void main(String args[]) {
         for(String str : args) {
             System.out.println(str);
         }
         System.out.println("args.length : " +args.length);
     }
}