package day22_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayList {
    public static void main(String[] args) {
        /*
        kullanıcıdan istediği kadar String alarak bir liste oluturup
        bu listeyi bize döndüren bir method oluşturun.
        kullnıcının bitirmek için Q harfine basmasını sağlayın.
         */
        List<String> istenenList= new ArrayList<>();

        istenenList=listeolustur();
        System.out.println(istenenList);
    }

    public static List<String> listeolustur() {

        List<String> olusanList=new ArrayList<>();

        Scanner scan= new Scanner(System.in);
        String kullaniciGiris= "";

        while (!kullaniciGiris.equals("Q")){
            System.out.println("lütfen listeye eklemek için bir isim girin " +
                    "\nBitirmek için Q'ya basın");
            kullaniciGiris=scan.nextLine();

            if (!kullaniciGiris.equals("Q")){
                olusanList.add(kullaniciGiris);
            }
        }
        return olusanList;

    }
}
