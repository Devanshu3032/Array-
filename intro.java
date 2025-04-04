public class intro {
    public static void main(String[] args) {
       int [] arr =  new int [5];
       arr[0]= 10;
       arr[1]= 20;
       System.out.println(arr[0]);
       // we can also modify value of array 
       arr[0] = 90;
       System.out.println(arr[0]);
      for (int i = 0; i < 6; i++) {
        System.out.print(arr[i] + " ");
        
      }
    }
    
}
