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
    }
}
