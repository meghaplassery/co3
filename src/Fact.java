import java.util.Scanner;

public class Fact
{
    static int factorialFn(int n)
    {
        if (n == 0 || n == 1)
            return 1;

        return n * factorialFn(n - 1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial = " + factorialFn(num));
    }
}