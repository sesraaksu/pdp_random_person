/**
*zeynep.emanet1@ogr.sakarya.edu.tr  Zeynep Emanet
*esra.aksu2@ogr.sakarya.edu.tr      Esra Aksu 
*�dev verildi�i g�nden itibaren u�ra��lm�� ve 25.04.2020 bitmi�tir.
*<p>
*Bu �dev Esra ve Zeynep taraf�ndan ortak haz�rlanm��t�r.
*</p>
**/

package RASTGELEKISIURET;

public class KimlikNo {
    
    Rastgele rand = new Rastgele();
    private String KimlikNumarasi = "";

    public String KimlikNo() {
        KimlikNumarasi = "";
        int TcDizi[] = new int[11], yedek = 0;
        for (int sayac = 0; sayac < 11; sayac++) {
            if (sayac == 0) {
                TcDizi[0] = rand.nextInt(9) + 1;
            } else if (sayac < 10) {
                TcDizi[sayac] = rand.nextInt(9);
            }
        }
        TcDizi[9] = (((TcDizi[0] + TcDizi[2] + TcDizi[4] + TcDizi[6] + TcDizi[8]) * 7) - (TcDizi[1] + TcDizi[3] + TcDizi[5] + TcDizi[7])) % 10;
        for (int i = 0; i <= 9; i++) {
            yedek += TcDizi[i];
        }
        TcDizi[10] = yedek % 10;
        for (int a = 0; a < 11; a++) {
            KimlikNumarasi += TcDizi[a];
        }
        return KimlikNumarasi;
    }

    public String KimlikNuKontrol(String Tc) {
        if (Tc.length() != 11) {
            return "Ge�ersizTc";
        }
        int TcDizi[] = new int[Tc.length()];
        for (int i = 0; i < Tc.length(); i++) {
            TcDizi[i] = Integer.parseInt(Tc.substring(i, i + 1));
        }
        int Hane10, Hane11, yedek2 = 0;
        Hane10 = ((TcDizi[0] + TcDizi[2] + TcDizi[4] + TcDizi[6] + TcDizi[8]) * 7 - (TcDizi[1] + TcDizi[3] + TcDizi[5] + TcDizi[7])) % 10;
        for (int i = 0; i <= 9; i++) {
            yedek2 += TcDizi[i];
        }
        Hane11 = yedek2 % 10;
        if (TcDizi[9] == Hane10 && TcDizi[10] == Hane11) {
            return "Ge�erliTc";
        } else {
            return "Ge�ersizTc";
        }
    }

    String KimlikKontrol(String Kimlik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    KimlikNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
