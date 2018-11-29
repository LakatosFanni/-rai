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
public class teszt {
 public static void main (String [] args){
 int a=0;
//      int t[] = new int[] {1,2,3,4};
//      try{ //kivételkezeléshez kell, mögé kell a catch cucc 
//     for(int i=0; i<5; i++){ //ha i<5, akkor a tömböt túlindexeltük, kezelni kell 
//         a=3/t[i];
//     }
//     System.out.println("Try vége.");
//             
//      } catch(ArithmeticException e){ //elkapja a try-ba talált kivételt, mindig az elsőt, ami dobódik
//          a=1;
//          //e.printStackTrace(); //segít, hogy hol dobódott ki a kivétel, hogy hol van a hiba a kódba 
//               
//      }
//      catch(ArrayIndexOutOfBoundsException e){ //lehet több catch ág, mert több kivétel is leht 
//          System.out.println("Túlindexelted a tömböt.");
//      } 
//      //ha már nincs több ötlet, hogy milyen kivétel jöhet, akkor: sima catch(exception e)
//      //mert az exception minden kivételnek az atyja, mniden kivételt magába foglal 
//      catch(Exception e){
//          
//      } finally { //opcionális ág, nem kötelező 
//          System.out.println("Ez mindenképp lefut, ha dobódik kivétel, ha nem");
//      }
//      

//másik feladat 

try { 
URLcím u = new URLcím("http://inf.unideb.hu."); 
System.out.println(u);
}
catch(URLcímException e) {
    System.out.println(e.getHibakód()+" "+e.getMessage());
}

   System.out.println("A program vége: " +a); 
//  
 }      
 
 
}
