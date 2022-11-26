package day10_stringManipulations;

public class C01_indexOfSoru {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir cümle ve bir kelime isteyin.
        cümlede kelimenin kullanımına göre aşağıdaki cümlelerden uygun olanı yazdırın
        - cümle aradığınız kelimeyi içermiyor.
        - aradığınız kelime cümlede sadece bir tane var.
        - aradığınız kelime cümlede birden fazla var.
         */
String cumle="Java çok güzel, çok.";
String metin="kedi";
int ilkKullanimIndexi=cumle.indexOf(metin);
int ikinciKullanimIndexi=cumle.indexOf(metin, ilkKullanimIndexi+1);

if (!cumle.contains(metin)) {
    System.out.println("cümle aradığınız metni içermiyor");
} else if (ikinciKullanimIndexi==-1) {
    System.out.println("aradığınız metin cümlede 1 tane var");

} else {
    System.out.println("aradığınız kelime cümlede birden fazla var");
}


    }
}
