import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\icabi\\Desktop\\IK\\Java\\20- Dosyalar\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya yolu: " + file.getPath());
            System.out.println("Dosya Yazma Hakkı: " + file.canWrite());
            System.out.println("Dosya Okunabilir Hakkı: " + file.canRead());
            System.out.println("Dosya Çalıştırma Hakkı: " + file.canExecute());
            System.out.println("Dosya Boyutu: " + file.length() + "bayt");
        }
    }
}
