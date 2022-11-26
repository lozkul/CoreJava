package day02_scanner_dataCasting;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

// Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen birinci sayıyı giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz");
        int sayi2= scan.nextInt();
        System.out.println("Girilen Değerler" + "\nSayı 1 : " + sayi1 + "\nSayı 2 : " + sayi2);
        int sayi3;
        sayi3=sayi2;
        sayi2=sayi1;
        sayi1=sayi3;

        System.out.println("Değişimden Sonra Değerler" + "\nSayı 1 : " + sayi1 + "\nSayı 2 : " + sayi2);
    }
}
