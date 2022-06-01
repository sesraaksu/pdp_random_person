/**
*zeynep.emanet1@ogr.sakarya.edu.tr  Zeynep Emanet
*esra.aksu2@ogr.sakarya.edu.tr      Esra Aksu 
*Ödev verildiði günden itibaren uðraþýlmýþ ve 25.04.2020 bitmiþtir.
*<p>
*Bu ödev Esra ve Zeynep tarafýndan ortak hazýrlanmýþtýr.
*</p>
**/

package RASTGELEKISIURET;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RastgeleKisi {
    
    Rastgele rand = new Rastgele();
    private int SatirSayisi;
    private File file;
    private BufferedReader reader = null;

        public String RastgeleKisi(){
         file = new File("random_isimler.txt");
         
                
        SatirSayisi = 0;
        try {
            reader = new BufferedReader(new FileReader(file));
            String satir = reader.readLine();
            while (satir != null) {
                if (satir.length() > 0) {
                    SatirSayisi++;
                }
                satir = reader.readLine();
            }
        } catch (final IOException e) {
        }
        
         int sayac = 0;
        String Metin[] = new String[SatirSayisi + 1];
        try {
            reader= new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            Metin[0] = reader.readLine();
            while (Metin[sayac] != null) {
                if (Metin[sayac].length() > 0) {
                    sayac++;
                }
                Metin[sayac] = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        return Metin[rand.nextInt(SatirSayisi)];
    
    }
}
