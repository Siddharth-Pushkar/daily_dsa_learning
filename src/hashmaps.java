import java.util.HashMap;

public class hashmaps {
    public static void main(String[] args) {

        HashMap<String, Integer> markos = new HashMap<>();

        markos.put("M",44);
        markos.put("E",347);
        markos.put("S",467);
        markos.put("P",9);
        markos.put("C",12);
        markos.put(" ",8);
        markos.put("  ",0);

        System.out.println(markos.get(44));
        System.out.println(markos.get("C"));
        System.out.println(markos.get("E"));
        System.out.println(markos.get(" "));
        System.out.println(markos.get("  "));



    }
}
