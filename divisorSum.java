import java.util.Scanner;

public class divisorSum {
    public static int sumDivisor(int[] nums, int mid) {
        int[] res = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            res[i] = (int) Math.ceil((double) nums[i] / (double) mid);
            sum += res[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int mid = sc.nextInt();
        int res = sumDivisor(nums, mid);
        System.out.println(res);
    }
}
