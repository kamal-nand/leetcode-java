import java.util.*;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();

        Arrays.sort(sch);
        Arrays.sort(tch);
        for(int i = 0; i < sch.length; i++) {
            if(tch[i] != sch[i]) {
                return tch[i];
            }
        }
        return tch[tch.length - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char ans = findTheDifference(s, t);
        System.out.println(ans);
    }
}
