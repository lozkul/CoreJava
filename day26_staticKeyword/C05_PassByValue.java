package day26_staticKeyword;

public class C05_PassByValue {
    public static void main(String[] args) {


        int sayi = 10;



        System.out.println(method1(sayi));
        System.out.println(sayi);
    }

    public static int method1(int sayi){
        sayi=sayi*sayi;

        return sayi;
    }


}
