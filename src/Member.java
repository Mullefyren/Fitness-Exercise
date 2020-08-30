import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
    public boolean isBasic;
    public int fee;

    public Member(String name, String cpr, boolean isBasic, int fee) {
        super(name, cpr);
        this.isBasic = isBasic;
        this.fee = fee;
    }

    public String getMemberType() {
        if (isBasic = true){
             return "Basic";
        } else {
            return "Full";
        }
    }
    public int getMonthlyFee(){
        if (isBasic = true){
            return 199;
        } else {
            return 299;
        }
    }

    public static void printMembers(){
        List<Member> members = new ArrayList<>();
        Member Egon = new Member("Egon", "030744-0309", false, 0);
        Member Gitte = new Member("Gitte", "040488-1008", true, 0  );
        members.add(Egon);
        members.add(Gitte);
        System.out.printf("%-10s %-10s %17s %6s %n", "Name", "CPR", "Member Type", "Fee");
        System.out.println("***************************************************************");
        for (Member p: members){
            System.out.printf("%-10s %10s %10s %12d %n", p.getName(), p.getCpr(), p.getMemberType(), p.getMonthlyFee());
        }
        System.out.println("===================================================");
    }
}
