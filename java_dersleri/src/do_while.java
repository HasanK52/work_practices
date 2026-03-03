import java.util.Scanner;

public class do_while {
    public static void main(String[] args){
    double sayi = 0;
    double toplam = 0;
    int adet = 0;
    Scanner g = new Scanner(System.in);

    do {
        System.out.println("Bir sayı giriniz.: ");
        sayi = g.nextDouble();
        toplam = toplam + sayi;
        adet++;
    }while (sayi != 0);
    System.err.println("Girilen" + adet + " Sayının toplamı: " + toplam);

Scanner f = new Scanner(System.in);
int max = 0;
int say = 0;
do {
    System.out.println("Bir sayı giriniz.: ");
    say = f.nextInt();
    if (say>max)
        max = say;
} while (say != 0);
        System.out.println("Girilen en büyük sayı: " + max);









}
}

