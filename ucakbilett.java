import java.util.Scanner;


public class ucakbilett {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float km, bilet;
        System.out.println("Mesafeyi km türünden giriniz");
        km=inp.nextFloat();
        bilet=km/10;
        System.out.println("Yaşınızı lüppen giriniz");
        float yas=inp.nextFloat();
        System.out.println("Yolculuk tipini giriniz (1=> Tek Yön 2=> Gidiş  Dönüş)");
        float yon=inp.nextFloat();
        if( yas<0 && km<=0 && yon!=1 && yon!=2){
            System.out.println("Hatalı veri girdiniz");

        } 
        else{
        if( yas<12){
            bilet=bilet-bilet/2;
            if(yon==2){
                bilet=bilet-bilet/5;
                bilet=bilet*2;
                System.out.println("Toplam Tutar"+bilet);
               
            }
            else {System.out.println("Toplam Tutar"+bilet);}
            
        }
        if(12<yas && yas<24){
        bilet=bilet-bilet/10;
            if( yon==2){
                bilet=bilet-bilet/5;
                bilet=bilet*2;
                System.out.println("Toplam Tutar"+bilet);
                
            }
            else {System.out.println("Toplam Tutar"+bilet);}
            
        }
        if(yas>65){
            bilet=bilet-(bilet*3)/10;
            if(yon==2){
                bilet=bilet-bilet/5;
                bilet=bilet*2;
                System.out.println("Toplam Tutar"+bilet);
                
            }
            else {System.out.println("Toplam Tutar"+bilet);}
           
        }
    if (yas>24 && yas<65){
        System.out.println("Toplam tutar"+bilet);
    }
    }
    
}
}
