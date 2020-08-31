import java.util.Scanner;

public class Menu {

    public static void menu(){
        Scanner console = new Scanner(System.in);
        System.out.println("This program prints information about employees and members");
        System.out.println("What information would you like to see?");
        System.out.println("Press 1 for employees \n      2 for members\n      3 for members & employees\n      4 to exit");
        int answer = console.nextInt();
        switch(answer){
            case 1:
                Employee.printEmployees();
                break;
            case 2:
                Member.printMembers();
                break;
            case 3:
                Person.printpeople();
                break;
            case 4:
                return;
            default:
                System.out.println("Wrong input, closing console...");
                break;
        }
        System.out.println();
        menu();
    }
}
