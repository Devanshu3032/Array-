public class MargeArray3 {
    public static void main(String[] args) {
        int[] a = {10,20,30};
        int[] b = {40,50,60};
        int a1 = a.length;
        int b1 = b.length;
        int[] c = new int[a.length+b.length];
        int i = a1-1;
         int  j = b1-1; 
         int  k= (a1+b1)-1;
         while(i>=0 && j>=0){
            if(a[i]>b[j]){
                c[k]=a[i];
                i--;
                k--;
            }
            else{
                c[k] = b[j];
                j--;
                k--;
            }
         }
         
           
         while(i>=0){
            c[k]=a[i];
            i--;
            k--;
        }
          
          for(int x:c){
            System.out.print(x +" ");
          }
    }
    
}
