public class newworkings {

    public static void main(String[] args) {

        String s = "leetcode";

        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb);
        int left = 0;
        int right = s.length() - 1;
        char lefch = 'z';
        char rightch = 'z';
        while (left<=right){
            while (left<right){
                char chl = Character.toLowerCase(s.charAt(left));
                if (chl == 'a' ||chl == 'e' ||chl == 'i' ||chl == 'o' ||chl == 'u'){
                    lefch = s.charAt(left);
                    break;
                } else {
                    left++;
                }
            }
            while (right>left){
                char chr = Character.toLowerCase(s.charAt(right));
                if (chr == 'a' ||chr == 'e' ||chr == 'i' ||chr == 'o' ||chr == 'u'){
                    rightch = s.charAt(right);
                    break;
                } else {
                    right--;
                }
            }
            char swap = sb.charAt(left);
            sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right,swap);
            left++;
            right--;
        }
        String ss = sb.toString();
        System.out.println(sb);
    }



    //        while (left < right){
//            char ch = Character.toLowerCase(s.charAt(left));
//            if (ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
//                char swap = sb.charAt(left);
//                sb.setCharAt(left,sb.charAt(right));
//                sb.setCharAt(right,swap);
//            }
//
//            left++;
//            right--;
//        }
}
