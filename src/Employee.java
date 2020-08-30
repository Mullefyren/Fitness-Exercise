import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    public int hours;
    public int salary;
    public int vacation;

    public Employee(String name, String cpr, int hours, int salary, int vacation) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
        this.vacation = vacation;
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }

    public int getVacation() {
        return vacation;
    }

    public static void printEmployees(){
        List<Employee> employees = new ArrayList<>();
        Instructor Svend = new Instructor("Svend", "090995-0123", 23, 0, 0);
        Administration Bodil = new Administration("Bodil", "040977-0422",0, 0, 0);
        employees.add(Svend);
        employees.add(Bodil);
        System.out.printf("%-10s %-10s %14s %10s %16s %n", "Name", "CPR", "Hours", "Salary", "Vacation");
        System.out.println("*************************************************************************");
        for (Employee p: employees){
            System.out.printf("%-10s %10s %10d %12d %10d %n", p.getName(), p.getCpr(), p.getHours(), p.getSalary(), p.getVacation());
        }
        System.out.println("===========================================================");
    }
}
