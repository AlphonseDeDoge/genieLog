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
public class Macedoine extends Fruit{

    private List<Fruit> fruits;
    
    public Macedoine()
    {
        fruits = new ArrayList<Fruit>();
    }
    
    public void add(Fruit fruit)
    {
        if(fruit != null)
        {
 
                fruits.add(fruit);
        }
    }
    
    public void remove()
    {
        if(fruits.size() > 0)
        {
            fruits.remove(fruits.size()-1);
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

    @Override
    public boolean isSeedless() {
        return true;
    }
    

}
