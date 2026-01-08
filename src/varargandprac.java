import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class varargandprac {

    public static void main(String[] args) {

        inpo(354,4675,4367,547,253,78,34,4);

    }

    static void inpo(int ...v){
        System.out.println(Arrays.toString(v));
        // this is the multiple variable thing

    }
}
