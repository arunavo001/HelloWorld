class Employee
{
    private final int empId;
    private final String empFirstName;
    private final String empLastname;
    private final double empSalary;
    public Employee(int id,String empFirstName,String empLastname,double empSalary)
    {
        this.empId=id;
        this.empFirstName=empFirstName;
        this.empLastname=empLastname;
        this.empSalary=empSalary;
    }
    public int getId()
    {
        return empId;
    }
    public String getEmpFirstName()
    {
        return empFirstName;
    }
    public String getEmpLastname()
    {
        return empLastname;
    }
    public String getEmpFullName()
    {
        return empFirstName+" "+getEmpLastname();
    }
    public double getEmpSalary()
    {
        return empSalary;
    }
    public double getAnnualPay()
    {
        return 12*getEmpSalary();
    }
}
public class EmployeeDetailsProblem
{
    public static void main(String[] args)
    {
        Employee e1=new Employee(1000,"Arunavo","Biswas",45000.45);
        System.out.println("Employee full name : "+e1.getEmpFullName());
        System.out.println("Employee's annual package is : "+e1.getAnnualPay());
        Employee e2=new Employee(1001,"Tara","Sharma",39000.45);
        System.out.println("Employee's full name is : "+e2.getEmpFullName());
        System.out.println("Employee's annual package is : "+e2.getAnnualPay());
    }
}