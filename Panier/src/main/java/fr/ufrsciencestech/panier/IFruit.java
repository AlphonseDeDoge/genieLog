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
public interface IFruit {
    public double getPrix();
    public void setPrix(double prix);
    public String getOrigine();
    public void setOrigine(String origine);
    @Override
    public boolean equals(Object o);
    public boolean equals(Fruit o);
    @Override
    public String toString();
    public boolean isSeedless();
}
