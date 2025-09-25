public class stringsagain {

    public static void main(String[] args) {

        String s = "some";
        System.out.println(s);
        s = s.concat("thing");
        System.out.println(s);

        System.out.println(s.replace("me","n"));
        s = s.replace("me","n");
        System.out.println(s);

        String ss = "some";
        char ch = s.charAt(3);
        String ss1 = "soloaro";
        String ss2 = "some";

        int indoz = ss1.length();
        char che;

        for (int i = 0; i<indoz; i++){
            che = ss1.charAt(i);

            System.out.println(che);
        }

        int chin = 0;
        char finch = 'o';

        for (int i = 0; i<indoz; i++){
            che = ss1.charAt(i);
            if (che == finch){
                chin++;
            }
        }
        System.out.println(chin);

        char change = 'p';

        for (int i = 0; i<indoz; i++){
            che = ss1.charAt(i);
            if (che == finch){
                ss1 = ss1.replace(che,change);
            }
        }
        System.out.println(ss1);


        String state = "statement";
        String reversed = "";

        for (int ii = state.length() -1; ii>=0; ii--){
            reversed += state.charAt(ii);
        }

        System.out.println(reversed);



        String state1 = "racecar";
        String reversedop = "";

        for (int iii = state1.length()- 1; iii>=0;iii--){
            reversedop += state1.charAt(iii);
        }

        System.out.println(reversedop);

        if (reversedop == state1){
            System.out.println(state1+" is a palindrome");

        } else {
            System.out.println(state1+" is not a palindrome");
        }






    }
}
