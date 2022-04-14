public class Main {

    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        if(sayi1 > sayi2){
            if(sayi1 > sayi3){
                if(sayi3 >sayi2){
                    System.out.println(sayi1 + " > " + sayi3 + " > " + sayi2);
                }else{
                    System.out.println(sayi1 + " > " + sayi2 + " > " + sayi3);
                }
            }else{
                System.out.println(sayi3 + " > " + sayi1 + " > " + sayi2);
            }
        }else{
            if(sayi2 > sayi3){
                if(sayi3 >sayi1){
                    System.out.println(sayi2 + " > " + sayi3 + " > " + sayi1);
                }else{
                    System.out.println(sayi2 + " > " + sayi1 + " > " + sayi3);
                }
            }else{
                System.out.println(sayi3 + " > " + sayi2 + " > " + sayi1);
            }
        }
    }
}
