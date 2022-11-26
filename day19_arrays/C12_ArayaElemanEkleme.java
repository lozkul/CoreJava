package day19_arrays;

import java.util.Arrays;

public class C12_ArayaElemanEkleme {
    public static void main(String[] args) {
        //Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize
        // donduren bir method yazin, eski array’e yeni degeri atayin.

        int[] arr={3,6,8};
        int eklenecekdeger=10;

        arr=arrayeElemanEkleme(arr,eklenecekdeger);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElemanEkleme(int[] arr, int eklenecekdeger) {
        int[] yeniArr= new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekdeger;
        return yeniArr;
    }

}
