import java.util.Arrays;
import java.util.Scanner;

public class arraysmorework {


    static void operations(int arr []){

        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);

    }

    static void oputput(int ll[]){
        for (int i = 0; i < ll.length; i++) {
            System.out.println();
            System.out.print(ll[i]+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        arr1[0]= 25;
        arr1[1]=54;
        arr1[2]=46;
        arr1[3]=86;
        arr1[4]=436;

        Scanner inpo = new Scanner(System.in);

        int[] arr2 = new int[6];
        for (int a = 0; a < arr2.length; a++) {
            arr2[a] = inpo.nextInt();
        }

        oputput(arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.print(Arrays.toString(arr1));

    }
}
