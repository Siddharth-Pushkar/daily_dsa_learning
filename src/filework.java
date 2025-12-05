import java.io.*;
import java.util.Scanner;

public class filework {


    public static void readerop(String s) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(s));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void writerop(String s1, String s2) throws Exception {
        FileWriter writeo = new FileWriter(s1);
        writeo.write(s2);
        writeo.close();
    }

    public static void writercon(String s3, String s4) throws Exception {
        FileWriter writeo = new FileWriter(s3,true);
        writeo.write(s4);
        writeo.close();
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


        writerop(filename,"This is the line that i want to add in my file today");

        Scanner readop = new Scanner(filna);
        while (readop.hasNextLine()){
            System.out.println(readop.nextLine());
        }
        readop.close();


        if (filna.exists()){
            System.out.println(filna.getName());
            System.out.println(filna.getPath());
            System.out.println(filna.length());
        }
        readerop(filename);


    }
}
