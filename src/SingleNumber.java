public class SingleNumber {
    public static void main(String[] Args){
        int[] nums = {2, 2, 1};
        int result = SingleNumber.singleNumber(nums);
        System.out.println(result);

    }

    public static int singleNumber(int[] nums){
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            boolean flag = true;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == nums[i] && i != j){
                    flag = false;
                }
            }
            if(flag){
                temp = nums[i];
                break;
            }
        }
        return temp;
    }
}
