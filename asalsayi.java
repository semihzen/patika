
public class asalsayi {
    public static void main(String[] args) {
           int a;
           int c=0;
           int d=0;
           System.out.print("2 ");
           for(a=3;a<=100;a++){
            for(int b=2;b<a;b++){
                c=a%b;
               if(c==0){
                d++;
               }

               } 
               if(d==0){
                System.out.print(a+" ");
               }
               d=0;
                
            }

           }

    }
            
    
        
    

