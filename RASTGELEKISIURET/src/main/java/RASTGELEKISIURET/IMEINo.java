/**
*zeynep.emanet1@ogr.sakarya.edu.tr  Zeynep Emanet
*esra.aksu2@ogr.sakarya.edu.tr      Esra Aksu 
*�dev verildi�i g�nden itibaren u�ra��lm�� ve 25.04.2020 bitmi�tir.
*<p>
*Bu �dev Esra ve Zeynep taraf�ndan ortak haz�rlanm��t�r.
*</p>
**/

package RASTGELEKISIURET;

public class IMEINo {
    
    Rastgele rand = new Rastgele();
    private String ImeiNumarasi = "";

    public String IMEINo() {
        ImeiNumarasi = "";
        int ImeiDizi[] = new int[15], Tsayi = 0, Csayi = 0, yedek = 0;
        for (int i = 0; i < 15; i++) {
            ImeiDizi[i] = rand.nextInt(9);
        }
        for (int i = 0; i <= 12; i += 2) {
            Tsayi += ImeiDizi[i];
        }
        for (int a = 1; a <= 13; a += 2) {
            yedek = ImeiDizi[a] * 2;
            if (yedek > 9) {
                yedek = yedek - 9;
            }
            Csayi += yedek;
        }
        yedek = Csayi + Tsayi;
        double Yyedek = ((Math.ceil(yedek / 10)) * 10) + 10;
        if (((int) Yyedek - yedek) > 9) {
            ImeiDizi[14] = ((int) Yyedek - yedek) % 10;
        } else {
            ImeiDizi[14] = (int) Yyedek - yedek;
        }
        for (int a = 0; a < 15; a++) {
            ImeiNumarasi += ImeiDizi[a];
        }
        return ImeiNumarasi;
    }

    public String ImeiKontrol(String Imei) {
        String ImeiDondur = "";
        double KTsayi = 0, KCsayi = 0;
        int ImeiDizi[] = new int[Imei.length()];

        if (Imei.length() != 15) {
            return "Ge�ersizImei";
        }
        for (int i = 0; i < Imei.length(); i++) {
            ImeiDizi[i] = Integer.parseInt(Imei.substring(i, i + 1));
        }
        for (int i = 0; i <= 12; i += 2) {
            KTsayi += ImeiDizi[i];
        }
        for (int i = 1; i <= 13; i += 2) {
            if (ImeiDizi[i] * 2 > 9) {
                KCsayi += ImeiDizi[i] * 2 - 9;
            } else {
                KCsayi += ImeiDizi[i] * 2;
            }
        }
        double Kyedek = ((Math.ceil((KTsayi + KCsayi) / 10)) * 10);
        for (int i = 0; i < 15; i++) {
            ImeiDondur += ImeiDizi[i];
        }
        if (Kyedek - (KTsayi + KCsayi) == ImeiDizi[14]) {
            return "Ge�erliImei";
        } else {
            return "Ge�ersizImei";
        }
    }

    String IMEIKontrol(String Imei) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
