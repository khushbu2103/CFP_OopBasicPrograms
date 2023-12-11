package OopsBasicPrograms;

public class EmployeeClass {
    private String name;
    private String salary;
    private String id;
}
abstract class Main1
{
    abstract public void EmployeeSalary();
}
class Main2 extends Main1
{
    public static void main(String[] args) {
    Main2 main2 = new Main2();
    main2.EmployeeSalary();
    }

    @Override
    public void EmployeeSalary() {
        int salaryPerMonth = 30000;
        int yearlySalary = salaryPerMonth * 12;
        System.out.println("yearly salary: " + yearlySalary);
    }
}

