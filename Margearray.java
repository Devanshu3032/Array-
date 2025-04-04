public class Margearray {
    public static void main(String[] args) {
        int[] a = { 10 ,20, 30 ,40 ,50};
        int[] b = { 60 ,70,80,90,100};
        int l = a.length;
        int lb = b.length;
        int d = l+lb;
        int[] c  = new int[d];
        int i = 0, j= 0,k=0;
        // merging 
        while(i<l && j<lb){
            if(a[i]<=b[j]){
            c[k] = a[i];
            i++ ; k++;
            }
            else{ c[k]= b[j];
            i++; k++;}
        }
          
            while(j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }
          
          for(int x : c){
            System.out.println(x);
          }
    }
}
