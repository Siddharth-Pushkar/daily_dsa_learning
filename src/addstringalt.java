import java.util.HashSet;

public class addstringalt {
    public static void main(String[] args) {


        String str1 = "abc";
        String str2 = "pqr";

        int len1 = str1.length();
        int len2 = str1.length();
        int a = 0;
        int b = 0;
        int k = 0;
        char[] result = new char[len1+len2];
        while (a < len1 && b < len2){
            result[k++] = str1.charAt(a++);
            result[k++] = str2.charAt(b++);
        }
        while (a < len1){
            result[k++] = str1.charAt(a++);
        }
        while (b < len2){
            result[k++] = str2.charAt(b++);
        }

        String merged = new String(result);
        System.out.println(merged);


        String ww1 = "abc";
        String ww2 = "pqrs";

        int i = 0;
        int j = 0;

        int l1 = ww1.length();
        int l2 = ww2.length();

         StringBuilder sb = new StringBuilder();

         while (i < l1 && j < l2){
             sb.append(ww1.charAt(i++));
             sb.append(ww2.charAt(j++));
         }

         while (i < l1){
             sb.append(ww1.charAt(i++));
         }
         while (j < l2){
             sb.append(ww2.charAt(j++));
         }

         String res = sb.toString();
         System.out.println(res);



         String s = "abc";
         String t = "abwkhqoc";
        boolean issub = false;
        int sizer = 0;

        HashSet<Character> feeder = new HashSet<>();

        for (int i1 = 0; i1 <t.length(); i1++){
            boolean chek = feeder.contains(t.charAt(i1));
            if (chek == false){
                feeder.add(t.charAt(i1));
            }
        }

        for (int j1 = 0; j1 <s.length(); j1++){
            boolean cheker = feeder.contains(s.charAt(j1));
            if (cheker == true){
                sizer++;
            }
        }

        if (sizer == s.length()){
            issub = true;
        }
        System.out.println(issub);;
    }
}
