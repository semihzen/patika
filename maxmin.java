import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz");
        int i=inp.nextInt();
        if(i<=0){
            System.out.println("HATALI VERİ GİRDİNİZ");
        }
        else{
        int a=1;
        int n;
        int m=0;
        int mini=0;
       


        while(i>0){
            System.out.println(a+".Sayıyı giriniz");
             n= inp.nextInt();
             if(a==1){
                m=n;
                mini=n;
             }
            
            i--;
            if(n>=m){
                m=n;

            }
           if(n<mini){
            mini=n;
           }
            a++;

        }
        System.out.println("En büyük sayı: "+m);
        System.out.println("En küçük sayı:"+mini);}
        
    }
}
