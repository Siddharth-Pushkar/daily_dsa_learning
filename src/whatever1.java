import java.util.Scanner;

public class whatever1 {


    public static int adderop(int a){
        int secretnum = 23;

        int finalrun = a + secretnum;

        return finalrun;
    }

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
        int o = inpo;
        for (int i = 0; i<inpo; i++){
            System.out.println("Count "+i);
        }
        while (o > 0){
            System.out.println(o);
            o--;
        }
        System.out.println(adderop(inpo));



    }
}
