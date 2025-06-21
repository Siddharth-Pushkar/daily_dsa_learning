import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner measure = new Scanner(System.in);

        System.out.println("Enter your value here");
        float value = measure.nextFloat();

        double coversion = value * 1000;

        System.out.println("Here is the answer in meters");
        System.out.println(coversion+" KM");
    }
}
