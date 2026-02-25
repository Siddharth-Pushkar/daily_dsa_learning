import java.util.Scanner;

public class arrayworkings2 {

    static int [] arrfeed(int size){

        // This method takes input from a user and feeds it into an array.
        Scanner inpu = new Scanner(System.in);
        int[] arr1 = new int[size];

        for (int i = 0; i < size; i++){    // Input feed loop
            System.out.println("Element "+(i+1));
            arr1[i] = inpu.nextInt();
        }
        return arr1;
    }

    static void printarrop(int arrr[]){

        // This method is to print any array you have or make.
        for (int j : arrr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        System.out.println("Enter your array size below: ");
        int sizo = inpu.nextInt();
        int[] arr1 = arrfeed(sizo);

        printarrop(arr1);


    }
}
