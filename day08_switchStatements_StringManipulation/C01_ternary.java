package day08_switchStatements_StringManipulation;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {

//Kullanicidan bir tamsayi alin.
// Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
// Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı girin");
        int sayi= scan.nextInt();

        String sonuc = sayi>0 ? // şart
                (sayi%2==0 ? "cift sayı" : "çift sayı değil") : //şart doğru ise çalışacak kod
                (sayi<=-100 && sayi>=-999 ? "üç basamaklı" : "üç basamaklı değil");
        System.out.println(sonuc);





    }

}
