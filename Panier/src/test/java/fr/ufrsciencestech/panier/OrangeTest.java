/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import junit.framework.TestCase;

/**
 *
 * @author nl773507
 */
public class OrangeTest extends TestCase {
    
    public OrangeTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * Test of getPrix method, of class Orange.
     */
    public void testGetPrix() {
        System.out.println("getPrix");
        Orange instance = new Orange();
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrix method, of class Orange.
     */
    public void testSetPrix() {
        System.out.println("setPrix");
        double prix = 0.0;
        Orange instance = new Orange();
        instance.setPrix(prix);
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Orange instance = new Orange();
        String expResult = "";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrigine method, of class Orange.
     */
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "";
        Orange instance = new Orange();
        instance.setOrigine(origine);
    }

    /**
     * Test of equals method, of class Orange.
     */
    public void testEquals1() {
        System.out.println("equals");
        Orange o = null;
        Orange instance = new Orange();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Orange(int, string).
     */
    public void testEquals2() {
        System.out.println("equals");
        Orange o = new Orange(0.01, "France");
        Orange instance = new Orange();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    /**
     * Test of equals method, of class Object.
     */
    public void testEquals3() {
        System.out.println("equals");
        Object o = new Object();
        Orange instance = new Orange();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Orange(int, string).
     */
    public void testEquals4() {
        System.out.println("equals");
        Object o = new Orange(0.00, "France");
        Orange instance = new Orange(0.00, "France");
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    /**
     * Test of toString method, of class Object.
     */
    public void testToString1() {
        System.out.println("toString");
        Orange instance = new Orange();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class Orange(int, string).
     */
    public void testToString2() {
        System.out.println("toString2");
        Orange instance = new Orange(0.00, "France");
        System.out.println(instance.toString());
        String expResult = "Orange prix : 0,00 origine : France";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
