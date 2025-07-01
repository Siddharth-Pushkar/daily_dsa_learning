import java.util.Scanner;

public class condtionsprac {

    public static void main(String[] args) {
        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }
        Scanner inputop = new Scanner(System.in);

        System.out.println("Enter your name here: ");
        String namech = inputop.next();

        System.out.println("Enter your age here: ");
        int ageo = inputop.nextInt();

        System.out.println("Enter your location here: ");
        String loco = inputop.next();

        if (namech.charAt(0) == 'S'){
            System.out.println("Your name start with S");
        }
        else {
            System.out.println("Your name does not start with S");
        }


        if (ageo < 18){
            System.out.println("You are not an adult");
        } else if (ageo >= 100) {
            System.out.println("Invalid age");
        }
        else {
            System.out.println("You are underage");
        }


    }

}
