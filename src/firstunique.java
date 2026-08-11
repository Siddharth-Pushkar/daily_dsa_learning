import java.util.HashMap;

public class firstunique {

    public static void main(String[] args) {

        String s = "leetcode";
        HashMap<Character, Integer> set = new HashMap<>();
        int inival = 1;
        int uniq = -1;
        for (int i = 0; i<s.length(); i++){
            if (!set.containsKey(s.charAt(i))){
                set.put(s.charAt(i), inival);
            } else {
                set.put(s.charAt(i), set.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (set.get(s.charAt(i)) == 1) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(uniq);

    }
}
