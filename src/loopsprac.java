public class loopsprac {

    public static void main(String[] args) {

        int numup = 0;

        for (int i = 0; i != 10; i++){
            for (numup = 0; numup<=i;){
                System.out.print(numup);
                numup++;
            }
            System.out.println();
        }

    }
}
