import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class varargandprac {

    public static void main(String[] args) {

//        inpo(354,4675,4367,547,253,78,34,4);
//
//    }
//
//    static void inpo(int ...v){
//        System.out.println(Arrays.toString(v));
//        // this is the multiple variable thing


        Scanner s = new Scanner(System.in);
        int innum = s.nextInt();
        boolean checker = isarmstrong(innum);
        System.out.println(checker);

    }

    static boolean isprime(int innum) {

        int c = 2;

        if(innum <= 1){
            return false;
        }
        while (c < innum){
            if (innum % c == 0){
                return false;
            }
            c++;
        }
        return c == innum;
    }

    static boolean isarmstrong(int nn){
        int cc = nn;
        int cc2 = 0;

        while (cc>0){
            int rem = cc %10;
            cc = cc/10;
            cc2 = cc2 + (rem*rem*rem);

        }
        return cc2 == nn;
    }
}
