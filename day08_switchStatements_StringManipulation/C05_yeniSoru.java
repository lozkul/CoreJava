package day08_switchStatements_StringManipulation;

import java.util.Scanner;

public class C05_yeniSoru {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan ay ismini alip mevsimi yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen ay ismini yazınız");
        String girilenAyIsmi= scan.next();

        //kullanıcı ay ismini farklı şekillerde yazabileceği için biz girilen değeri standartlaştırmak için
        // yeni bir variablea küçük harf olarak atayalım
        String ayIsmi= girilenAyIsmi.toLowerCase();
        switch (ayIsmi){
            case "aralik":
            case "ocak" :
            case "subat":
                System.out.println("girdiğiniz " + girilenAyIsmi + " ayı kış mevsiminde");
                break;
            case "mart":
            case "nisan" :
            case "mayis":
                System.out.println("girdiğiniz " + girilenAyIsmi + " ayı ilkbahar mevsiminde");
                break;
            case "haziran":
            case "temmuz" :
            case "ağustos":
                System.out.println("girdiğiniz " + girilenAyIsmi + " ayı yaz mevsiminde");
                break;
            case "eylül":
            case "ekim" :
            case "kazım":
                System.out.println("girdiğiniz " + girilenAyIsmi + " ayı güz mevsiminde");
                break;
            default:
                System.out.println("geçersiz ay ismi");

        }

    }
}
