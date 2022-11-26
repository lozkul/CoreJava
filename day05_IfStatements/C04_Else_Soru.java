package day05_IfStatements;

import java.util.Scanner;

public class C04_Else_Soru {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karakter girmesini
        // isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin");
        char girilenChar=scan.next().charAt(0);
        if (girilenChar>='A' && girilenChar<='Z'){
            System.out.println("girilen karakter büyük harf");
        } else {
            System.out.println("girilen harf büyük harf değil");
        }



    }

}
