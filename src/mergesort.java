public class mergesort {

    static void merge (int[] nums, int[] lefthalf, int[] righthalf){
        int leftlen = lefthalf.length;
        int rightlen = righthalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftlen && j < rightlen) {
            if (lefthalf[i] <= righthalf[j]) {
                nums[k] = lefthalf[i];
                i++;
            }
            else {
                nums[k] = righthalf[j];
                j++;
            }
            k++;
        }
        while (i < leftlen) {
            nums[k] = lefthalf[i];
            i++;
            k++;
        }
        while (j < rightlen) {
            nums[k] = righthalf[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] nums){
        int inputlen = nums.length;
        if (inputlen < 2){
            return;
        }
        int midind = inputlen / 2;
        int[] lefthalf = new int[midind];
        int[] righthalf = new int[inputlen - midind];


        for (int i = 0; i<midind; i++){
            lefthalf[i] = nums[i];
        }
        for (int i = midind; i<inputlen; i++){
            righthalf[i - midind] = nums[i];
        }
        mergeSort(lefthalf);
        mergeSort(righthalf);
        merge(nums, lefthalf, righthalf);
    }

    public static void main(String[] args) {

        int[] nums= {542521,6545,246,6,346,6,36,546,46,};
        mergeSort(nums);

        for (int x : nums){
            System.out.print(x + " ");
        }

    }

}
