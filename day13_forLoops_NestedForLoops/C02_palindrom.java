package day13_forLoops_NestedForLoops;

import java.util.Scanner;

public class C02_palindrom {
    public static void main(String[] args) {

      // tersten okunuşu orijinal metnin okunuşu ile aynı olan metinlere palindrom denir.
      // kullnıcıdan bir cümle veya sayı alın. palindrom olup olmadığını kontrol edip yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir cümle veya sayı giriniz");
        String cumle=scan.nextLine();

        String tersCumle="";
        for (int i = cumle.length()-1; i >=0 ; i--) {
            tersCumle+=cumle.charAt(i);
        }

       if (cumle.equals((tersCumle))){
           System.out.println("Girdiğiniz metin palindrom");
       } else {
           System.out.println("girdiğiniz metin palindrom değil");
       }



    }
}
