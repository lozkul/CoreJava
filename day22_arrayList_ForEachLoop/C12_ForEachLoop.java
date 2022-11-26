package day22_arrayList_ForEachLoop;

import java.util.Scanner;

public class C12_ForEachLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir cümle ve bir harf alın
        for each loop kullanarak harfin cümlede kaç kez geçtiğini
        bulup yazdırın
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle= scan.nextLine();
        System.out.println("Lütfen aramak istediğiniz harfi giriniz");
        String harf= scan.next().substring(0,1);

        String[] karakterler=cumle.split("");
        int sayac=0;


        for (String each: karakterler
             ) {
            if (each.equals(harf)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("istediğiniz harf cümlede yok");
        } else {
            System.out.println("istediğiniz " + harf + " harfi cümlede " + sayac + " defa kullanılmıştır");
        }

    }
}
