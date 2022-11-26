package day41_interfaces;
public interface I01_InterfaceEkmek {
    /*
      Interface'ler tam abstraction saglar
      iclerinde CONCRETE method BULUNMAZ
      Interface'ler concrete child class'lar icin blueprint(sablon) ozelligi tasir
      Interface'in class'a gore cok buyuk bir avantaji vardir
      Java'da bir class sadece bir class'i parent edinebilir
      Eger birden fazla class'i parent edinmek istersek hiyerarsi ile parent zinciri olustururuz
      Interface'lerde durum farklidir
      bir class istedigi kadar interface'i implement edebilir.
      Bir class'i bir interface'e child yapmak icin extends degil implements keyword kullanilir
      istenirse interface de baska bir interface'i parent edinebilir
      bu durumda interface'ler arasinda extends keyword kullanilir
      Bir class hem baska bir class'a extends ile child olup,
      hem de istedigi kadar interface'i implement edebilir
      Interface'lerde sadece public ve abstract method'lar bulunur
      Interface'lerde variable'lar da public, static ve final'dir.
      variable'lar final oldugu icin sonradan degeri degistirilemez
      olustururken deger atamasi yapmak zorunludur.
     */
    public abstract void un( );
    public abstract void maya( );
    public abstract void bicim( );
    public abstract void gramaj( );
}
