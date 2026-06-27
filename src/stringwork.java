public class stringwork {

    public static void main(String[] args) {
        String str = "Thi$ is @ st4ing that i wa$t to w*rk one";


        int letters = 0;
        int digits = 0;
        int special = 0;
        int spaces = 0;

        for (int i = 0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if (Character.isLetter(ch)){
                letters++;
            }
            if (Character.isWhitespace(ch)){
                spaces++;
            }
            if (Character.isDigit(ch)){
                digits++;
            }
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                special++;
            }
        }
        System.out.println("Letter: "+letters);
        System.out.println("Digits: "+digits);
        System.out.println("Special: "+special);
        System.out.println("Spaces: "+spaces);

    }
}
