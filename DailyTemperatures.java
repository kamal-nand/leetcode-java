import java.util.*;

public class DailyTemperatures {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int length = sc.nextInt();
            int[] temperatures = new int[length];
            for (int i = 0; i < length; i++) {
                temperatures[i] = sc.nextInt();
            }
            int[] res = new int[length];
            res = dailyTemperatures(temperatures);
            for (int i = 0; i < length; i++) {
                System.out.print(res[i] + " ");
            }
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i = temperatures.length - 1; i >= 0; i--) 
        {
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()] )
            {
               st.pop();
            }
            if( !st.isEmpty() )
            ans[i] = st.peek() - i;
            st.push(i);
        }
        return ans;
    }

}
