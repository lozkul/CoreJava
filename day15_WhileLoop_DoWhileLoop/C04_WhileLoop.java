package day15_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan şifre isteyin.
        aşağıdaki şartları sağlamayan şifrelerde hataları yazdırıp kullnıcının yeni şifre girmesini isteyin
        geçerli bir şifre yazılıncaya kadar bu işlemi tekrar edin. geçerli şifre yazılınca
        "şifreniz başarı ile kaydedildi" yazdırın.
        şartlar:
        - şifrenin ilk karakteri küçük harf olmalı
        - şifrenin son karakteri sayı olmalı

         */

        Scanner scan=new Scanner(System.in);
        boolean sifreDogrumu=false;
        String sifre="";
        char ilkHarf;
        char sonHarf;

        while (!sifreDogrumu){ //sifreDogrumu==false yerine !sifreDogrumu lullandık
            System.out.println("lütfen şifrenizi giriniz");
            sifre= scan.nextLine();
            ilkHarf=sifre.charAt(0);
            sonHarf=sifre.charAt(sifre.length()-1);

            if (ilkHarf<'a' || ilkHarf>'z'){
                System.out.println("şifrenin ilk harfi küçük olmalı");
            }else if (sonHarf<'0' || sonHarf>'9'){
                System.out.println("son karakter sayı olmalı");
            }else {
                System.out.println("şifre başarı ile kaydedildi");
                sifreDogrumu=true;
            }
        }


    }
}
