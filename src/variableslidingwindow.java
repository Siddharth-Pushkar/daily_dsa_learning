import java.util.HashSet;

public class variableslidingwindow {
    public static void main(String[] args) {

        String s = "abcabcabc";

        int right = 0;
        int left = 0;
        int maxnrwindow = 0;
        HashSet<Character> sb = new HashSet<>();




        while (right<s.length()){
            if (!sb.add(s.charAt(right))){
                sb.remove(s.charAt(left));
                left++;
            } else {
                sb.add(s.charAt(right));
                right++;
            }
            if (sb.size() > maxnrwindow){
                maxnrwindow = sb.size();
            }
        }
        System.out.println(maxnrwindow);
    }
}
