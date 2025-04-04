public class ReverseUsingTwopointer {
    public static void main(String[] args) {
        int[] arr = {10,30,34,45};
        int n = arr.length;
        for(int x   : arr) {
             System.out.print(x+" ");
        }
        System.out.println();
        int i = 0 , j = n-1 ; 
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
        for(int e : arr){
            System.out.print(e+ " ");
        }
            
        }
    }

