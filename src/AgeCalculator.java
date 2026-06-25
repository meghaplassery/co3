import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();

        System.out.print("Enter current month: ");
        int currentMonth = sc.nextInt();


        System.out.print("Enter birth year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter birth month: ");
        int birthMonth = sc.nextInt();


        int age = currentYear - birthYear;

        if (birthMonth>currentMonth)
        {
            age=age-1;

        }


        System.out.println("Age = " + age);

        sc.close();
    }
}