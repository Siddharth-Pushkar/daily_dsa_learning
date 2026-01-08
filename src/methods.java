public class methods {



}


class main2 {

    static int factorial(int aa) {
        if (aa == 1) return 1;
        return aa * factorial(aa-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(45)+" ");
    }
}
