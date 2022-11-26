package day13_forLoops_NestedForLoops;

import java.util.Scanner;

public class C01_forLoops {
    public static void main(String[] args) {

        // kullnıcıdan bir string alıp bunu tersten yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle=scan.nextLine();

        for (int i = cumle.length()-1; i >=0 ; i--) {
            System.out.print(cumle.charAt(i));
        }

//terse çevirdiğimiz hali orijinal halinde hala.


    }
}
