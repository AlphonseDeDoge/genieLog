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
public class Orange {
    
    private double prix;
    private String origine;
    
    public Orange(double prix, String origine){
        this.prix = prix;
        this.origine = origine;
    }
    
    public Orange(){
        this.prix = 0.0;
        this.origine = "";
    }
    
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if(o != null && o instanceof Orange)
        {
            Orange or = (Orange) o;
            return equals(or);
        }
        return false;
    }
    
    public boolean equals(Orange o)
    {
        return (o != null && this.origine == o.origine && this.prix == o.prix);
    }
    
    @Override
    public String toString()
    {
        if(prix == 0 && origine.equals("")){ return "";}
        return "Orange prix : " + String.format("%.2f", prix) + " origine : " + origine;
    }
}
