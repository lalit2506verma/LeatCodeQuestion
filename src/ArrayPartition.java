import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args){
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }

    static int arrayPairSum(int[] nums){
        bubbleSortArray(nums, nums.length);  // else for large data set use Arrays.sort();

        int sum = 0;
        for (int j = 0; j < nums.length; j=j+2) {
            //int min = Math.min(nums[j], nums[j + 1]);
            sum = sum + nums[j];
        }

        return sum;
    }

    static void bubbleSortArray(int[] arr, int n){    // n is arr.length

        if(n == 1){                                   // passes are done
            return;
        }
        for (int i = 0; i < n - 1 ; i++) {
            if(arr[i] > arr[i + 1]){                 // check if elements are in order
                int temp = arr[i];                 // if not then swap there value
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSortArray(arr, n-1);
    }
}
