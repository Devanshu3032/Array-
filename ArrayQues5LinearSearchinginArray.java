import java.util.Scanner;

public class ArrayQues5LinearSearchinginArray {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Target Element:");
    int x = sc.nextInt();
    System.out.println("Enter Array size :");
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter Array Element:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        
    }
        //solution
        boolean flag = false;
        for (int i = 0; i <n; i++) {
            if(arr[i]==x){
                flag= true;
                break;
            } 
            
        }
        if(flag==true){
            System.out.println("elment found");
        } else System.out.println("Not found");
 }   
}
