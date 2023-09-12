import java.util.*;

public class MinimumDeletionstoMakeCharacterFrequenciesUnique {

    public static int minDeletions(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        int del = 0;
        HashSet<Integer> freqUsed = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        for (int freq : count.values()) {
            while (freq > 0 && freqUsed.contains(freq)) {
                freq--;
                del++;
            }
            freqUsed.add(freq);
        }
        
        return del;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = minDeletions(s);
        System.out.println(ans);
    }

}
