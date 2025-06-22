import java.util.Scanner;


public class exercise5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter your number to encrypt: ");
        int num1 = num.nextInt();

        int eresu = num1 + 8;
        System.out.println("Here is you encrypted number "+eresu);

    }
}
