import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int positive = 0, negative = 0, zero = 0;

        // Count values
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                positive++;
            } else if(arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        // Output
        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros = " + zero);

        sc.close();
    }
}