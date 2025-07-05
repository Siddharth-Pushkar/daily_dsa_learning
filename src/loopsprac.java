public class loopsprac {

    public static void main(String[] args) {

        int numup;

        for (int i = 0; i != 12; i++){
            for (int j = 10; j>=i; j--){
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i1 = 0; i1 <=20; i1++){
            if (i1 % 2 == 0){
                System.out.print(i1+" ");
            }
        }
    }
}
