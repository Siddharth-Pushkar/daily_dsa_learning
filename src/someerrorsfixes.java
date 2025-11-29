import java.util.Scanner;

public class someerrorsfixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your age 2: ");
        String age2 = sc.nextLine();


        System.out.print("Enter age: ");
        int age3 = sc.nextInt();

        System.out.print("Enter name: ");
        String name = sc.nextLine(); // Skipped!

        System.out.println("Name: " + name + ", Age: " + age);

        System.out.println("Age "+age+" Age2 "+age2);
    }
}
