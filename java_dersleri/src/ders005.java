import java.util.Scanner;

public class ders005 {
    public static void main(String[] args){

        Scanner g = new Scanner(System.in);
        System.out.println("Adınız Soyadınız: ");
        String adsoyad = g.nextLine();
        System.out.println("Vize Notunuz: ");
        double vizenotu = g.nextDouble();
        System.out.println("Final Notunuz: ");
        double finalnotu = g.nextDouble();
        double gecmenotu = 0;
        String harfnotu = "**";

        if (finalnotu >= 50) {
            gecmenotu = vizenotu * 0.40 + finalnotu * 0.60;
        if (gecmenotu >= 90) harfnotu ="AA";
        else if (gecmenotu >= 80 && gecmenotu < 90) harfnotu ="BA";
        else if (gecmenotu >= 70 && gecmenotu < 80) harfnotu ="BB";
        else if (gecmenotu >= 60 && gecmenotu < 70) harfnotu ="CB";
        else if (gecmenotu >= 50 && gecmenotu < 60) harfnotu ="CC";
        else harfnotu ="FF";
        }else harfnotu ="BÜT";
        System.out.println("Adı Soyadı\tVize Notu\tFinal Notu\tGeçme Notu\tHarf Notu");
        System.out.println(adsoyad + "\t\t" + vizenotu + "\t\t" + finalnotu + "\t\t" + (int)(gecmenotu * 100)/100 + "\t\t" + "\t\t" + harfnotu);






    }
}
