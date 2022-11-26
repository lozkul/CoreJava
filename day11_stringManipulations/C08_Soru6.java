package day11_stringManipulations;

import java.util.Scanner;

public class C08_Soru6 {
    public static void main(String[] args) {

        /*
        kullanıcıdan isim ve soyismini ayrı ayrı alın. ismi daha uzun ise
        isim ve soyismi ilkharf büyük kalanlar küçük olarak yazdırın.
        soyisim daha uzun ise ismin ilk harf büyük diğerleri küçük
        soyismi ise tamamen büyük harflerle yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lütfen soyisminizi giriniz");
        String soyIsim=scan.nextLine();


        if (isim.length()>soyIsim.length()){
            System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase() + " "
                    + soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1));
        }       else {
            System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase() +
                    " " + soyIsim.toUpperCase());
        }









    }
}
