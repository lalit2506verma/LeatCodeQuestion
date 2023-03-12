import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetAfterSortingArray {
    public static void main(String[] args){
        int[] nums = {1,3,5,6,2,4,9,8};
        List<Integer> result = targetIndices(nums, 2);
        System.out.println(result);
    }

    static List<Integer> targetIndices(int[] nums, int target){
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                list.add(i);
            }
        }

        return list;
    }
}
