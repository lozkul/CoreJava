package day19_arrays;

import java.util.Arrays;

public class C13_ArrayiSiralama {
    public static void main(String[] args) {

        //verieln bir string arrayi natural order ve ters sıralama yapıp yazdırın.

        String[] arr ={"fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Mehmet"};

        // natural ordera göre sıralama için Arrays classından sort kullanılır.

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [Bora, Dalyan, Esra, Jacob, Mehmet, Muhammet, fatih]
        //küçük harflerin ascii değeri daha büyük olduğundan sıralamada
        // önce büyük harfle başlayanlar sonra küçük harfle başlayanlar sıralanır



        // büyükten küçüğe sıralama

        String[] tersSirali=new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tersSirali[i]=arr[arr.length- (i+1)];
        }

        System.out.println(Arrays.toString(tersSirali));




    }
}
