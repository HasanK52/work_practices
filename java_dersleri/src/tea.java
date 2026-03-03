import java.util.Scanner;

public class tea {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        String islem_secenekleri = "Bakiye Görüntüleme -->1"
                + "Para ÇEKME -->2"
                + "Farklı Hesaba Para Yatırma -->3"
                + "Çıkış Yapmak İçin q Tuşuna Basınız.";
        double hasanBakiye = 2309.5;
        String hasanSifre = "123456";
        String hasanKullaniciAdi = "hasan13";
        String hasanIban = "TR750006701000000053453993";

        double osmanBakiye = 1301.12;
        String osmanSifre = "315963";
        String osmanKullaniciAdi = "osman12";
        String osmanIban = "TR750006701000000053453994";

        System.out.println("Kullanıcı adınızı giriniz: ");
        String kullaniciAdi = Scanner.next();
        System.out.println("Şifrenizi giriniz: ");
        String sifre = Scanner.next();
        if (kullaniciAdi.equals("hasan13") && sifre.equals("123456"));{
            System.out.println(islem_secenekleri);
            System.out.println("Lütfen bir seçim yapınız.");
            String secim = Scanner();
            switch (secim)
                	{
				case "1":
				System.out.println("Bakiyeniz = "+ hasanBakiye);
				break;

				case "2" :
				System.out.println("Çekmek istediğiniz tutarı giriniz: ");
				int cekilentutar = scanner.nextInt();
				if (hasanBakiye>=cekilenturar) {
					hasanBakiye-=cekilenturar;
					System.out.println("Para Hesabınızdan çekildi hesabınızdaki kalan para : " + hasanBakiye);

				}else {
					System.out.println("Bakiyenizden fazla para çekemezsiniz...");
				}
				break;
				case "3" :
				System.out.println("Göndermek istediğiniz miktarı yazınız.");
				int yatirilantutar = scanner.nextInt();
		if (hasanBakiye>=yatirilantutar) {

					System.out.println("İbanı giriniz : ");
					String yatiralacakIban = scanner.nextLine();
					if (yatiralacakIban.equals(osmanIban)) {
						System.out.println("Para Osman Adlı kişiye gönderiliyor...");
						hasanBakiye-=yatirilantutar;
						osmanBakiye+=yatirilantutar;

					}

					System.out.println("Para yatırıldı hesabınızda kalan para : " + hasanBakiye);
					break;
            {

				else {
					System.out.println("Bakiyenizden fazla para yatıramazsınız.");
					break;
			}

			}


		}
		else if (kullaniciAdi.equals("osman12") && sifre.equals("315963"));
		{
			System.out.println("Osman Yanbasan Hesabına Giriş Yapıldı...");
			System.out.println(islem_secenekleri);

			System.out.println("Lütfen bir seçim yapınız.");
			String secim = scanner.nextLine();



		switch(secim) {
            case "1":
                System.out.println("Bakiyeniz = " + osmanBakiye);
                break;


            case "2":
        }
            }
System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                cekilentutar = Scanner.nextInt();
			if (osmanBakiye>=cekilentutar) {
				osmanBakiye-=cekilentutar;
				System.out.println("Para Hesabınızdan çekildi hesabınızdaki kalan para : " + osmanBakiye);

			}else {
				System.out.println("Bakiyenizden fazla para çekemezsiniz...");
			}
			break;
			case "3" :
			System.out.println("Göndermek istediğiniz miktarı yazınız.");
			int yatirilantutar2 = scanner.nextInt();
			if (osmanBakiye>=yatirilantutar2) {

				System.out.println("İbanı giriniz : ");
				String yatiralacakIban = scanner.nextLine();
				if (yatiralacakIban.equals(hasanIban)) {
	System.out.println("Para Hasan Adlı kişiye gönderiliyor...");
					osmanBakiye-=yatirilantutar2;
					hasanBakiye+=yatirilantutar2;

				}

				System.out.println("Para yatırıldı hesabınızda kalan para : " + osmanBakiye);
				break;
			}

			else {
				System.out.println("Bakiyenizden fazla para yatıramazsınız.");
				break;
			}
		}

		}


            }
        }




