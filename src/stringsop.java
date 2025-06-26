public class stringsop {

    public static void main(String[] args) {


        String name ;
        String edited;
        int editod;

        name = "this is a text line for testing";

        edited = name.toUpperCase();
        edited = name.toLowerCase();
        edited = name.trim();
        edited = name.replace("e","3");
        editod = name.indexOf("e",12);
        System.out.println(edited);
        System.out.println(editod);



    }
}
