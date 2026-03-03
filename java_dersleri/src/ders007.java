import java.util.Scanner;

public class ders007 {
    public static void main(String[] args){
        //int sayi = (int) (Math.random()*6);//0-5 DAHİL RASTGELE SAYILAR ÜRETİR
        Scanner g = new Scanner(System.in);
        int sayi=-1;
        while (!(sayi>=0 && sayi<=5)) {


            System.out.println("Lütfen 0-5 arasında bir değer giriniz.");
            sayi = g.nextInt();
        }
        switch (sayi){
            case 0: System.out.println("0 sayısı üretildi.");break;
            case 1: System.out.println("1 sayısı üretildi.");break;
            case 2: System.out.println("2 sayısı üretildi.");break;
            case 3: System.out.println("3 sayısı üretildi.");break;
            case 4: System.out.println("4 sayısı üretildi.");break;
            case 5: System.out.println("5 sayısı üretildi.");break;
           // default: System.out.println("Farklı sayı üretildi.");System.exit(sayi);
        }











    }
}
