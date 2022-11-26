package day19_arrays;

import java.util.Arrays;

public class C14_ArraysiralamaMethodlari {
    public static void main(String[] args) {

        //verieln bir string arrayi natural order ve ters sıralama yapıp döndüren 2 method oluşturun.

        String[] arr ={"fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Mehmet"};


        arr= naturalSirala(arr);
        System.out.println(Arrays.toString(arr));


        arr= tersNaturalSirala(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static String[] tersNaturalSirala(String[] arr) {
        Arrays.sort(arr);
        String[] tersSirali=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tersSirali[i]=arr[arr.length-i-1];

        }
        return tersSirali;
    }

    public static String[] naturalSirala(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
