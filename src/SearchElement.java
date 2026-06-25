import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = -1;

        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }
}