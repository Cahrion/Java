import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String mesaj    = "  Bugün-hava-çok-sıcak...  ";
	    System.out.println(mesaj);

        String yeniMesaj    = mesaj.replace("...","."); // 1. Eski karakter, 2. Yeni karakter
	    System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(6)); // 6. karakterden keser.
		System.out.println(mesaj.substring(6,12)); // 6'den başlar 12. karakterde dahil keser.
		for(String kelime:mesaj.split("-")){ // Boşluğa göre ayırır.
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // Bütün harfleri büyütür.
		System.out.println(mesaj.toUpperCase()); // Bütün harfleri küçültür.
		System.out.println(mesaj.trim()); // Başındaki ve sonundaki boşlukları siler.

    }
}