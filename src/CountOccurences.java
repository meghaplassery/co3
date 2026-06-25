import java.util.*;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter number to count: ");
        int x = sc.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == x){
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}