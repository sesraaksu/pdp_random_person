/**
*zeynep.emanet1@ogr.sakarya.edu.tr  Zeynep Emanet
*esra.aksu2@ogr.sakarya.edu.tr      Esra Aksu 
*Ödev verildiði günden itibaren uðraþýlmýþ ve 25.04.2020 bitmiþtir.
*<p>
*Bu ödev Esra ve Zeynep tarafýndan ortak hazýrlanmýþtýr.
*</p>
**/

package RASTGELEKISIURET;

public class Telefon {
    
    Rastgele rand = new Rastgele();
    private String TelNumarasi = "";

    public String Telefon() {
        TelNumarasi = "";
        int TelDizi[] = new int[11];
        TelDizi[0] = 0;
        TelDizi[1] = 5;
        TelDizi[2] = rand.nextInt(5) + 2;
        while (TelDizi[2] < 3 || TelDizi[2] > 5) {
            TelDizi[2] = rand.nextInt(5) + 2;
        }
        for (int a = 3; a < 11; a++) {
            TelDizi[a] = rand.nextInt(9);
        }
        for (int a = 0; a < 11; a++) {
            TelNumarasi += TelDizi[a];
        }
        return TelNumarasi;
    }
}
