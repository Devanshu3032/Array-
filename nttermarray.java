import java.util.Scanner;
public class nttermarray {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
    int n  = sc.nextInt();
    int [] arr = new int [n];
    for (int i = 0; i <=n; i++) {
        arr[n] = sc.nextInt();        
    }
    for (int i = 0; i <= n; i++) {
        System.out.print(arr[i]+ " ");
        
    }
}

    
}
