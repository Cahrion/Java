public class Main {

    public static void main(String[] args) {
	    int sayi    = 496;
	    int toplamsayi = 0;
	    for(int i=1;i<sayi;i++){
	        if(sayi % i == 0){
	            toplamsayi += i;
            }
        }
	    if(toplamsayi == sayi){
	        System.out.println(sayi + " sayısı mükemmel sayidir.");
        }else{
            System.out.println(sayi + " sayısı mükemmel sayı değildir.");
        }
    }
}
