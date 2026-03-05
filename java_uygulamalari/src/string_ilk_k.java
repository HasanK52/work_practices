import java.util.Scanner;

public class string_ilk_k {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        String kelime = g.next();
        char ilkkarakter = kelime.charAt(0);//0 ilk karakteri gösterir.
        System.out.println("kelime" + kelime);
        System.out.println(ilkkarakter);

        /*
            Switch(ilkkarakter);
            case 'a':System.out.println("ilk karakter:a");break;
            case 'b':System.out.println("ilk karakter:b");break;
            case 'c':System.out.println("ilk karakter:c");break;
            case 'd':System.out.println("ilk karakter:d");break;
            default:
            System.out.println("ilk karakter: farklıbir şey");
            */

    }
}