import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {


//        Here i will be working to understand hashset


        HashSet<Integer> set1 = new HashSet<>();

        set1.add(20);
        set1.add(2);
        set1.add(3);
        set1.add(47);
        set1.add(87);

        System.out.println(set1.contains(20));
        System.out.println(set1.size());

    }
}
