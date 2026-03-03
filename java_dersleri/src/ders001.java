import java.util.Scanner;
public class ders001 {
	public static void main(String[] args) {
		int r;
		int a;
		int b;
		double Dairenin_alani,Dairenin_cevresi,Dortgenin_alani,Dortgenin_cevresi;
		Scanner input= new Scanner(System.in);
		System.out.println("Daire yarıçapını giriniz. : \n");
		System.out.println("Dörtgenin bir kenarını giriniz. : \n" );
		System.out.println("Dörtgenin diğer kenarını giriniz. : \n");
		r = input.nextInt();
		a = input.nextInt();
		b = input.nextInt();
		Dairenin_cevresi = 2 * Math.PI * r;
		Dairenin_alani = Math.PI * (r*r);
		Dortgenin_cevresi = 2 * (a+b);
		Dortgenin_alani = a * b;
		System.out.println("Dairenin çevresi : " +Dairenin_cevresi);
		System.out.println("Dairenin alanı : " +Dairenin_alani);
		System.out.println("Dörtgenin çevresi : " +Dortgenin_cevresi);
		System.out.println("Dörtgenin alanı : " +Dortgenin_alani);













	}

}
