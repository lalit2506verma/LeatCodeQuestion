import java.util.Arrays;

public class Main {
    static void insertionSort(int[] arr){
        int n =  arr.length;

        for(int i=0; i < n-1; i++){
            int min_idx = i;

            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }


    static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){

            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,-5,3,2,1,0,45,67,89,45,-5,-98,45,78,12,6,4,66,789,-45,13,67,21,-55,-34,70,79};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}