public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3};
	    try{
	        System.out.println(sayilar[4]);
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch(StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch(Exception exception){
            System.out.println("Loglandı: " + exception);
        }finally {
	        System.out.println("İşlem sonlandırıldı.");
        }
    }
}
