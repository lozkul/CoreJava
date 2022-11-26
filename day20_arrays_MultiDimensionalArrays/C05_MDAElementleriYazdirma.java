package day20_arrays_MultiDimensionalArrays;

public class C05_MDAElementleriYazdirma {
    public static void main(String[] args) {
        //verieln MDA bir arrayin tüm elementlerini yazdıran bir method oluşturun.

        int [][] arr= {{1,2,3,4},{3,4,2},{2,4}};
        elementleriyazdir(arr);
    }

    public static void elementleriyazdir(int[][] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");

            }
        }
    }
}
