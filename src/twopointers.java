import java.util.Arrays;

public class twopointers {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = arr;
        int left = 0;
        int right = arr.length - 1;

        while (left < right){

            arr[left] = arr2[right];
            arr[right] = arr2[left];

            left++;
            right--;
        }

        for (int i = 0; i< arr2.length; i++){
            if (arr[i] != arr2[i]){
                System.out.println(false);
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
