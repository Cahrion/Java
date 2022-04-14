public class Main {

    public static void main(String[] args) {
	    // 220 284
        int Birincisayi     = 220;
        int Ikincisayi      = 284;
        int BirinciTotal    =   0;
        int IkinciTotal     =   0;
        for(int i = 1;i<Birincisayi;i++){
            if(Birincisayi % i == 0){
                BirinciTotal +=i;
            }
        }
        for(int i = 1;i<Ikincisayi;i++){
            if(Ikincisayi % i == 0){
                IkinciTotal +=i;
            }
        }
        if((Birincisayi == IkinciTotal) && (Ikincisayi == BirinciTotal)){
            System.out.println(Birincisayi + "-" + Ikincisayi + " kardeş sayılardır.");
        }else{
            System.out.println(Birincisayi + "-" + Ikincisayi + " kardeş sayı değilerdir.");
        }
    }
}
