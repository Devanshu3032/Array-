public class Extra3MinimumvalueinArray {
   public static void main(String[] args) {
    int [] arr = {1,2,3,4,-5,56,6,77,78};
    int max = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(max>arr[i]){
            max = arr[i];
            // max = Math.max(max,arr[i]);
        } 
        
    }
    System.out.println("Maximum value is " + max);
   } 
}
