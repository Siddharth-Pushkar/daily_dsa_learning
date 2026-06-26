import java.util.Arrays;

public class twopointers {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int i = 0; i<arr.length; i++){
            for (int j = arr.length -1; j>=0; j--){
                if (arr[i] != arr[j]){
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                } else {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
