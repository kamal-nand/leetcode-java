import java.util.*;
public class maximum_Subarray {
    static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            if(currSum > maxSum) 
                maxSum = currSum;
        }
        return maxSum;
     }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[5];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int res = maxSubArray(arr);
            System.out.println(res);
        }
    }
}
