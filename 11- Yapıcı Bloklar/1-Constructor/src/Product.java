public class Product {
    private int id;
    public Product(int id, String name, String description, double price, int stockAmount){
        System.out.println("Yapıcı Blok Çalıştı.");
        this.id = id;
    }
    public void calistiMi(){
        System.out.println("Çalıştı");
    }
}
