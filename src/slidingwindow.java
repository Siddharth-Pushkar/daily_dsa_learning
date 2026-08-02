public class slidingwindow {

    public static void main(String[] args) {
        int[] nums = {5,8,3,6,2,1};
        int k = 4;
        int firstsum = 0;
        int j = 0;

        for (int i = 0; i<k;i++){
            firstsum += nums[i];
        }

        System.out.print(firstsum+" ");

        while (k < nums.length){
            firstsum += nums[k] - nums[j];
            System.out.print(firstsum+" ");
            k++;
            j++;
        }
    }
}
