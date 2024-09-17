import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee(int empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee : " + "empId=" + empId + ", empName='" + empName + '\'' + ", empAge=" + empAge + ", empSalary=" + empSalary + '}';
    }
}

public class EmployeeAgeAvgSalary {

    public static void main(String[] args) {
        List<Employee> listOfEmployee = new ArrayList<Employee>(
                Arrays.asList(
                        new Employee(101, "John Doe", 32, 75000.50),
                        new Employee(102, "Jane Smith", 28, 68000.75),
                        new Employee(103, "Michael Johnson", 32, 82000.00),
                        new Employee(104, "Emily Davis", 28, 62000.30),
                        new Employee(105, "David Williams", 40, 90000.10),
                        new Employee(106, "Laura Wilson", 28, 70000.80),
                        new Employee(107, "Daniel Martinez", 32, 77000.45)));
        double result = AvgSalary(listOfEmployee);
        System.out.printf("%.2f",result);
    }

    public static double AvgSalary(List<Employee> listOfEmployee) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age to sort avg : ");
        int age = sc.nextInt();
        double sum = 0, count = 0;
        for (Employee e : listOfEmployee) {
            if (e.getEmpAge() == age) {
                count++;
                sum += e.getEmpSalary();
            }
        }
        double result = sum / count;
        return result;
    }
}
