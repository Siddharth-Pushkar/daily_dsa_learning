import java.io.File;
import java.io.IOException;

public class filework {

    public static void main(String[] args) {

        File filna = new File("data.txt");
        if (filna.exists()){
            System.out.println(filna.getName());
            System.out.println(filna.getPath());
            System.out.println(filna.length());
        }

        try{
            if (filna.createNewFile()){
                System.out.println("File is created sucessfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();}

    }
}
