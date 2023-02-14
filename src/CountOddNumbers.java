public class CountOddNumbers {
    public static void main(String[] args){
        int high = 10;
        int low = 8;
        System.out.println(countOdd(low, high));
    }

    static int countOdd(int low, int high){
        int diff = high - low;
        if(high % 2 == 0 && low % 2 == 0){
            return diff/2;
        }

        else if(high % 2 == 0 || low % 2 != 0){
            return diff/2 + 1;
        }

        else{
            return diff/2 + 1;
        }
    }
}
