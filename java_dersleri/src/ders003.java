import java.util.Scanner;

public class ders003 {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);

        int s1 = (int) (Math.random()*10);
        int s2 = (int) (Math.random()*10);
        if (s1 < s2){
            System.out.println(s2 + "-" + s1 + "=?");
        }else {
            System.out.println(s1 + "-" + s2 + "=?");
        }
        System.out.println("s1" + s1);
        System.out.println("s2" + s2);
        int sonuc = s1 + s2;
        System.out.println(s1 +"+"+ s2 +"=?");
        int cevap = a.nextInt();

        if(cevap == sonuc) {
            System.out.println("Cevabınız doğru.");
        }else if (cevap > sonuc) {
            System.out.println("Büyük değer girdiniz.");
        }else {
            System.out.println("Küçük değer girdiniz.");
        }




    }
}
