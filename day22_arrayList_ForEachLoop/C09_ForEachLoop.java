package day22_arrayList_ForEachLoop;

public class C09_ForEachLoop {
    public static void main(String[] args) {
        /*
        verilen bir arraydeki tum elementlerin karelerini toplayıp yazdırın
         */

        int[] arr={3,4,5,1};
        int toplam=1;

        for (int each:arr) {
            toplam*=each*each;
        }

        System.out.println("arraydeki sayıların kareleri çarpımı : " + toplam);

    }
}
