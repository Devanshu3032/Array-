public class initialisingAndOutput {
    public static void main(String[] args) {
        int[] x  = new int[5];
        x[0] = 1 ;
        x[1] = 2 ;
        x[2] = 3 ;
        x[3] = 4; //initialising array element
        System.out.println(x[2]);//getting output
        x[2]= 34; //updating the value 
        System.out.println(x[2]);
    }
    
}
