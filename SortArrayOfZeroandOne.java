public class SortArrayOfZeroandOne{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1, 1,0,0,0, 1,0,  1       ,0};
        int n = arr.length;
        int noOfZeroes =  0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                noOfZeroes ++ ;  
            }
            
        }

        for (int i = 0; i <arr.length; i++) {
            if(i<noOfZeroes){
                arr[i] = 0;

            }
            else
            arr[i] = 1 ; 
            
        }
       

        for(int e : arr){
            System.out.print(e+" ");
        }
         
    }
}
