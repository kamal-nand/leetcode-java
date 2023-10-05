import java.util.*;
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int mid = (nums.length - 1) / 2;
        return nums[mid];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
}
