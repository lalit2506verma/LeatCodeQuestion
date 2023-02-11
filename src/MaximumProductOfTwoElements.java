public class MaximumProductOfTwoElements {
    public static void main(String[] args) {
        int[] nums= {3,4,5,2};
        System.out.println(maxProduct(nums));
    }

    static int maxProduct(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] < nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return (nums[0]-1)*(nums[1]-1);
    }
}