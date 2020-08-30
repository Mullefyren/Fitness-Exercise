import java.util.ArrayList;
import java.util.List;

public class Person {
    public String name;
    public String cpr;

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }
    public static void printpeople(){
        List<Person> people = new ArrayList<>();
        Member Egon = new Member("Egon", "030744-0309", false, 0);
        Member Gitte = new Member("Gitte", "040488-1008", true, 0  );
        Instructor Svend = new Instructor("Svend", "090995-0123", 23, 0, 0);
        Administration Bodil = new Administration("Bodil", "040977-0422",0, 0, 0);
        people.add(Egon);
        people.add(Gitte);
        people.add(Svend);
        people.add(Bodil);
        System.out.printf("%-10s %-10s %n", "Name", "CPR");
        System.out.println("***************************************************************");
        for (Person p: people){
            System.out.printf("%-10s %10s %n", p.getName(), p.getCpr());
        }
            System.out.println("===================================================");
    }
}
