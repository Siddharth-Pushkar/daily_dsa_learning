public class practicemethods {
    public static void takinginto(int num){
        if (num < 18){
            System.out.println("Not an adult");
            return;
        }
        System.out.println("An adult");
    }


    public static void recurnum(int num2) {
        if (num2 == 0) return;
        System.out.print(num2+" ");
        recurnum(num2-1);
    }

    public static void sumnum(int num3) {
        if (num3 == 0) return;

    }

    public static void main(String[] args) {
        takinginto(16);
        recurnum(15);
    }
}
