import java.lang.reflect.Array;
import java.util.Arrays;

public class trying {
    public static void main(String[] args) {
    //     int[] arr = {10,20,30,60,40,50};
    //     int n = arr.length ;
    //      Arrays.sort(arr);

    //      for(int e : arr){
    //         System.out.print(e + " ");
    //      }

    //      System.out.println();

    // //      for (int i = 0; i <n/2; i++) {
    // //         int j = n-1-i;
    // //         int temp = arr[i] ;
    // //          arr[i] = arr[j];
    // //          arr[j] = temp;
            
    // //      }
    // //    for( int z :arr){
    // //         System.out.print(z + " ");
    // //    }

    // int i= 0 , j= n-1;
    // while(i<=j){
    //     int temp =   arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    //     i++;
    //     j--;

    // }
    // for(int z : arr){
    //     System.out.print(z + " ");
    // }

    int[] arr ={10,20,30,40};
    int x = 50 ;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if(arr[i] + arr[j] == x ){
                System.out.println("Element found");
                System.out.println(arr[i]+ "  " + arr[j]) ;
            }
            
        }
        
    }
}
}