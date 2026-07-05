public class twopointpract {
    public static void main(String[] args) {

        String tester = "abcdef";

        int ll = 0;
        int rr = tester.length() - 1;
        while (ll < rr){
            char chl = tester.charAt(ll);
            char chr = tester.charAt(rr);
            System.out.print(chl);
            System.out.print(chr);
            System.out.println();

            ll++;
            rr--;
        }

        int[] test = {1,0,2,0,3,0,4,0,5,0,6};

        int i = 0;
        int j = 0;

        while (i < test.length){
            if (test[i] != 0){
                System.out.println(test[j]);
                j++;
            }
            i++;
        }

    }
}
