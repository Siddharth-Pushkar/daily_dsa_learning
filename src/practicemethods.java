public class practicemethods {
    public static void takinginto(int num){
        if (num < 18){
            System.out.println("Not an adult");
            return;
        }
        System.out.println("An adult");
    }






    public static void main(String[] args) {
        takinginto(16);
    }
}
