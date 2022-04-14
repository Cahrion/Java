public class Main {

    public static void main(String[] args) {
        char harf = 'a';
        int flag = 0;
        char[] sesliharfler = {'a','e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};
        char[] kalinsesliharfler = {'a', 'ı', 'o', 'u'};
        char[] incesesliharfler = {'e', 'i', 'ö', 'ü'};
        for (char sesli : sesliharfler) {
            if (sesli == harf) {
                for(char kalinsesli: kalinsesliharfler){
                    if(kalinsesli == harf){
                        flag = 2;
                    }
                }
                if(flag == 0){
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Sessiz harf");
        }else if(flag == 1){
            System.out.println("İnce sesli harf");
        }else{
            System.out.println("Kalın sesli harf");
        }
    }
}
