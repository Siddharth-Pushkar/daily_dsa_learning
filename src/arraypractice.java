import java.util.Arrays;
import java.util.Scanner;

public class arraypractice {


    static  int [] arraybuilder(int arrnum){
        Scanner intop = new Scanner(System.in);  // Scanner



        int [] arr1 = new int[arrnum];  // Array build

        for (int i = 0; i< arr1.length; ++i ){
            System.out.print("Enter "+i+"th number here: ");
            int num = intop.nextInt();       // Input taker
            arr1[i] = num;
        }


        return arr1;
    }


    public static void main(String[] args) {


        Scanner intop = new Scanner(System.in);  // Scanner

        System.out.print("Enter your Length of Array here: ");

        int arrnum = intop.nextInt();      // Input taker

        int [] anoi = arraybuilder(arrnum);

        System.out.println(Arrays.toString(anoi)); // This is to print the arrays




    }
}
