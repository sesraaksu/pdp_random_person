/**
*zeynep.emanet1@ogr.sakarya.edu.tr  Zeynep Emanet
*esra.aksu2@ogr.sakarya.edu.tr      Esra Aksu 
*�dev verildi�i g�nden itibaren u�ra��lm�� ve 25.04.2020 bitmi�tir.
*<p>
*Bu �dev Esra ve Zeynep taraf�ndan ortak haz�rlanm��t�r.
*</p>
**/

package RASTGELEKISIURET;

public class Kisi {
    
    private final RastgeleKisi YeniKisi = new RastgeleKisi();
    private final Yas YeniYas = new Yas();
    private final Telefon YeniTelefon = new Telefon();
    private final IMEINo YeniImei = new IMEINo();
    private final KimlikNo YeniKimlik = new KimlikNo();
    private String Gonder;

    public String KisiOlustur() {
        Gonder = YeniKimlik.KimlikNo() + " " + YeniKisi.RastgeleKisi() + " " + YeniYas.Yas() + " " + YeniTelefon.Telefon() + " (" + YeniImei.IMEINo() + ")";
        return Gonder;
    }

    public String KimlikKontrol(String Kimlik) {

        KimlikNo Tckontrol = new KimlikNo();
        return Tckontrol.KimlikKontrol(Kimlik);
    }

    public String ImeiKontrol(String Imei) {
        IMEINo ImeiKontrol = new IMEINo();
        return ImeiKontrol.IMEIKontrol(Imei);
    }  
}
