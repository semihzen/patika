package Maaş;
public class Main {
    public static void main(String[] args) {
        Employee isci= new Employee( "kemal",2000,45,1985);
        isci.tax(2000);
        isci.bonus(45);
        isci.raiseSalary(1985);
        isci.print();
    }
}
