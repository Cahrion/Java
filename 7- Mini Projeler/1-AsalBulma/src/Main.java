public class Main {

    public static void main(String[] args) {
        int sayi    = 10;
        boolean flag    = true;

        if(sayi == 1){
            flag = false;
        }else if(sayi < 1){
            System.out.println("Geçersiz Sayi");
            return;
        }else{
            for(int i = 2; i < sayi; i++){
                if(sayi % i == 0){
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println(sayi + " sayısı asal bir sayıdır.");
        }else{
            System.out.println(sayi + " sayısı asal bir sayı değildir.");
        }
    }
}
