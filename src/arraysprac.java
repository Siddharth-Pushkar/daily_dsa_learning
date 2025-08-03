public class arraysprac {
    public static void main(String[] args) {

        int [] arr = new int[10];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        arr [3] = 4;
        arr [4] = 5;
        arr [5] = 6;
        arr [6] = 7;
        arr [7] = 8;
        arr [8] = 9;
        arr [9] = 10;


        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        for (int j=0; j< arr.length; j++){
            sum += arr[j];
        }
        System.out.println(sum);

        int [] marks = {10,20,30,40,50};

    }
}
