/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import javax.swing.JComboBox;
import javax.swing.JTextField;

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
    
    public double getRandom(int min, int max) 
    {
        return Math.random() * (max - min) + min;
    }
    
    public void generer(JTextField jtxt, JComboBox jb)
    {
        if(ex != null && p!= null)
        {
            double price = stringToDouble(jtxt.getText());
            String origin = jb.getSelectedItem().toString();
            if(price >= 0)
            {
                p.add(new Orange(price, origin));
            }
        }
    }
    
    public double stringToDouble(String text)
    {
        double i = -1;

        try
        {
            i = Double.parseDouble(text);
        }
        catch(Exception e)
        {
            
        }
        return i;
    }
    
    public void genererFruit()
    {
        if(ex != null && p!= null)
        {
            double price = (double)getRandom(1, 10);
            String origin = ex[(int)(getRandom(0, ex.length))];

            int fruitSelect = (int)(getRandom(0, 2));
            
            switch(fruitSelect)
            {
                case 0 :
                    p.add(new Orange(price, origin));
                    break;
                case 1 :
                    p.add(new Banane(price, origin));
                    break;
                default :
                    p.add(new Orange(price, origin));
            }
            
        }
        
    }
    
    public void retirerFruit()
    {
        if(p != null)
        {
            p.remove();
        }
    }
    
    public void boycotter(JComboBox jb)
    {
        if(p != null && v != null && jb.getItemCount() > 0)
        {
            p.boycottOrigine((String)(jb.getSelectedItem()));
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
