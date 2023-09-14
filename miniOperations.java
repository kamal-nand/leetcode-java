import java.util.*;
public class miniOperations {

    public static int minOperations(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i+1] < nums[i]) {
                count += nums[i] - nums[i+1] + 1;
                nums[i+1] = nums[i] + 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = minOperations(arr);
            System.out.println(ans);
        }
    }
}
