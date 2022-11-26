package day37_exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bölünecek tamsayıyı girin");
        int a= scan.nextInt();


        System.out.println("lütfen bölecek sayıyı girin");
        int b=scan.nextInt();

        if (b==0){
            System.out.println("bölecek sayı sıfır olamaz");
        } else System.out.println("bölme işleminin sonucu : " + a/b);
        System.out.println("iyi günler");


    }
}
