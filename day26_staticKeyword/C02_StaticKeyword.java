package day26_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {

        C01_StaticKeyword obj1=new C01_StaticKeyword();
        System.out.println(obj1.no + ", " + obj1.sayi);

        obj1.no=25;
        obj1.sayi=30;

        C01_StaticKeyword obj2=new C01_StaticKeyword();
        obj2.no++;
        obj2.sayi++;

        System.out.println(obj2.no + ", " + obj2.sayi);

        obj2.no=40;
        obj2.sayi++;


        C01_StaticKeyword obj3= new C01_StaticKeyword();



        System.out.println(obj1.no + ", " + obj1.sayi);
        System.out.println(obj2.no + ", " + obj2.sayi);
        System.out.println(obj3.no + ", " + obj3.sayi);
    }
}
