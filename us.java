 import java.util.Scanner;
public class us {
    public static int usHesabi( int b, int a ){
        if(a==1){
            return b;
        }

return usHesabi(b, a-1)*b;

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Tabanı Giriniz");
        int b= inp.nextInt();
        System.out.println("Üssü giriniz");
        int a=inp.nextInt();
        if(a<0|| b<0){
            System.out.println("Hatalı veri girdiniz .Yeniden giriniz.");
        }
        if(a==0){
            System.out.println("1");
        }
         int x=usHesabi(b,a);
         System.out.println(x);
    }
    
}
