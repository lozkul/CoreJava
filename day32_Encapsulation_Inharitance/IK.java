package day32_Encapsulation_Inharitance;

public class IK{
    /*
    tüm personel için ortak olan variablelar ve methodlar
    bu classta tutulur. böylece alt classların her birinde
    bu kadar variableı yeniden oluşturmak zorunda kalmayız.
     */

    protected String isim= "Deger atanmamis";
    protected String soyisim= "Deger atanmamis";

    protected void maas(){
        System.out.println("personel maas alir");
    }
    protected void izin(){
        System.out.println("personelin izin hakkı vardır");
    }

    protected void ozelSigorta(){
        System.out.println("personele özel sigorta destegi yapılır");
    }



}
