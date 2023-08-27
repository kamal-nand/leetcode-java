import java.util.*;

public class ReverseStringWord {

    public static String reverseWords(String s) {
        String[] split = s.split("\\s+");
        StringBuilder sbr = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            String temp = split[i];
            sbr.append(temp);
            sbr.append(" ");
        }
        return sbr.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverseWords(str);
        System.out.println(ans);
    }
}
