import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\icabi\\Desktop\\IK\\Java\\20- Dosyalar\\files\\students.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu.");
            }else{
                System.out.println("Dosya zaten mecvut.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}