public class newworkings {

    public static void main(String[] args) {

        String s = "Metamorphosis";

        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb);
        int left = 0;
        int right = s.length() - 1;
        char lefch = 'z';
        char rightch = 'z';
        while (left<right){

        }


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
