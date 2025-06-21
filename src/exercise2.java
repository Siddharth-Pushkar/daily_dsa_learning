import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
        Scanner greet = new Scanner(System.in);
        System.out.println("Welcome to me greeting you");
        System.out.println("tell me your name");

        String  name = greet.next();

        System.out.println("Hello "+name+" I am a simple program");
    }
}
