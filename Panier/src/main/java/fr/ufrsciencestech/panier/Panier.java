/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nl773507
 */
public class Panier {
    
    private int max;
    private List<Orange> fruits;
    
    public Panier()
    {
        max = 0;
        fruits = new ArrayList<Orange>();
    }
    
    public Panier(int max)
    {
        this.max = max;
        fruits = new ArrayList<Orange>();
    }
    
    public void add(Orange fruit)
    {
        if(fruit != null)
        {
            if(fruits.size() < max)
            {
                fruits.add(fruit);
            }
            else
            {
                System.out.println("Le Panier est plein !");
            }
        }
        else
        {
            System.out.println("L'objet à ajouter est incorrect !");
        }
    }
    
    public void remove(Orange fruit)
    {
        if(fruit != null)
        {
            if(fruits.size() > 0)
            {
                for(int i=(fruits.size()-1) ; i >= 0 ; i--)
                {
                    fruits.remove(i);
                }
            }
            else
            {
                System.out.println("Le panier est vide !");
            }
        }
        else
        {
            System.out.println("L'objet à retirer est incorrect !");
        }
    }
    
    public int size()
    {
        return fruits.size();
    }
    
    public Orange get(int index)
    {
        return fruits.get(index);
    }
    
    public void boycottOrigine(String origine)
    {
        for(int i=(fruits.size()-1) ; i >= 0 ; i--)
        {
            if( origine.toLowerCase().equals(fruits.get(i).getOrigine().toLowerCase()) )
            {
                fruits.remove(i);   
            }
        }
    }
    
    @Override
    public String toString()
    {
        String tmp = "Panier(" + size() + "/" + max + ")\n";
        for(int i=0 ; i<size() ; i++)
        {
            tmp += "\t" + fruits.get(i).toString() + "\n";
        }
        
        return tmp;
    }
}
