package day26_staticKeyword;

import day17_scope_arrays.C01;

public class C03_StaticKeyword {
    public static void main(String[] args) {


        //hiç obje oluşturmadan C01'deki static variableları kullanabiliriz

        System.out.println(C01_StaticKeyword.sayi);

        C01_StaticKeyword.sayi=20;
        System.out.println(C01_StaticKeyword.sayi);

        C01_StaticKeyword obj=new C01_StaticKeyword();
        System.out.println(obj.no + ", " + obj.sayi);
/*
static variablar classa aittir ve class ile birlikte oluştuırulur.
hiç obje oluşturmasak da static variablelar kullanılabilir veya uppdate edilebilir

 */

    }
}
