import java.util.Scanner;
public class tersucgen {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
       System.out.println("Lütfen basamak sayısını giriniz");
        int a=inp.nextInt();
        int i;
        int t=0;
        while(a>0){
         i=a;
        System.out.print(" ");
         while(i>0){
            i--;
            System.out.print(" ");
            
            System.out.print(" *");
           

         
        
         }
        System.out.println(" ");
         
         a--;
        }
        
    }
}
