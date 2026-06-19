import java.util.Scanner;

public class whatever1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input here: ");
        int inpo = sc.nextInt();

        if (inpo > 1){
            System.out.println("The input is positive");
        }
        else {
            System.out.println("The input is negative");
        }


    }
}
