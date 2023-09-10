import java.util.*;

public class KokoEatingBananas {

    public static int findMax(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    public static int totalTime(int[] arr, int h) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += Math.ceil((double)arr[i] / (double)h);
        }
        return count;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalHour = totalTime(piles, mid);
            if (totalHour <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int h = sc.nextInt();
        int ans = minEatingSpeed(arr, h);
        System.out.println(ans);
    }
}
