import java.util.Scanner;
import java.lang.Math;

public class exercise5 {


    public static int numappr(int[] arr, int a){
        int appmax = 0;
        for (int x: arr){
            if (x == a){
                ++appmax;
            }
        }
        return appmax;
    }


    public static void main(String[] args) {

        int [] arr = new int[5];

        arr[0]=1;
        arr[1]=5;
        arr[2]=1;
        arr[3]=7;
        arr[4]=1;

        Scanner inpu = new Scanner(System.in);
        System.out.print("Enter the number you want to find the frequency of: ");
        int inpur = inpu.nextInt();

        System.out.println("The frequency of that number in the array is :"+ numappr(arr,inpur));





    }
}
