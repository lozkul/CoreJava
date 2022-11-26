package day02_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // saru 2 - kullanıcıdan bir double bir de int sayı alıo bunların toplam ve carpımını yazdırın
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir tamsayı giriniz");
        int tamsayi= scan.nextInt();

        System.out.println("lutfen ondalıklı bir sayı giriniz");
        double ondalikliSayi= scan.nextDouble();

        System.out.println("girilen sayıları çarpımı :" + tamsayi*ondalikliSayi);
        System.out.println("girilen sayıları toplamı :" + (tamsayi+ondalikliSayi));


    }
}
