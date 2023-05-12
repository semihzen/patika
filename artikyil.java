import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {
        System.out.println("Lütfen bir yıl giriniz");
        Scanner inp = new Scanner(System.in);
        int a=inp.nextInt();
        if(a<100){
            if(a%4==0){
            System.out.println("Artık Yıldır");
            }
            else{
                System.out.println("Artık Yıl değildir");
            }
        }
        else if (a%4==0){
            if(a%100!=0||(a%100==0 && a%400==0)){
                System.out.println("Artık Bir Yıldır");
            }
            else{
            System.out.println("Artık Bir Yıl Değildir");
            }
        }
        
    }
    
}
