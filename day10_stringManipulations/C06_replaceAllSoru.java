package day10_stringManipulations;

import java.util.Scanner;

public class C06_replaceAllSoru {
    public static void main(String[] args) {

    /*
    kullanıcıdan ismini, soy ismini ve kredi kartı numarasını alıp
    aşağıdaki formatta kaydedip yazdıralım.
    M**** T*****
    1234 **** **** ****
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lütfen soy isminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("lütfen kredi kartı numaranızı giriniz");
        String kkNo=scan.nextLine();
        String yeniIsim= isim.substring(0, 1) + isim.substring(1).replaceAll("\\w", "*") + " " +
                soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
        String yenikkNo= kkNo.substring(0, 4) + " **** **** ****";
        System.out.println(yeniIsim + "\n" + yenikkNo);

    }
}
