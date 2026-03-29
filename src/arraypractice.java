import java.util.Arrays;
import java.util.Scanner;

public class arraypractice {




    public static void main(String[] args) {


        Scanner intop = new Scanner(System.in);  // Scanner



        int [] arr1 = new int[5]; // Input taker

        for (int i = 0; i< arr1.length; ++i ){
            int num = intop.nextInt();
            arr1[i] = num;
        }


        System.out.println(Arrays.toString(arr1)); // This is to print the arrays




    }
}
