import java.util.Arrays;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Pékség extends keregység {
    private String [] pékÁruk;
    
    public Pékség (String név, String cím, Date megnyitás, String[]pékÁ) {
      super(név, cím, megnyitás);
      this.pékÁruk= pékÁ;
    }
    public String [] getPékÁruk(){
        return pékÁruk;
    }

    @Override
    public String toString() {
        return super.toString() + "p\u00e9k\u00c1ruk=" + Arrays.toString(pékÁruk);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Arrays.deepHashCode(this.pékÁruk);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj)&&Arrays.equals(this.pékÁruk,((Pékség)obj).getPékÁruk());
    }
    
}
