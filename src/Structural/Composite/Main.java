package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Employee ManufMng = new Employee("Janith", "Manuf", 300000);
        Employee ManufEmp1 = new Employee("Sashin", "Manuf", 130000);
        Employee ManufEmp2 = new Employee("Jeenuka", "Manuf", 130000);

        Employee GCDMng = new Employee("Shanik", "GCD", 500000);
        Employee GCDEmp1 = new Employee("Peris", "GCD", 170000);
        Employee GCDEmp2 = new Employee("Dias", "GCD", 170000);

        ManufMng.add(ManufEmp1);
        ManufMng.add(ManufEmp2);

        GCDMng.add(GCDEmp1);
        GCDMng.add(GCDEmp2);

        System.out.println("All employees");
        System.out.println(ManufMng);

        System.out.println();

        System.out.println("Manuf Employees under Janith");
        for (Employee emp: ManufMng.getSubordinates()) {
            System.out.println(emp);
        }

        System.out.println();

        System.out.println("GCD Employees under Shanik");
        for (Employee emp: GCDMng.getSubordinates()) {
            System.out.println(emp);
        }
    }
}
