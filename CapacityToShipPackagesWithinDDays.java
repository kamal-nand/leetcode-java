import java.util.*;
public class CapacityToShipPackagesWithinDDays {

    public static int weightsSum(int arr[]) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findDays(int[] weights, int capacity) {
        int days = 1;
        int load = 0;
        for(int i = 0; i < weights.length; i++) {
            if(weights[i] + load > capacity) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        for(int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
        }
        int high = weightsSum(weights);
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int numOfDays = findDays(weights, mid);
            if(numOfDays <= days) {
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
        int[] weights = new int[n];
        for(int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        int days = sc.nextInt();
        int ans = shipWithinDays(weights, days);
        System.out.println(ans);
    }
}
