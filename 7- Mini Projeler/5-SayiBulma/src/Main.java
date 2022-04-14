public class Main {

    public static void main(String[] args) {
	    int[] sayilar   = new int[]{1,2,5,7,9,0};
	    int aranacak    = 5;
	    boolean flag 	= false;

	    for(int sayi:sayilar){
	        if(sayi == aranacak){
	            flag = true;
	            break;
            }
        }
	    if(flag){
			System.out.println("Aranan, sayılar içerisinde bulunmaktadır.");
		}else{
			System.out.println("Aranan, sayılar içerisinde bulunmamaktadır.");
		}
    }
}
