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

        System.out.println(marks[3]);

        int max = arr[0];
        for (int jj = 0; jj < arr.length; jj++){
            if (arr[jj] > max){
                max = arr[jj];
            }
        }
        System.out.println(max);


        int target = 20;
        boolean found = false;

        for (int ii = 0; ii < arr.length; ii++){
            if (target == arr[ii]){
                found = true;
                System.out.println(target+" exist in the array at the index of "+ ii);
                break;
            }
        }
        if (found == false){
            System.out.println(target+" does not exist in the array");
        }

        for (int i1; ){

        }

    }
}
