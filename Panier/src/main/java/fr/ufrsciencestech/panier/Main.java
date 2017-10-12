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
public class Main {
    public static void main(String[] args) 
    {
        Visu view = new Visu();
        Controller control = new Controller();
        
        control.setV(view);
        view.setController(control);
        
        Panier panier = new Panier(10);
        
        String[] export = new String[5];
        export[0] = "France";
        export[1] = "Espagne";
        export[2] = "Suede";
        export[3] = "Martinique";
        export[4] = "Afrique";

        
        control.setPanier(panier);
        control.setExport(export);
        
        view.setPanier(panier);
        view.setExport(export);
        
        view.update();
        view.setVisible(true);
    }
}
