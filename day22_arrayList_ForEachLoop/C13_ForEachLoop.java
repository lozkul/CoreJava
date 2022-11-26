package day22_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C13_ForEachLoop {
    public static void main(String[] args) {

        /*
        verieln iki arrayin elementlerini karşılaştırıp,
        ikisinde ortak olan elmentleri ayrı bir liste olarak
        veren bir program yazınız
         */
        int[] arr1={3,5,7,10};
        int[] arr2={2,5,6,10};

        List<Integer> ortakelementler=new ArrayList<>();

        for (int each1:arr1
             ) {
            for (int each2:arr2
                 ) {
                if (each1==each2){
                    ortakelementler.add(each1);
                }
            }

        }
        System.out.println(ortakelementler);

    }
}
