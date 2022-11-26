package Day03_MatematikselIslemler_Inc;

public class C06_preIncSoru {
    public static void main(String[] args) {
        int a=10;
        System.out.println("anın değeri: " + ++a);

        int b=a++;
        System.out.println("bnın değeri: " + b);

        int c= b++ + a;
        System.out.println("cnın değeri: " + c);


        System.out.println("son toplam : " + (a+b+c));



    }
}
