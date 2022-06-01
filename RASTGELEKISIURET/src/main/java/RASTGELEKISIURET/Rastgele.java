/**
*zeynep.emanet1@ogr.sakarya.edu.tr  Zeynep Emanet
*esra.aksu2@ogr.sakarya.edu.tr      Esra Aksu 
*�dev verildi�i g�nden itibaren u�ra��lm�� ve 25.04.2020 bitmi�tir.
*<p>
*Bu �dev Esra ve Zeynep taraf�ndan ortak haz�rlanm��t�r.
*</p>
**/

package RASTGELEKISIURET;

public class Rastgele {
    
    private long last;
    private long inc;
    
    public Rastgele(){
        this(System.currentTimeMillis()); 
    }
    
    public Rastgele(long seed){
        this.last = seed | 1;
        inc = seed;
    }
    
    public int nextInt(int max){
        last ^= (last << 21);
        last ^= (last >>> 35);
        last ^= (last << 4);
        
        inc += 123456789123456789L;
        int out = (int) ((last + inc) % max);
        return (out < 0)? -out : out;
    }
}
