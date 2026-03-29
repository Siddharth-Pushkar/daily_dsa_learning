import java.util.Arrays;
import java.util.Scanner;

public class arraypractice {




    static  int [] arraybuilder(int arrnum, Scanner intop){
        int [] arr1 = new int[arrnum];  // Array build
        for (int i = 0; i< arr1.length; ++i ){
            System.out.print("Enter "+i+"th number here: ");
            int num = intop.nextInt();       // Input taker
            arr1[i] = num;
        }
        return arr1;
    }

    static int [] arradder(int [] anoi, int pluser){
        // Now to make a method of function to add +1 to each of the element in the array.
        for (int j = 0; j<anoi.length; j++){
            anoi[j] = anoi[j] + pluser;
        }
        return anoi;
    }

    public static void main(String[] args) {
        Scanner intop = new Scanner(System.in);     // Scanner

        System.out.print("Enter your Length of Array here: ");
        int arrnum = intop.nextInt();      // Input taker
        int [] anoi = arraybuilder(arrnum , intop);
        System.out.println(Arrays.toString(anoi));// This is to print the arrays

        System.out.print("Enter your amount you want to increase: ");
        int pluser = intop.nextInt();
        anoi =  arradder(anoi, pluser);
        System.out.println(Arrays.toString(anoi));

    }
}
