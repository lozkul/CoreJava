package day02_scanner_dataCasting;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Dikdörtgenin iki kenar uzunluğunu girin \nbirinci kenarı girdikten sonra entera basın");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("dikdörtgenin alanı : " + kenar1*kenar2);




    }
}
