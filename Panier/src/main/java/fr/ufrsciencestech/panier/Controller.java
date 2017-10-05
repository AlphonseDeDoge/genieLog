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
    
    private Visu v;
    private Panier p;
    private String[] ex;
    
    public Controller()
    {
        v = null;
        p = null;
        ex = null;
    }
    
    /*
    * GENERATION CALCULUS
    */
    
    public void genererFruit()
    {
        if(ex != null && p!= null)
        {
            double price = (double)Math.random()*10;
            String origin = ex[(int)(Math.random()*ex.length)];
            
            p.add(new Orange(price, origin));
        }
        
    }
    
    public void retirerFruit()
    {
        if(p != null)
        {
            p.remove();
        }
    }
    
    public void boycotter()
    {
        if(p != null && v != null && v.getJcombo().getItemCount() > 0)
        {
            p.boycottOrigine((String)(v.getJcombo().getSelectedItem()));
        }
    }

    public Visu getV() {
        return v;
    }

    public void setV(Visu v) {
        this.v = v;
    }

    public Panier getP() {
        return p;
    }

    public void setPanier(Panier p) {
        this.p = p;
    }

    public String[] getEx() {
        return ex;
    }

    public void setExport(String[] ex) {
        this.ex = ex;
    }
    
}
