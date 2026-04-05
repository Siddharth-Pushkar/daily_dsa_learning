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
    static int [] arrmultor(int [] anoi, int multor){
        // Now for a multipler of each element which will use other method as well
        for (int jj = 0; jj <anoi.length; jj++){
            anoi[jj] = anoi[jj] * multor;
        }
        return anoi;
    }

    static int findmax(int[] anoi) {
        // To find max element in the array.
        int maxo = anoi[0];
        for (int i : anoi) {
            if (i > maxo) {
                maxo = i;
            }
        }
        return maxo;
    }

    static int findmin(int[] anoi){
        // To find mini element in the array.
        int mini = anoi[0];

        for (int i : anoi) {
            if (i < mini) {
                mini = i;
            }
        }
        return mini;
    }
    static class counto {
        int even;
        int odd;
    }

    static counto enocount(int[] anoi){

        int ecount = 0;
        int ocount = 0;
        counto c =  new counto();
        c.even = ecount;
        c.odd = ocount;

        for (int io : anoi){
            if (io%2 == 0){
                ecount++;
            }
            else {
                ocount++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner intop = new Scanner(System.in);     // Scanner

        System.out.print("Enter your Length of Array here: ");
        int arrnum = intop.nextInt();      // Input taker
        int [] anoi = arraybuilder(arrnum , intop);
        System.out.println(Arrays.toString(anoi));// This is to print the arrays

        System.out.print("Enter your amount you want to increase: ");
        int pluser = intop.nextInt();
        arradder(anoi, pluser);
        System.out.println(Arrays.toString(anoi));

        System.out.print("Enter your amount you want to multipy: ");
        int multor = intop.nextInt();
        arrmultor(anoi, multor);
        System.out.println(Arrays.toString(anoi));

        System.out.println(findmax(anoi));
        System.out.println(findmin(anoi));
        System.out.println(enocount(anoi));

    }
}
