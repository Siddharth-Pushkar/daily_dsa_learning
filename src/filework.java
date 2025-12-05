import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class filework {


    public static void readerop(String s) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(s));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {

        String filename = "data.txt";
        File filna = new File(filename);

        try{
            if (filna.createNewFile()){
                System.out.println("File is created sucessfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();}
        if (filna.exists()){
            System.out.println(filna.getName());
            System.out.println(filna.getPath());
            System.out.println(filna.length());
        }
        readerop(filename);


    }
}
