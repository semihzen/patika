public class fibonacci {
    public static void main(String[] args) {
        int i;
       int j=0;
        int k=1;
        int sum;
        System.out.print(j+" ");
        System.out.print(k+" ");
        for(i=1;i<9;i++){
           
           sum=k+j;
          System.out.print(sum+" ");
          j=k;
          k=sum;
        }
    }
}
