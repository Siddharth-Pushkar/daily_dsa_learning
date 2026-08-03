public class maxvovsubstring {

    public static void main(String[] args) {

        String s = "novowels";
        int k = 3;
        int right = k;
        int left = 1;
        int maxvovels = 0;
        int currentvovels = 0;

        for (int i = 0; i<k;i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                currentvovels++;
            }
        }
        maxvovels = currentvovels;

        while (right < s.length()){
            char chr = Character.toLowerCase(s.charAt(right));
            char chl = Character.toLowerCase(s.charAt(left));
            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'){
                currentvovels++;
            }
            if (chl == 'a' || chl == 'e' || chl == 'i' || chl == 'o' || chl == 'u'){
                currentvovels--;
            }
            maxvovels = Math.max(currentvovels,maxvovels);
            right++;
            left++;
        }

        System.out.println(maxvovels);


    }
}
