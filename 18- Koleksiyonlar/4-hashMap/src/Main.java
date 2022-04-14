import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // arrayList yapısıyla aynı mantıkta lakin burda anahtar kilit olayı var
        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");

        System.out.println(sozluk);
        sozluk.remove("table");

        for(String item:sozluk.keySet()){
            System.out.println("Eleman: " + item + " Değer: " + sozluk.get(item));
        }
    }
}
