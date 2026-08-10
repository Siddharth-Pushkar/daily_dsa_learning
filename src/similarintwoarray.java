import java.util.HashSet;

public class similarintwoarray {
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        HashSet<Integer> n3 = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }
        }
        System.out.println(intersect);

    }
}
