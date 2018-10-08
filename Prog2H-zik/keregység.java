import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class keregység {
    private String név;
    private String cím;
    private Date megnyitás;

    public keregység(String név, String cím, Date megnyitás) {
        this.név = név;
        this.cím = cím;
        this.megnyitás = megnyitás;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public void setNév(String név) {
        this.név = név;
    }

   

    public String getCím() {
        return cím;
    }

    public Date getMegnyitás() {
        return megnyitás;
    }

    @Override
    public String toString() {
        return "keregys\u00e9g{" + "n\u00e9v=" + név + ", c\u00edm=" + cím + ", megnyit\u00e1s=" + megnyitás + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.név);
        hash = 11 * hash + Objects.hashCode(this.cím);
        hash = 11 * hash + Objects.hashCode(this.megnyitás);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
     if (obj==null||!(obj instanceof keregység))
         return false;
     
      keregység k= (keregység)obj; //KASZTOLÁS
        
      return this.cím.equals(k.getCím())
              &&this.megnyitás==k.getMegnyitás();
 
    }
    
    
}
