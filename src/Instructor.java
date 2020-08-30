public class Instructor extends Employee {

    public Instructor(String name, String cpr, int hours, int salary, int vacation) {
        super(name, cpr, hours, salary, vacation);
        this.vacation = 0;
    }

    public int getSalary(){
        return hours * 456;
    }
}
