package day11_stringManipulations;

import java.util.Scanner;

public class C03_Soru1 {
    public static void main(String[] args) {

  /*
  Kullanicidan bir cumle alin
  cumlede ev geciyorsa, "home home sweet home" yazdirin
  cumlede is geciyorsa, "calismak guzeldir"
  ikisini de iceriyorsa "Hem ev lazim hem is"
  hicbirini icermiyorsa "cok calisman lazim" yazdirin
 */



        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz.");
        String cumle=scan.nextLine();
        if (cumle.contains("ev") && cumle.contains("iş")){
            System.out.println("Hem ev lazim hem is");
        } else if (cumle.contains("iş")){
            System.out.println("calismak guzeldir");
        } else if (cumle.contains("ev") ){
            System.out.println("home home sweet home");
        } else System.out.println("cok calisman lazim");


    }
}
