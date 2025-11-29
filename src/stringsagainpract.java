public class stringsagainpract {

    public static void workerop(String s){
        System.out.println("Hello you called me? ");
        System.out.println("I can help you with that!");
        System.out.println("Lets take that string and with it");
        s=s.trim();
        int len = s.length();
        int ind = s.indexOf('e');
        System.out.println(s);
        System.out.println(len);
        System.out.println(ind);
        String s1=s.replace('e','0');
        System.out.println(s1);
    }

    public static void cleared(String s2){
        System.out.println("This is the method for removing the special characters");
        s2 = s2.trim();
        s2 = s2.toLowerCase();
        String cleaned = s2.replaceAll(" ","");
        cleaned = cleaned.replaceAll("[^A-Za-z0-9 0-9]","");
        System.out.println(cleaned);

    }


    public static void main(String[] args) {
        String tropper = "This is a sample string";
        workerop(tropper);
        String speciop = "eyiffg gef *&$% TF$*gsi BT^*7";
        cleared(speciop);
    }
}
