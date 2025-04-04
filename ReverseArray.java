public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,30 ,20, 04,50};
        int n = arr.length;
        for(int x : arr){
            System.out.print(x+ " ");
        }
        // reverse 
        System.out.println();
        for (int i = 0; i <n /2; i++) {
            int j = n-1-i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
             
        }
        for(int c : arr){
            System.out.print(c+" ");
        }
    }
}
