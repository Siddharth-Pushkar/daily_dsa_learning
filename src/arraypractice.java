import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class arraypractice {

    static  int [] arraybuilder(int arrnum){
        int [] arr1 = new int[arrnum];  // Array build
        Random rand = new Random();
        for (int i = 0; i< arr1.length; ++i ){
            int num = rand.nextInt(50)+10;       // Input taker
            arr1[i] = num;
        }
        return arr1;
    }

    static  int [] arraybuildersmall(int arrnum){
        int [] arr1 = new int[arrnum];  // Array build
        Random rand = new Random();
        for (int i = 0; i< arr1.length; ++i ){
            int num = rand.nextInt(3);       // Input taker
            arr1[i] = num;
        }
        return arr1;
    }

    static  int [] arraybuildermal(int arrnum, Scanner intop){
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

    static class minmaxer{
        int minval;
        int maxval;
    }

    static minmaxer findminmax(int[] anoi){

        int mini = anoi[0];
        int maxo = anoi[0];
        minmaxer cc = new minmaxer();
        for (int i : anoi) {
            if (i < mini) {
                mini = i;
            }
            else if (i > maxo) {
                maxo = i;
            }
        }
        cc.maxval = maxo;
        cc.minval = mini;
        return cc;
    }

    static class counto {
        int even;
        int odd;
    }
    static counto enocount(int[] anoi){

        int ecount = 0;
        int ocount = 0;
        counto c =  new counto();
        for (int io : anoi){
            if (io%2 == 0){
                ecount++;
            }
            else {
                ocount++;
            }
        }
        c.even = ecount;
        c.odd = ocount;
        return c;
    }


    static int findSecondmax(int[] anoi){
        int max1 = anoi[0];
        int max2 = anoi[0];

        for (int i : anoi){
            if (i > max1) {
                max2 = max1;
                max1 = i;
            }
            if (i != max1 && i>max2){
                max2 = i;
            }
        }
        return max2;
    }
    static class reveredarr {

    }

//    static int[] arrrever(int[] anoi){
//
//        int temp = 0;
//        for (int i= )
//
//        return anoi;
//    }

    static int[] arrrever(int[] anoi){
        int temp = 0;
        int halfarr = anoi.length/2;
        for (int i= 0;i<halfarr;i++){
            temp = anoi[anoi.length-1-i];
            anoi[anoi.length-1-i] = anoi[i];
            anoi[i] = temp;
        }
        return anoi;
    }

    static int[] zeroshifter(int[] anoi0){
        int pos = 0;

        for (int i = 0; i < anoi0.length; i++){
            if (anoi0[i] != 0){
                anoi0[pos] = anoi0[i];
                pos++;
            }
        }
        for (int j = pos; j < anoi0.length;j++){
            anoi0[j] = 0;
        }
        return anoi0;
    }

    static int[] dupremove(int[] anoi0){
        int pos = 1;
        int ini = anoi0[0];

        for (int i = 0; i<=pos;i++) {
            if (anoi0[pos] != anoi0[i]){
                anoi0[pos] = anoi0[i];
                pos++;
            }
        }
        return anoi0;
    }

    public static void main(String[] args) {
        Scanner intop = new Scanner(System.in);     // Scanner
        int[] testarr = {3,3,3,8,8,9,0,0,9};

        System.out.print("Enter your Length of Array here: ");
        int arrnum = intop.nextInt();      // Input taker
        int [] anoi = arraybuilder(arrnum);
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

        minmaxer result1 = findminmax(anoi);
        System.out.println("Maximum number is: "+result1.maxval);
        System.out.println("Minimum number is: "+result1.minval);
        counto result = enocount(anoi);
        System.out.println("No. of even elements "+result.even);
        System.out.println("No. of odd elements "+result.odd);
        System.out.println(findSecondmax(anoi));

        System.out.println(Arrays.toString(arrrever(anoi)));

        System.out.print("Enter your Length of small Array here: ");
        int arrnum2 = intop.nextInt();      // Input taker
        int [] anoi0 = arraybuildersmall(arrnum2);
        System.out.println(Arrays.toString(anoi0));


        System.out.println(Arrays.toString(zeroshifter(anoi0)));
        System.out.println("Zeros Shifted");

        System.out.println(Arrays.toString(dupremove(anoi0)));

    }
}
