/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java10;

/**
 *
 * @author hallgato
 */
public class URLcím {
    private String protokoll;
    private String tartomány;
    private String elérésiÚt;
    
    public URLcím(String urlCím) throws URLcímException {
     //bmilyen függvénybe vagy bármibe nem muszáj lekezelni benne,
     //de akk a fvny fejlécét kell kiegészítemi egy utasítással,
     //hogy jelezzem, hogy itt nem kívánok foglalkozni a kivétellel,
     //hanem a konstruktor tovább dobja a rendszernek
     //ha több van akkor vesszővel kell elválasztva felsorolni
        
        if(urlCím.length()<5){ //ha kivétel dobódik, akk nem fogja végrehajtani az ez utáni dolgokat
            throw new URLcímException(1, "A cím nem elég hosszú."); //new kulcsszó, konstruktor, mindig így hozunk létre új objektumot
        }
        if(!urlCím.contains("://")) { //ha nem tartalmazza 
            throw new URLcímException(2, "Nincs benne ://!");
        }
         if(urlCím.indexOf("://")!=urlCím.lastIndexOf("://")) {
            throw new URLcímException(2,"Többször van meg benne.");
        }
         String [] tmp1 = urlCím.split("://");
         
         if(!(tmp1[0].equals("http") || tmp1[0].equals("file") || tmp1[0].equals("ftp") )) {
             throw new URLcímException(3, "Nem megfelelő protokoll.");
         }
         
         this.protokoll = tmp1[0]; //mivel eddig lefutott a program és jó is a protokoll ezért állítom erre az értékre
         
         if(!tmp1[1].contains("/")){
             this.elérésiÚt = ""; //ha nincs elérési út akk üres string 
                     
             if(!tmp1[1].contains(".")) //ha nem tartalmaz már több pontot akkor hiba
           
               throw new URLcímException(4, "nincs benne pont."); 
             else {
                 String[] tmp2 = tmp1[1].split("\\.", -1); // a pont egy spec karakter ezért kell a \\ mert a split egy reguláris kifejezést vár 
                 for(String s: tmp2)
                 if(s.equals("")) 
                     throw new URLcímException(4, "Két pont van egymás mellett, vagy a végén van egy pont.");
            if(tmp2[tmp2.length-1].length()<2){
                throw new URLcímException(4, "Utolsó pont utáni rész rövid "); //pl a .hu csak egy karakter, pl .h 
                
            }   
            this.tartomány=tmp1[1];
             }
         } 
         else {
             házi!;
         }
         
             
         
    }
    
    
}
