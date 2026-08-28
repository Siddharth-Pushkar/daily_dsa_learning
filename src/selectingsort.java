public class selectingsort {

    public static void main(String[] args) {

        int[] nums = {7,3,6,2,5};


        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

//        int minIn = 0;
//        int count = 0;
//        for (int i = 0; i<nums.length; i++){
//            minIn = i;
//            for (int j = i+1;j<nums.length;j++){
//                if (nums[j] < nums[minIn]){
//                    minIn = j;
//                    count++;
//                }
//            }
//            int temp = nums[minIn];
//            nums[minIn] = nums[i];
//            nums[i] = temp;
//        }
        for (int x : nums){
            System.out.print(x+" ");
        }
//        System.out.println("The number of swaps made are: "+ count);
    }
}
