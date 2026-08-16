public class binarysearch {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[] nums2 = {1,2,2,2,3,3,6,6,9,10};
        int t = 2;
        int k = 6;
        int left = 0;
        int right = nums.length - 1;
        int laenind = -1;
        int indk = -1;

//        while (left<=right){
//            int mid = left + (right-left)/2;
//
//            if (nums2[mid] == t) {
//                laenind = mid;
//                right = mid - 1;
//            } else if (nums[mid] < t) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }

        System.out.println(laenind);

//        while (left <= right){
//            int mid = left + (right - left)/2;
//
//            if (nums[mid] == k){
//                indk = mid;
//                break;
//            } else if (nums[mid] < k) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }

//        System.out.println("The index of the Target is :" + indk);

    }
}
