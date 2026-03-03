import java.util.Scanner;

public class ders004 {
    public static void main (String[] args){

        Scanner g = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz:  ");
        double r = g.nextDouble();
        double alan;
        if (r < 0) {
            System.out.println("Yarıçaop negatif olmamalı");
        }else {
            alan = Math.PI*r*r;
            System.out.println("Alan"+ alan);
        }








    }
}
