public class removeduplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,4,4,4,4,};

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int j = 0; j<k;j++){
            System.out.print(nums[j] + " ");
        }

//        int k = 0;
//        int laspos = 0;
//
//        for (int i = 0; i<num.length; i++){
//            if (num[i] != num[k]) {
//                num[k] = num[i];
//                k++;
//            }
//        }
//        for (int j = 0; j<k;j++){
//            System.out.print(num[j] + " ");
//        }

    }
}
