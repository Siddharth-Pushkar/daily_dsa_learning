import java.util.Arrays;

public class twopointers {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {1,2,3,4,5,4,3,2,1};

        int ll = 0;
        int rr = arr2.length-1;
        boolean palin = true;

        while (ll <  rr){
            if (arr2[ll] != arr2[rr]){
                palin = false;
                break;
            }
            ll++;
            rr--;
        }
        System.out.println(palin);
        System.out.println(Arrays.toString(arr2));
    }
}
