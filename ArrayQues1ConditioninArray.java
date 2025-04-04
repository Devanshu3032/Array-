public class ArrayQues1ConditioninArray {
    public static void main(String[] args) {
        int []arr = {81 , 34 , 56, 93 , 88 , 32};
         int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]<35){
                System.out.println(i);
            }
            
        }
    }
    
}
