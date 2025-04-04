import java.util.Arrays;

public class copyofArray {
    public static void main(String[] args) {
        int[] arr = {10,20,303,40};
        for(int x :arr){
            System.out.print(x);
        }
        System.out.println();
        int[] num = arr; // shallow copy
        num[0] = 70;
        System.out.println(arr[0]);
        for(int y : num){
            System.out.print(y);
        }
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 30 ;
        for(int x : brr ){ 
            System.out.print(x);
            System.out.println(arr[0]);
        }
    }
    
}
