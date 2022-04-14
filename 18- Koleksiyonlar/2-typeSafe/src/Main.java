import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        // Normal arrayList yapısında çalışan her şey çalışır lakin alımlarda sadece string alır.
        sehirler.remove("İstanbul");
        Collections.sort(sehirler); // Sıralar (A-Z'ye)

        for(String i:sehirler){
            System.out.println(i);
        }
    }
}
