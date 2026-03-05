import java.util.Scanner;
import javax.security.auth.x500.X500Principal;

import static java.text.ChoiceFormat.nextDouble;

public class ders002 {
public static void main(String[] args) {

    double mazotLF = 38.56;//TL
    double benzinLF = 34.59;//TL
    double gazLF = 19.19;//TL
    double dizelArac_km_TL = 6.1 / 100 * mazotLF;
    double benzinliArac_km_TL = 6.1 / 100 * benzinLF;
    double gazliArac_km_TL = 6.1 / 100 * gazLF;

    Scanner girisScanner = new Scanner(System.in);
    System.out.println("gidilen yol(km): ");

    double aa = girisScanner.nextDouble();



    System.out.println("DizelAraç" + dizelArac_km_TL * aa );
    System.out.println("Benzinli Araç" + benzinliArac_km_TL * aa);
    System.out.println("Gazlı Araç" + gazliArac_km_TL * aa );

}
}
