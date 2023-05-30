package Maaş;
public class Employee {
// Main classı attığım linkteki maaş klasörünün içindedir fakat sadece bu dosyayı atabiliyorum.Maaş klasörüne girerek main classının olduğu main dosyasına ulaşabilirsiz.
    String name;
    double salary;
    int workHours;
    int hireYear;
    double vergi;
    double maasartisi;
    double bonus;
    double ilkmaas;
    Employee(String name, double salary, int workHours, int hireYear  ){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.maasartisi=salary;
        this.ilkmaas=salary;
    }
    void tax( double salary){
        if (salary <=1000){
            
            this.vergi=0;
        }
        else{
            this.vergi=(salary/100)*3;
           
           
        }
    }
    void bonus( int workHours){
        if(workHours>40){
            this.bonus=(workHours-40)*30;
            
        }
        else{
            this.bonus=0;
        }
       
         }


    void raiseSalary( int hireYear){
      
        if( 2021-this.hireYear<10){
         this.maasartisi= (salary/100)*5;
        }
        else if (2021-this.hireYear>=10 && 2021-this.hireYear<20){
           this.maasartisi=salary/10;

        }
        if(2021-this.hireYear>=20){
          this.maasartisi=(salary/100)*15;
            
        }

}
 
 void print(){
    System.out.println("Adı :"+this.name);
    System.out.println("Maaşı :" + this.ilkmaas);
    System.out.println("Çalışma Saati :"+ this.workHours);
    System.out.println("Başlangıç Yılı :" + this.hireYear);
    System.out.println("Vergi :" + this.vergi);
    System.out.println("Bonus :"+ this.bonus);
    System.out.println("Maaş Artışı :"+ this.maasartisi);
    System.out.println("Vergi ve bonuslarla maaş artışı :" + (salary-this.vergi+this.bonus));
    System.out.println("Toplam Maaş :"+(salary-this.vergi+this.bonus+this.maasartisi));

 }
    


}
