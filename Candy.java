import java.util.*;

public class Candy {
    public static int candy(int[] ratings) {
        int totalCandies = 0;
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        for(int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            } 
        }

        for(int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i+1]) {
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }

        for(int i = 0; i < candies.length; i++) {
            totalCandies += candies[i];
        }
        return totalCandies;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }
        int res = candy(ratings);
        System.out.println(res);
    }

}
