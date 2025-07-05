public class loopsprac {

    public static void main(String[] args) {

        int numup;

        for (int i = 0; i != 12; i++){
            for (int j = 10; j>=i; j--){
                System.out.print("*");

            }
            System.out.println();
        }


        for (int i4 = 0; i4 != 5; i4++){
            for (int j2 = 1; j2 <= i4; j2++) {
                System.out.print(j2);
            }
            System.out.println();
        }

        for (int i5 = 0; i5 != 6; i5++){
            for (int j3 = 1; j3 <= i5; j3++){
                for (int k = 1; k != j3; k++){
                    System.out.print(k);
                }
                System.out.println();
            }
            System.out.println();
        }


        for (int i6 = 0; i6 !=10; i6++){
            for (int j4 = 1; j4<=i6; j4++){
                System.out.print(i6);
            }
            System.out.println();
        }


        for (int i1 = 0; i1 <=20; i1++){
            if (i1 % 2 == 0) {
                System.out.print(i1 + " ");
            }
        }
        System.out.println();

        int nn = 5;
        int sum = 0;

        for (int i2 = 0; i2<=nn; i2++){
            sum = sum + i2;
        }
        System.out.println("the sum is " +sum);
    }
}
