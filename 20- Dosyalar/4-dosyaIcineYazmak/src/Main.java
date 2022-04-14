import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\icabi\\Desktop\\IK\\Java\\20- Dosyalar\\files\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya Başarıyla Yazıldı.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
