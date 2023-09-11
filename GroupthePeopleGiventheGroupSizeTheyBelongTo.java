import java.util.*;
public class GroupthePeopleGiventheGroupSizeTheyBelongTo {

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < groupSizes.length; i++) {
            int person = i;
            int groupSize = groupSizes[i];
            List<Integer> group = map.getOrDefault(groupSize, new ArrayList<>());
            group.add(person);
            map.put(groupSize, group);
            if(group.size() == groupSize) {
                res.add(group);
                map.remove(groupSize);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] groupSizes = new int[n];
        for(int i = 0; i < n; i++) {
            groupSizes[i] = sc.nextInt();
        }
        List<List<Integer>> ans = groupThePeople(groupSizes);
        System.out.println(ans);
    }
}
