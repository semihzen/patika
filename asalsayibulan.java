import java.util.Scanner;
public class asalsayibulan {
    static int f( int a , int b){
    if(a<0 ){
        System.out.println("Hatalı veri girdiniz");
        return 1;}
        if(b==1){
            System.out.println("Asal Sayıdır");
            return 1;
        } 
        if(a==0|| a==1){
            System.out.println("ASAL SAYI DEĞİLDİR");
            return 1;
        }
        if (a%b==0){
            System.out.println("ASAL SAYI DEĞİLDİR"); 
            return 1;
    }
       return f(a ,b-1);
    }
    public static void main(String[] args) {
        System.out.println("Lütfen Sayıyı giriniz");
        Scanner inp = new Scanner(System.in);
       
        int a= inp.nextInt();
       int b=a-1;
       f(a,b);

        

        
    }
    
}