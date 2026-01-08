import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class varargandprac {

    public static void main(String[] args) {

        int a = inpo(354,4675,4367,547,253,78,34,4);

        System.out.println(a);

    }

    static void inpo(int ...v){
        System.out.println(Arrays.toString(v));
        // this is the multiple variable thing

    }
}
