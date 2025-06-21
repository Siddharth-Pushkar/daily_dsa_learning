import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        //Making a scanner to take input
        Scanner nums = new Scanner(System.in);

        System.out.println("Welcome to the percentage finder");
        System.out.println("Enter all 5 subjects marks");
        // This is the c
        int num1 = nums.nextInt();
        int num2 = nums.nextInt();
        int num3 = nums.nextInt();
        int num4 = nums.nextInt();
        int num5 = nums.nextInt();

        System.out.println("Enter your max marks that can be obtained");
        double maxo = nums.nextInt();
        double sum2 = num1 + num2 + num3 + num4 + num5;

        double resulto = (sum2/maxo)*100;

        System.out.println("Here you go");
        System.out.println(resulto);
    }
}
