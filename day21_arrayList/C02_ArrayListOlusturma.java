package day21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayListOlusturma {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        /*
        List interfacetir. ve interfacelerden obje oluşturulamaz. bu nedenle eşitliğin sağ tarafına
        list konulamaz
         */

        System.out.println(sayilar); //[]
        //ArrayListler boştur. elemanları tek tek eklemek gerekir.

        sayilar.add(24);
        sayilar.add(32);
        sayilar.add(10);
        System.out.println(sayilar); //[24, 32, 10]

    }
}
