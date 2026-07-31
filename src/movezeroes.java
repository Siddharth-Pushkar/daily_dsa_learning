import java.lang.reflect.Array;

public class movezeroes {
    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3,0,4,0,5};
        int j = 0;

        for (int i = 0; i<nums.length; i++){
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length){
            nums[j] = 0;
            j++;
        }
        for (int x : nums){
            System.out.print(x+" ");
        }



//        while (i<nums.length){
//            if (nums[i] == 0){
//                j = i;
//                i++;
//            } else {
//                int lastseen = j;
//                int current = i;
//                while (current<nums.length){
//                    int swap = nums[current];
//                    nums[current] = nums[lastseen];
//                    nums[lastseen] = swap;
//                    current++;
//                    lastseen++;
//                }
//            }
//        }

//        while (left<right){
//            while (left<right) {
//                if (nums[left] == 0) {
//                    break;
//                } else {
//                    left++;
//                }
//            }
//            while (right>left){
//                if (nums[right] == 0){
//                    right--;
//                } else {
//                    int swap = nums[left];
//                    nums[left] = nums[right];
//                    nums[right] = swap;
//                }
//            }
//        }
//
//        for (int x : nums){
//            System.out.print(x+" ");
//        }
    }
}
