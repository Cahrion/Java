public class DortIslem {
    public int Toplama(int Sayi1, int Sayi2){
        return Sayi1 + Sayi2;
    }
    public int Cikarma(int Sayi1, int Sayi2){
        return Sayi1 - Sayi2;
    }
    public int Carpma(int Sayi1, int Sayi2){
        return Sayi1 * Sayi2;
    }
    public int Bolme(int Sayi1, int Sayi2){
        if(Sayi2 == 0){
            Sayi2 = 1;
        }
        return Sayi1 / Sayi2;
    }
}
