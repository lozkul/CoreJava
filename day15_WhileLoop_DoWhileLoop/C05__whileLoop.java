package day15_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C05__whileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan toplanmak üzere pozitif tamsayılar isteyin.
        kullanıcıya bitirmek istediğinde 0'a basmasını söyleyin.
        kullanıcı bitirmek istediğinde toplam kaç adet sayı girdiğini ve bunların toplamının kaç olduğunu yazdırın.
        kullanıcı negatif sayı girerse; "negatif sayı kullanamazsınız" yazdırın.
        bu negatif sayıyı sayı adedine ve toplama eklemeyin.
         */

        Scanner scan=new Scanner(System.in);
        int sayi=10;
        int sayac=0;
        int toplam=0;

        while (sayi!=0){
            System.out.println("toplanmak üzere pozitif bir tamsayı girin" +
                    "\nbitirmek için sıfıra basın");
            sayi= scan.nextInt();
            if (sayi==0){
                continue;
            } else if (sayi<0) {
                System.out.println("negatif sayı kullanamazsınız");
            } else {
                toplam+=sayi;
                sayac++;
            }

        }

        System.out.println("girilen " + sayac + " adet pozitif tamsayının toplamı " + toplam);
    }
}
