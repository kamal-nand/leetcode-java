import java.util.*;

public class MinimumOperationsToReduceXToZero {

    public static int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;
        Map<Integer, Integer> mp = new HashMap<>(); 
    
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            mp.put(sum, i);
        }
    
        if (x > sum) { 
            return -1;
        }
    
        mp.put(0, 0);
        int longSubarray = 0;
        sum -= x;
        int val = 0;
    
        for (int i = 0; i < n; i++) {
            val += nums[i];
            if (mp.containsKey(val - sum)) {
            if (val - sum == 0) {
                longSubarray = Math.max(longSubarray, i - mp.get(val - sum) + 1);
            } else {
                longSubarray = Math.max(longSubarray, i - mp.get(val - sum));
            }
            }
        }
        return longSubarray == 0 ? (sum == 0 ? n : -1) : n - longSubarray;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = minOperations(nums, x);
        System.out.println(ans);
    }
}
