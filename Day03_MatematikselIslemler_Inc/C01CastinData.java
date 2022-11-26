package Day03_MatematikselIslemler_Inc;

import java.util.Scanner;

public class C01CastinData {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir sayi alin,
        // kullanici kac degerini girerse girsin, o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double girilenSayi= scan.nextDouble();
        byte donusenSayi= (byte) girilenSayi;
        System.out.println("Girdiğiniz sayının sistemdeki karşılığı : " + donusenSayi);


    }
}
