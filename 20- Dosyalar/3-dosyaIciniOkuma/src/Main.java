import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\icabi\\Desktop\\IK\\Java\\20- Dosyalar\\files\\students.txt");
        try {
            Scanner reader  = new Scanner(file);
            while(reader.hasNextLine()){
                String line     = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
