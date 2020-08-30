public class Administration extends Employee {

    public Administration(String name, String cpr, int hours, int salary, int vacation) {
        super(name, cpr, hours, salary, vacation);
        this.salary = 23000;
        this.vacation = 5;
        this.hours = 37;
    }

    public int getVacation() {
        return vacation;
    }
}
