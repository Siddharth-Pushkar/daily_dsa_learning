import java.util.Scanner;

public class textinputs {
    public static void main(String[] args) {
        Scanner newtext = new Scanner(System.in);

        System.out.println("Enter your name here: ");
        String name = newtext.next();

        System.out.println("Enter your age here: ");
        int agew = newtext.nextInt();

        System.out.println("Enter your fav food here :");
        String food = newtext.next();

        System.out.println("Enter your current location here: ");
        String locoa = newtext.next();


        System.out.println("Hi, My name is " +name+ " and i am " +agew+ " years old\nMy favorate food is " +food+ " and i live is " + locoa);
    }
}
