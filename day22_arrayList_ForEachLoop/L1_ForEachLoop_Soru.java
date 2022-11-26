package day22_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1_ForEachLoop_Soru {
    public static void main(String[] args) {

        /*
        Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum elemanlardan
sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
         */
        int[] arr = {2,3,5,6,7,3};
        List<Integer> sayilar=new ArrayList<>();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 7, 7, 7, 56, 76]

        int sayac=0;

        List<Integer> sayilar1=new ArrayList<>();

        for (int each: arr) {
           if (!(each==each)){

               sayilar1.add(each);
           }

        }
        System.out.println("Listenin son hali : " + sayilar1);


    }
}
