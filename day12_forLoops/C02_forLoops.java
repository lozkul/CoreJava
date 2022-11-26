package day12_forLoops;

import java.util.Scanner;

public class C02_forLoops {
    public static void main(String[] args) {
        //kullanıcıdan başlangıç ve bitiş sayılarını alıp
        //sınırlar dahil olmak üzere,
        //sınırlar ve aralarındaki sayılarda 5 ile bölünebilenleri yazdırın.

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen başlangıç sayısını giriniz");
        int bas=scan.nextInt();

        System.out.println("lütfen bitiş sayısını giriniz");
        int bitis=scan.nextInt();

       for (int i= bas; i <=bitis; i++) {
           if (i%5==0){
               System.out.print(i + " ");
           }

        }

    }
}
