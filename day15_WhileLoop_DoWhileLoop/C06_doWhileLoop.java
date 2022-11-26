package day15_WhileLoop_DoWhileLoop;

public class C06_doWhileLoop {
    public static void main(String[] args) {

        int sayi=10;

        while (sayi<14){
            System.out.println(sayi);
            sayi++;
        }

        /*
        1- while loop loop sayısından bir fazla şart kontrolü yapar
        bunun önüne geçmek için do-while loop kullanabiliriz
        2- while loopda ilk değer sartı sağlamıyorsa body hiç çalışmayabilir. ancak do-while loop
        kullanırsak body en az bir kere muhakkak çalışır
         */

        sayi=10;
        do {
            System.out.print(sayi + " ");
            sayi++;
        } while (sayi<14);


    }
}
