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
    public String toString()
    {
        return "Orange prix : " + prix + " origine : " + origine;
    }
}
