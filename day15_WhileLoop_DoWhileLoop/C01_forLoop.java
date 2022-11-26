package day15_WhileLoop_DoWhileLoop;

public class C01_forLoop {
    public static void main(String[] args) {

    //iki basamaklı sayılardan 7 ile bölünebilenkleri yanyana yazdırın

        for (int i = 10; i < 100; i++) {
            if (i%7==0){
                System.out.print(i + " ");
            }
        }


    }
}
