import java.util.HashMap;

public class wordpattern {

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean isittrue = true;

        String[] srr = s.split(" ");
        HashMap<Character, String> mapST = new HashMap<>();
        HashMap<String, Character> mapTS = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);
            String c2 = srr[i];

            if (mapST.containsKey(c1) && mapST.get(c1) != c2) {
                isittrue = false;
            }
            if (mapTS.containsKey(c2) && mapTS.get(c2) != c1) {
                isittrue = false;
            }

            mapST.put(c1, c2);
            mapTS.put(c2, c1);
        }

        System.out.println(isittrue);


    }
}
