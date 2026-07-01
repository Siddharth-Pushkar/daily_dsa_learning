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
        System.out.printf(merged);


        String ww1 = "abc";
        String ww2 = "pqrs";

        int i = 0;
        int j = 0;
        int o = 0;

        int l1 = ww1.length();
        int l2 = ww2.length();

         StringBuilder sb = new StringBuilder();





    }
}
