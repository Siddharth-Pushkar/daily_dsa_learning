import java.util.Scanner;
import java.lang.Math;

public class exercise5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter your v here: ");
        int v = num.nextInt();

        System.out.println("Enter your u here: ");
        int u = num.nextInt();

        System.out.println("Enter your a here: ");
        int a = num.nextInt();

        double final_exp ;

        final_exp = ((Math.pow(v,2) - (Math.pow(u,2)) / (2*a*5)));

        System.out.println("Your final result is :" + final_exp);

    }
}
