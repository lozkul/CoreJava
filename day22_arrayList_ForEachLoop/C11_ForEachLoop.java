package day22_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C11_ForEachLoop {
    public static void main(String[] args) {

        /*
        verilen bir String arrayde her bir elementi kontrol edip,
        kelimenin uzunluğu çift sayı ise ilk yarısı, kelimenin uzunluğu
        teksayı ise ortadaki harf dahil ikinci yarısını
        yeni bir listeye ekleyip yazdırın
         */

        String[] arr= {"Fatih", "Muhammet", "Bora", "Seher"};
        List<String> yeniList=new ArrayList<>();
        for (String each:arr
             ) {
            if (each.length()%2==0){
                yeniList.add(each.substring(0,each.length()/2));
            }else{
                yeniList.add(each.substring((each.length()-1)/2));
            }
        }
        System.out.println(yeniList);


    }
}
