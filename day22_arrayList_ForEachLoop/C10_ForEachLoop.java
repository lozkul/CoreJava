package day22_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C10_ForEachLoop {
    public static void main(String[] args) {

/*
  Verilen String bir listede istenmeyen harf iceren elementleri
  silip, kalani kismini bize donduren bir method olusturun.
 */

        List<String> liste=new ArrayList<>();
        liste.add("Eyup");
        liste.add("Yahya");
        liste.add("Esra");
        liste.add("Seher");
        liste.add("Ahmet");
        liste.add("Fatih");
        String istenmeyenHarf="A";
        String istenmeyenHarf2= "day31_encapsulation/a";
        List<String> yeniList=new ArrayList<>();
        for (String each:liste) {
            if (!each.contains(istenmeyenHarf)&&!each.contains(istenmeyenHarf2)){
                yeniList.add(each);
            }
        }
        System.out.println(yeniList);

    }
}
