import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] result = sortPeople(names, heights);
        for (String s : result) {
            System.out.println(s);
        }
    }

    static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        String[] sortedNames = new String[heights.length];
        int i = 0;
        while (map.size() < heights.length) {
            if (!map.containsKey(heights[i])) {
                map.put(heights[i], names[i]);
            }
            i++;
        }

        Arrays.sort(heights);
        for(int j=heights.length-1;j>=0;j--){
            sortedNames[j] = map.get(heights[heights.length-j-1]);
        }
        return sortedNames;
    }
}
