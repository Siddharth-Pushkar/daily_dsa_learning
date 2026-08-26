public class selectingsort {

    public static void main(String[] args) {

        int[] nums = {7,3,6,2,5};

        int minIn = 0;
        int minval = 0;

        for (int i = 0; i<nums.length; i++){
            minIn = nums[i];
            for (int j = i+1;j<nums.length;j++){
                if (nums[j] > minval){
                    minval = nums[j];
                    minIn = j;

                }
            }

            int temp = nums[minIn];
            nums[minIn] = nums[i];
            nums[i] = nums[minIn];
        }
        for (int x : nums){
            System.out.print(x+" ");
        }
    }
}
