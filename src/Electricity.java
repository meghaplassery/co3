import java.util.Scanner;
public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of units consumed: ");
        int n = sc.nextInt();
        final double RATE_PER_UNIT= 7.5;

        double billAmount=n *RATE_PER_UNIT;
        System.out.println("\nElectricity Bill = " + billAmount);

        sc.close();
    }
}