package day11_stringManipulations;

import java.util.Scanner;

public class C07_soru5 {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir şifre isteyin. aşağıdaki şartları kontrol ederek kullanıcıya
        düzeltmesi gerekenleri söyleyin.
        eğer tüm şartları sağlarsa "sifre basariyla kaydedildi" yazdırın.
        - ilk harf küçük harf olmalı
        - son karakter rakam olmalı
        - şifre boşluk içermemeli
        - uzunluğu en az 10 karakter olmalı
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 10 karakterden oluşan bir şifre giriniz");

        String sifre=scan.nextLine();

        // bu soru bağımsız if cümleleri ile veya if-elseler ile çözülebilir.
        // ikisinin de artı ve eksileri var. biz bağımsız if kullanacağız.

        boolean kontrol=true;

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("şifre küçük harf ile başlar");
            kontrol=false;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(0)<='9')){
            System.out.println("şifre rakam ile bitmeli"); //bu kısmı kontrol et
            kontrol=false;
        }
        if (sifre.contains(" ")){
            System.out.println("şifrede boşluk olmaz");
            kontrol=false;
        }
        if (sifre.length()<10 && sifre.length()>10){
            System.out.println("şifre 10 karakter olmalı");
            kontrol=false;
        }

        if (kontrol){
            System.out.println("şifre başarı ile kaydedildi");
        }
    }
}
