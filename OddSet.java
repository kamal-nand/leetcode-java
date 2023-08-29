import java.util.*;

class OddSet {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int countOdd = 0;
                int countEven = 0;
                int[] arr = new int[2 * n];
                for (int j = 0; j < 2 * n; j++) {
                    arr[j] = sc.nextInt();
                }
                for (int j = 0; j < 2 * n; j++) {
                    if (arr[j] % 2 == 0)
                        countEven++;
                    else
                        countOdd++;
                }
                if (countEven == countOdd)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}