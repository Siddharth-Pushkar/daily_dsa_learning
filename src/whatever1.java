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

        int [] arrop = new int[5];
        arrop[0] = 5;
        arrop[1] = 10;
        arrop[2] = 15;
        arrop[3] = 20;
        arrop[4] = 25;

        int [] arrop2 = {2,4,6,8,10};





    }
}
