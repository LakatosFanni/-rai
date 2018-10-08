/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fénykép;

/**
 *
 * @author hallgato
 */
public class Fényképezőgép {
    public String márkanév;
    public String fénykép;

    public Fényképezőgép(String márkanév, String fénykép) {
        this.márkanév = márkanév;
        this.fénykép = fénykép;
    }

    public String getMárkanév() {
        return márkanév;
    }

    public String getFénykép() {
        return fénykép;
    }

    @Override
    public String toString() {
        return "F\u00e9nyk\u00e9pez\u0151g\u00e9p{" + "m\u00e1rkan\u00e9v=" + márkanév + ", f\u00e9nyk\u00e9p=" + fénykép + '}';
    }
    
}
