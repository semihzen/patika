import java.util.Scanner;
public class mukemmelsayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int a= inp.nextInt();
      int i=2;
      int sum=1;
        while(i< a){
            if( a%i==0 ){
               sum=sum+i;
            }
            i++;
        }
        if(a==1){
            System.out.println(a+"  mükemmel sayı değildir");
        }
        else if(sum==a){
            System.out.println(sum+ " mükemmel sayıdır");
        }
        else{
            System.out.println(a+" mükemmel sayı değildir");
        }
        
    }
}
