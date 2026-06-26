import java.util.Arrays;

public class runningsum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] enda = new int[arr.length];

        for (int i = 0; i < arr.length; ++i) {
            int sum = arr[0];
            for (int j = 1; j <= i; ++j) {
                sum = sum + arr[j];
            }
            enda[i] = sum;
        }
        for (int x : enda){
            System.out.print(x + " ");
        }
        System.out.println();


        // pivot index
        int[] arr1 = {1,7,3,6,5,6};
        int[] rightsum = new int[arr1.length];
        int[] leftsum = new int[arr1.length];
        int pivot = 0;
        int sum = 0;
        int currentSum = 0;
        int resultIndex = 0;
        for (int i = 0; i<arr1.length; ++i){
            sum = sum + arr1[i];
            leftsum[i] = sum;
        }
        for (int i = arr1.length - 1; i >= 0; i--) {
            currentSum += arr1[i];
            rightsum[i] = currentSum;
            resultIndex++;
        }

        for (int x : rightsum){
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x : leftsum){
            System.out.print(x + " ");
        }

        System.out.println();
        for (int i = 0; i<arr1.length; ++i){

            if (leftsum[i] == rightsum[i]){
                pivot = i;
                break;
            }
        }
        System.out.println(pivot);


        int maxo1 = 0;
        for (int i = 0; i<arr1.length; i++){
             if (arr1[i] > maxo1){
                maxo1 = arr1[i];
            } else {
                 arr1[i] = maxo1;
             }
        }

        System.out.println(Arrays.toString(arr1));









    }
}
