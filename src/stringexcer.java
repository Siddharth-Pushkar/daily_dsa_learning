import java.util.Scanner;

public class stringexcer {

    public static void main(String[] args) {
        String name;
        String edited;

        Scanner chang = new Scanner(System.in);


        name = "This is a text line for testing purpose";
        System.out.println(name.replace(" ","_"));

        edited = name.replace(" ","_");
        System.out.println(edited);

        System.out.println("Enter your name here: ");
        String name2 = chang.next();

        System.out.println("Enter your age here: ");
        int agi = chang.nextInt();

        System.out.printf("Hi, My name is %s , and i am %d years old.",name2, agi);



    }
}
