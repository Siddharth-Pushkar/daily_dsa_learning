public class subarrayavgthresh {

    public static void main(String[] args) {


        int[] nums = {2,2,2,2,5,5,5,8};
        int k = 3;
        int right = k;
        int firstsum = 0;
        int threshold = 4;
        int thre = 0;
        int avgcurr = 0;
        int left = 0;

        for (int i = 0; i<k;i++){
            firstsum += nums[i];
        }
        avgcurr = firstsum / k;
        if (avgcurr >= threshold){
            thre++;
        }

        while (right < nums.length){
            firstsum += nums[right] - nums[left];
            avgcurr = firstsum / k;
            if (avgcurr >= threshold){
                thre++;
            }
            left++;
            right++;
        }

        System.out.println(thre);

    }
}
