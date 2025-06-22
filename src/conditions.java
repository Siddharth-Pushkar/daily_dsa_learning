import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner inop = new Scanner(System.in);

        System.out.println("Welcome to my first code");
        System.out.println("This is Java Calculator");
        int ans = 0;
        while (true) {

            System.out.println("Enter your first number: ");
            int num1 = inop.nextInt();
            System.out.println("Enter your second number: ");
            int num2 = inop.nextInt();

            System.out.println("Here is all the operations that you can apply");
            System.out.println("1 is Addition");
            System.out.println("2 is Subtraction");
            System.out.println("3 is Multiplication");
            System.out.println("4 is Division");
            System.out.println("0 is to Exit");

            int ope = inop.nextInt();

            if (ope != 0) {

                if (ope == 1) {
                    ans = num1 + num2;
                }
                else if (ope == 2) {
                    ans = num1 - num2;
                }
                else if (ope == 3) {
                    ans = num1 * num2;
                }
                else if (ope == 4) {
                    ans = num1 / num2;
                }
                else {
                    System.out.println("Invalid Input");
                }
            }
            else if (ope == 0) {
                System.out.println("Thanks for using");
                break;
            }

            System.out.print("Your answer is ");
            System.out.println(ans);
        }
    }

}



















