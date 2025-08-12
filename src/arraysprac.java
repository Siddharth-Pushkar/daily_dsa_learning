import java.util.Arrays;

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

//        for (int i2 = marks.length; i2>=0; i2-- ){
//
//            System.out.println(marks[i2]);
//        }

        System.out.println(marks.length);

        for (int i2 = marks.length-1; i2 >= 0; i2--){
            System.out.println(marks[i2]);
        }

        int [] marks_2 = new int[5];
        int index2 = 0;

        for (int i3 = marks.length-1; i3 >=0; i3--){
            marks_2 [index2] = marks[i3];
            index2++;
        }
        System.out.println("Array Update complete");
        System.out.println("This is your second array");
        for (index2 = 0; index2 < marks_2.length; index2++){
            System.out.println(marks_2[index2]);
        }

        int [] numbers1 = {1,3,5,7,9,11};
        int [] numbers2 = {4,8,2,98,3,7,3,7,3,6};
        boolean issorted = true;

        for (int i4 = 1; i4 < numbers2.length; i4++){
            if (numbers2[i4] < numbers2[i4-1]){
                issorted = false;
            }
        }

        if (issorted == false){
            System.out.println("The Array is not sorted");
        } else {
            System.out.println("Array is sorted");
        }


        int max2 = arr[0];
        int secmax= 0;

        for (int i5 = 0; i5 < arr.length; i5++){
            if (max2 < arr[i5]){
                secmax = max2;
                max2 = arr[i5];
            }
        }

        System.out.println(secmax);





    }
}
