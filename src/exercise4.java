import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {

        Scanner checker = new Scanner(System.in);

        System.out.println("Enter your number here");

        boolean value = checker.hasNextInt();

        if (value == false){
            
            System.out.println("This is not an Integer");
        } else {
            System.out.println("This is an Integer");
        }


    }
}
