import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] result = sortPeople(names, heights);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    static String[] sortPeople(String[] names, int[] heights){

        //creating the hash table to map the names to their height
        Hashtable<Integer, String> table = new Hashtable<Integer, String>();
        int length = heights.length;
        for(int i = 0; i < length; i++){
            table.put(heights[i], names[i]);
        }

        //now sorting the array of heights
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if(heights[j] <  heights[j + 1]){
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }
        String[] sortedNames = new String[length];
        //now our array -> heights is sorted
        // So we iterrate names according to height
        for(int i = 0; i < length; i++){
            String name = table.get(i);
            sortedNames[i] = name;
        }
        return sortedNames;
    }
}
