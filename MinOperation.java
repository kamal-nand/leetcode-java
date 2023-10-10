import java.util.*;

public class MinOperation {

    public static int minOperations(int[] nums) {
        int[] arr = Arrays.stream(nums).sorted().distinct().toArray();
        int ans = nums.length;
        for(int i = 0, j = 0; j < arr.length; j++) {
            while(arr[j] - arr[i] >= nums.length) {
                i++;
            }
            ans = Integer.min(ans, nums.length - (j - i + 1));
        }

        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = minOperations(nums);
        System.out.println(ans);
    }    
}
