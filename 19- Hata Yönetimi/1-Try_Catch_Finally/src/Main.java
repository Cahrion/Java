public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4};
        try{
            System.out.println(sayilar[5]);
        }catch (Exception e){
            System.out.println("Belirtilen değer kadar değer bulunmamaktadır");
        }finally{
            System.out.println("İşlem Sonlandı.");
        }

    }
}