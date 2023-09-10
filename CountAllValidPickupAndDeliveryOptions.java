import java.util.*;
public class CountAllValidPickupAndDeliveryOptions {
    public static int countOrders(int n) {
        long modulo = 1000000007;
        long places = 2*n;
        long seq = 1;
        for(int i = n; i >= 1; i--) {
            seq = (seq * ((places * (places - 1))) / 2) % modulo;
            places -= 2;
        }
        return (int)seq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = countOrders(n);
        System.out.println(ans);
    }
}
