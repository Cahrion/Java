public class Main {

    public static void main(String[] args) {
        sayiBulmaca(5);
        sayiBulmaca(4);
        sayiBulmaca(2);
        sayiBulmaca(6);
    }
    public static void sayiBulmaca(int aranacak){
        int[] sayilar   = new int[]{1,2,5,7,9,0};
        boolean flag 	= false;

        for(int sayi:sayilar){
            if(sayi == aranacak){
                flag = true;
                break;
            }
        }
        mesajVer(flag, aranacak);
    }
    public static void mesajVer(boolean flag, int aranacak){
        if(flag){
            System.out.println("Aranan " + aranacak + ", sayılar içerisinde bulunmaktadır.");
        }else{
            System.out.println("Aranan " + aranacak + ", sayılar içerisinde bulunmamaktadır.");
        }
    }
}
