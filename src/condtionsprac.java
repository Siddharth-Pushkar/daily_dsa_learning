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

        if (ageo > 18){
            System.out.println("You are an adult");
        } else if (ageo >= 100) {
            System.out.println("Invalid age");
        }
        else {
            System.out.println("You are underage");
        }

        switch (loco) {

            case "Delhi":
                System.out.println("You live close to me");
                break;

            case "Goa":
                System.out.println("You live very far from me");
                break;

            case "Bangalore":
                System.out.println("You live very far from me");
                break;

            default:
                System.out.println("You live no where close to me");
                break;
        }
        Scanner urlop = new Scanner(System.in);

        System.out.println("Enter your URL here: ");
        String urlcheck = urlop.next();

        if (urlcheck.endsWith(".com")){
            System.out.println("It is a Commercial Website");
        } else if (urlcheck.endsWith(".org")) {
            System.out.println("It is a Organization Website");
        } else if (urlcheck.endsWith(".in")) {
            System.out.println("It is an Indian Website");
        }
    }
}
