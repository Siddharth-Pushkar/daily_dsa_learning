public class loopsprac {

    public static void main(String[] args) {

        int numup;

        for (int i = 0; i != 12; i++){
            for (numup = 10; numup>=i;){
                System.out.print(numup);
                numup--;
            }
            System.out.println();
        }

    }
}
