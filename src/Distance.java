import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distance in kilometers ");
        double kilometers = sc.nextDouble();

        double meters = kilometers * 1000;
        double centimteres = meters * 100;
        System.out.println("\nMeters = " + meters);
        System.out.println("\nCentimteres = " + centimteres);
        sc.close();

    }
}