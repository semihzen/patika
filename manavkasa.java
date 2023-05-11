import java.util.Scanner;
class Main{

    static float myMethod(float q, float l) {
        
     q=q*l;
     
    return q;
    }
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        float a=2.14f;
        float e=3.67f;
        float d=1.11f;
        float m=0.95f;
        float p=5f;
        System.out.println("How many kg pineapple");
        float x=inp.nextFloat();
        a= myMethod(a,x);
        System.out.println("How many kg apple ");
        float q=inp.nextFloat();
        e= myMethod(e,q);
        System.out.println("How many kg tomato");
        float z=inp.nextFloat();
        d= myMethod(d,z);
        System.out.println("How many kg banana");
        float u=inp.nextFloat();
        m= myMethod(m,u);
        System.out.println("How many kg aubergine");
        float y=inp.nextFloat();
        p= myMethod(p,y);
float sum;
        sum=a+e+d+m+p;
        System.out.println("Total cost="+sum);

      

    }
}

