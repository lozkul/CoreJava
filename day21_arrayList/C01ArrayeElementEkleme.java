package day21_arrayList;

import day19_arrays.C12_ArayaElemanEkleme;
import java.util.Arrays;
public class C01ArrayeElementEkleme {
    public static void main(String[] args) {
        int[] arr={2,4,5};
        // Bu array'in sonuna 3 elementini ekleyelim
        // arr[3]=3; array'in uzunlugu degistirilemez
        C12_ArayaElemanEkleme C12_ArrayeElemanEkleme;
        arr= C12_ArayaElemanEkleme.arrayeElemanEkleme(arr,3);
        System.out.println(Arrays.toString(arr)); // [2, 4, 5, 3]
        // bir de 7 ekleyelim
        arr=C12_ArayaElemanEkleme.arrayeElemanEkleme(arr,7);
        System.out.println(Arrays.toString(arr));  // [2, 4, 5, 3, 7]
    }
}