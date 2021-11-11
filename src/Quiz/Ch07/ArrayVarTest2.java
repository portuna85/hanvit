package Quiz.Ch07;

public class ArrayVarTest2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printArray(arr);
        arr = null;
        printArray(arr);
    }
    static void printArray(int arr[]) {
        if(arr == null){
            return;
        }
        for(int num : arr){
            System.out.println(num);
        }
    }
}
