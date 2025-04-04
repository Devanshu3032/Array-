import java.util.Scanner;

public class Outputloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = sc.nextInt(); 
                int[] x  = new int[n];

        for (int i = 0; i <=n-1; i++) {
            x[i]= sc.nextInt();            
        }
       
        //for loop
        for (int i = 0; i <= n-1; i++) {
            System.out.print(x[i]+ " ");
            
        }
    }
    
}
