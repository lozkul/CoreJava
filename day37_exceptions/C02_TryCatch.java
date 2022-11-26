package day37_exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bölünecek tamsayıyı girin");
        int a= scan.nextInt();


        System.out.println("lütfen bölecek sayıyı girin");
        int b=scan.nextInt();


        /*
        yazdığımız kodda exception oluşma ihtimali öngördüğümüzde o kod bloğunu try catch ile sarmalarız.
        try catch bloğunda 3 bölüm vardır:
        1- try bloğu : yapmak istediğimiz sorun çıkarma potansiyeline sahip code parçacığı
        2- catch key word ve () : bunlar sabittir. parantez içine yazılacak exception türü kodumuza göre
        değişecektir. e ise yakalanan exceptionu koyacağımız objedir.
        3- catch bloğu : exception yakalandığında çalışacak kodlar.
        try catch bloğu ile hem sorunu kullanıcıya bildirip hem de kodun çalışmaya devam etmesini sağlayabiliriz.

        buna handle exception denir.
         */

        try {
            System.out.println("bölme işleminin sonucu : " + a/b);
        } catch (ArithmeticException e) {
          //  e.printStackTrace();
            System.out.println("bölecek sayı sıfır olamaz");
        }

        System.out.println("iyi günler");


    }
}
