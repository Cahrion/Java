public class Main {

    public static void main(String[] args) {
        int toplam1 = topla();// boş olarak da gönderilebilir (Boş array)
        int toplam2 = topla(2,3,4,5,6,7);
	    System.out.println(toplam2);
    }
    public static int topla(int... sayilar){
        int toplam = 0;
        for(int sayi: sayilar){
            toplam += sayi;
        }
        return toplam;
    }
}
