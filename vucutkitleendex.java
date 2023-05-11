import java.util.Scanner;
 class Main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Vücut kitle endexi hesaplayan programa hoşgeldiniz.");
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz");
       float h=inp.nextFloat();
        System.out.println("Lütfen Kilonuzu Giriniz");
        float k=inp.nextFloat();
         System.out.print("Vücut kitle endexiniz");
        float e=k/(h*h);
         System.out.print(e);
        

    }
}
