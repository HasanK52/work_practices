public class sdgsf {
public static void main(String[] args){
    //boolean even = true;
    // System.out.println((even ? "true" : "false"));
    String msg ="Welcome to java";
  msg = msg.substring(0,11) + "HTML";   /*11.yi almaz (karakter araligi alma)*/
  System.out.println(msg);

int ind= msg.indexOf('m',3);
  System.out.println(ind);
    System.out.println(msg.length()); /*uzunluk*/
    int i = Integer.parseInt("123"); /*int ifadeye cevirir*/
    System.out.println(i);

    double amount = 12618.98;
    double interestrate = 0.0013;
    double interest = amount * interestrate;
    System.out.printf("interest is \n\t$%4.2f", interest); /*formatlayici bicimlendirici*/
  }
}
