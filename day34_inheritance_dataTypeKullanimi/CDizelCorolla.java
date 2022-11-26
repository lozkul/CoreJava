package day34_inheritance_dataTypeKullanimi;

public class CDizelCorolla extends BCorolla{

    String yakit="Dizel";
    String motor="1,4 Dizel Motor";
    String renk="atanmadi";

    public static void main(String[] args) {

        CDizelCorolla arb1= new CDizelCorolla();
        System.out.println(arb1.motor);
        System.out.println(arb1.renk);
        System.out.println(arb1.yakit);
        System.out.println(arb1.uretimYeri);
        System.out.println(arb1.marka);

        BCorolla corolla= new BCorolla();// bu ojenin inheritance ile ilgisi yoktur.
        //bu standart bir objedir. tum özellikleri BCorolla classından gelir.
        //bu satır örnek olarak yazıldı


        BCorolla arb2= new CDizelCorolla();// burada ise biz dizel corolla üertiyoruz
        //ancak bu modelin corolla olarak özelliklerini görmek istiyoruz
        System.out.println(arb2.yakit);// b classından "atanmadı" yazar
        System.out.println(arb2.renk);// b classından "belirtilmedi" yazar
        // arb2.motor data turu olarak seçilen BCorolla classında motor variablesi olmadıgından CTE verir
        System.out.println(arb2.uretimYeri);//B Turkiye
        System.out.println(arb2.marka);//A Toyota


        AToyota arb3=new CDizelCorolla();
        // arb3.motor A clasında motor yok
        // arb3.renk    A clasında renk yok
        // arb3.yakit  A clasında yakıt yok
        System.out.println(arb3.uratimYeri);// A classından değer atanmadı yazacak
        System.out.println(arb3.marka); // A toyota

        /*
        bir child classta obje oluşturulurken data turu olarak parent classlar seçilebilir.
        bu durumda obje child classın objesi olmakla birlikte özellikleri data türü olarak
        seçilen parent classa ait olacaktır.

        bir obje oluşturulurken data türü constructordan farklı ise o objeye ait variable
        değerlerinin ne olduğunu anlamak için ilk bakmamız gereken yer data turu olarak
        seçilen parent classtır.
        eğer data türü olarak atanan classta variable bulunamazsa parentlarına bakılır.
        eğer aranan variable data türü olarak seçilen class ve parentlarında yoksa CTE oluşur.

        böyle bir obje olulturmanın temel amacı constructor kullanılan classsın değil parent
        classın sahip olduğu özellikleri (variable) kullanmaktır.

        yani variableların değeri için önemli olan constructor değil data türüdür.
         */
    }



}
