/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fénykép;

import java.util.Scanner;

/**
 *
 * @author hallgato
 */
public class teszt {
    private static Fényképezőgép fnyg[];
    
    private static int hegyekSzáma(Fényképezőgép fg){
        String findString=" /\\";
        int firstIndex=0;
        String str = fg.getFénykép();
        int count=0;
   
      while(firstIndex!=-1){
          firstIndex=str.indexOf(findString, firstIndex);
          if(firstIndex!=-1){
              count++;
              firstIndex=firstIndex+findString.length();
          }
      }
        
        return count;
        
    }
    
    
    
    private static void rendez(Fényképezőgép[] t) {
        for (int i=0; i<t.length-1; i++){
        for(int j=i+1; j<t.length; j++){
         if(t[i].getFénykép().length() <t[j].getFénykép().length()){
             Fényképezőgép tmp= t[i];
             t[i]=t[j];
             t[j]=tmp;
      
         }   
         else if(t[i].getFénykép().length()==t[j].getFénykép().length()){
             if(hegyekSzáma(t[i])== hegyekSzáma(t[j]))  {
                 if(t[i].getMárkanév().compareTo(t[j].getMárkanév()) >0) {
                 Fényképezőgép tmp= t[i];
                 t[i]=t[j];
                t[j]=tmp;
             }
         }
             else if (hegyekSzáma(t[i])<hegyekSzáma(t[j])){
             Fényképezőgép tmp= t[i];
             t[i]=t[j];
             t[j]=tmp;
             }
                 
        }
    }
        
        
        
    }
            
    private static void kiir(Fényképezőgép[] t){
        for (int i=0; i<t.length;i++){
            System.out.println(t[i]);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in); //standard inp ról a scanner osztállyal olvasunk be 
        
        n=Integer.parseInt(sc.nextLine());
        fnyg= new Fényképezőgép[n];
       
        for (int i=0; i<n; i++){
             String sor = sc.nextLine();
             String st[] = sor.split(":");
             fnyg[i]=new Fényképezőgép(st[0], st[1]);
             
        }
        
        kiir(fnyg);
        
        
        
        
    }
    
}
