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
public class Banane extends Fruit{
    
    public Banane(double prix, String origine){
        this.prix = prix;
        this.origine = origine;
    }
    
    public Banane(){
        this.prix = 0.0;
        this.origine = "";
    }

    @Override
    public boolean isSeedless() 
    {
        return false;
    }
}
