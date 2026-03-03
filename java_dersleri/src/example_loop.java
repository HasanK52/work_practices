import java.util.Scanner;

public class example_loop {
    public static void main(String[] args){

        Scanner giris = new Scanner(System.in);
        final int soruSayisi = 5;
        long baslamaZamani = System.currentTimeMillis();
        int dogruS = 0;
        int yanlisS = 0;
        int soruNo = 1;
        String sonuc = "";

        while (soruNo<=soruSayisi){
            int s1 = (int) (Math.random()*20+1);
            int s2 = (int) (Math.random()*20+1);
            if (s1<s2) {
                int tmp = s1;
                s1 = s2;
                s2 = tmp;
            }

            System.out.print(s1 + "-" + s2 + "= " );
            int cevap = giris.nextInt();
            if (cevap == (s1 - s2)){
                sonuc += ("\n" + soruNo + ". cevap doğru");
                dogruS++;
            }else {
                sonuc += ("\n" + soruNo + ". cevap yanlış");
                yanlisS++;

            }soruNo++;
        }

        System.out.println(sonuc);
        long bitisZamani = System.currentTimeMillis();
        long gecenSaniye = (bitisZamani - baslamaZamani)/1000;

        System.out.println(soruSayisi + " adet soruyu " + gecenSaniye + " saniyede çözdünüz.");
        System.out.println("Doğru sayısı: " + dogruS);
        System.out.println("Yanlış sayısı: " +yanlisS);


    }
}
