public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugun hava çok sıcak...";

        System.out.println(mesaj);
        System.out.println("Eleman Sayısı: " + mesaj.length());
        System.out.println("5. Eleman: " + mesaj.charAt(4));    //0'dan başlar.
        System.out.println(mesaj.concat(" Evden Çıkmayın!"));
        System.out.println(mesaj.startsWith("B")); // Başlangıcı sorgular (B) ile başlıyor mu?
        System.out.println(mesaj.endsWith(".")); // Sonu sorgular (.) ile bitiyor mu?
        char[] karakterler  = new char[5];
        mesaj.getChars(0,5, karakterler, 0);
        // getChars -> Dizinin bellirli karakterlerini istenilen yere koyar.
        // 1. Başlangıç, 2. Bitiş, 3. hangi karakter dizisine, 4. neresinden koymaya başlasın.

        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); // belirtilen karakterin hangi indexte olduğunu bulur. (baştan)
        System.out.println(mesaj.lastIndexOf('a')); // belirtilen karakterin hangi indexte olduğunu bulur. (sondan)
    }
}