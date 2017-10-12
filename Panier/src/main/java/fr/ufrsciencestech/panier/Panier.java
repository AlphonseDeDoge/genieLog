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
    private List<Fruit> fruits;
    private String exception = "";
    
    public Panier()
    {
        max = 0;
        fruits = new ArrayList<Fruit>();
    }
    
    public Panier(int max)
    {
        this.max = max;
        fruits = new ArrayList<Fruit>();
    }
    
    public void add(Fruit fruit)
    {
        if(fruit != null)
        {
            if(fruits.size() < max)
            {
                fruits.add(fruit);
            }
            else
            {
                exception = "Le Panier est plein !";
            }
        }
        else
        {
            exception = "L'objet à ajouter est incorrect !";
        }
    }
    
    public void remove()
    {
        if(fruits.size() > 0)
        {
            fruits.remove(fruits.size()-1);
        }
        else
        {
            exception = "Le panier est vide !";
        }
    }
    
    public int size()
    {
        return fruits.size();
    }
    
    public IFruit get(int index)
    {
        return (index >= 0 && index < fruits.size()) ? fruits.get(index) : null;
    }
    
    public int getMax()
    {
        return max;
    }
    
    public void boycottOrigine(String origine)
    {
        if(fruits.size() > 0)
        {
            for(int i=(fruits.size()-1) ; i >= 0 ; i--)
            {
                if( origine.toLowerCase().equals(fruits.get(i).getOrigine().toLowerCase()) )
                {
                    fruits.remove(i);   
                }
            }
        }
        else
        {
            exception = "Le panier est vide !";
        }
    }
    
    public String getException()
    {
        String tmp = exception;
        exception = "";
        return tmp;
    }
    
    @Override
    public String toString()
    {
        int size = size();
        String tmp = (size == 0) ? "Panier vide" : "Panier(" + size + "/" + max + ")\n";
        for(int i=0 ; i<size ; i++)
        {
            tmp += "\t" + fruits.get(i).toString() + "\n";
        }
        
        return tmp;
    }
}
