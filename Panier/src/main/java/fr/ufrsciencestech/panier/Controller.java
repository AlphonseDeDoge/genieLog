/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author nl773507
 */
public class Controller {
    
    public Controller()
    {
        
    }
    
    /*
    * GENERATION CALCULUS
    */
    public static void initExport(Visu v, String[] ex)
    {
        String[] export = new String[4];
        export[0] = "France";
        export[1] = "Espagne";
        export[2] = "Suede";
        export[3] = "Martinique";
        v.setExport(export);
    }
    
    public static void genererFruit(Panier p, String[] export)
    {
        double price = (double)Math.random()*10;
        
        String origin = export[(int)(Math.random()*export.length)];
        p.add(new Orange(price, origin));
        
    }
    
    public static void retirerFruit(Panier p)
    {
        p.remove();
    }
    
    public static void boycotter(Visu v, Panier p)
    {
        p.boycottOrigine((String)(v.getJcombo().getSelectedItem()));
    }
    
    
}
