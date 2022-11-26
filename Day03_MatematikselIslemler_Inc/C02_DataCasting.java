package Day03_MatematikselIslemler_Inc;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {
// Soru 4- Kullanicidan iki double sayi alin,
// ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucununun tamsayi kismini yazdirin.
        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen iki ondalıklı sayı giriniz, \narada enterea basın");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        int sonuc= (int)(sayi1/sayi2);
        System.out.println("Bölme işleminin tamsayı kısmı : " + sonuc);
    }
}
