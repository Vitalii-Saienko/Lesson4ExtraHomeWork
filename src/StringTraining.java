import java.util.Scanner;

public class StringTraining {
    public static void main(String[] args) {
        String firstString = new String("Vitalii");
        System.out.println(firstString);
        String greeting = new String("Hi! My name is "+firstString+".");
        System.out.println(greeting);
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = sc.nextLine();
        System.out.println("Hello "+userName+" !");
    }
}
