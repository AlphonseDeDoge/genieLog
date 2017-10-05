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
public class PanierTest extends TestCase {
    
    public PanierTest(String testName) {
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
     * Test of add method, of class Panier.
     */
    public void testAdd() {
        System.out.println("add");
        Orange fruit = null;
        Panier instance = new Panier();
        instance.add(fruit);
    }

    /**
     * Test of remove method, of class Panier.
     */
    public void testRemove() {
        System.out.println("remove");
        Panier instance = new Panier();
        instance.remove();
    }

    /**
     * Test of size method, of class Panier.
     */
    public void testSize() {
        System.out.println("size");
        Panier instance = new Panier();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Panier.
     */
    public void testGet() {
        System.out.println("get");
        int index = 0;
        Panier instance = new Panier();
        Orange expResult = null;
        Orange result = instance.get(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMax method, of class Panier.
     */
    public void testGetMax() {
        System.out.println("getMax");
        Panier instance = new Panier();
        int expResult = 0;
        int result = instance.getMax();
        assertEquals(expResult, result);
    }

    /**
     * Test of boycottOrigine method, of class Panier.
     */
    public void testBoycottOrigine() {
        System.out.println("boycottOrigine");
        String origine = "";
        Panier instance = new Panier();
        instance.boycottOrigine(origine);
    }

    /**
     * Test of getException method, of class Panier.
     */
    public void testGetException() {
        System.out.println("getException");
        Panier instance = new Panier();
        String expResult = "";
        String result = instance.getException();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Panier.
     */
    public void testToString() {
        System.out.println("toString");
        Panier instance = new Panier();
        String expResult = "Panier vide";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class Panier.
     */
    public void testAdd2() {
        System.out.println("add2");
        Orange fruit = null;
        Panier instance = new Panier(1);
        instance.add(fruit);
    }
    
    /**
     * Test of add method, of class Panier.
     */
    public void testAdd3() {
        System.out.println("add3");
        Orange fruit = new Orange(0.0,"France");
        Panier instance = new Panier(1);
        instance.add(fruit);
    }
    
    /**
     * Test of add method, of class Panier.
     */
    public void testAdd4() {
        System.out.println("add4");
        Orange fruit = new Orange(0.0,"France");
        Orange fruit2 = new Orange(0.0,"France");
        Panier instance = new Panier(1);
        instance.add(fruit);
        instance.add(fruit2);
    }
    
    /**
     * Test of remove method, of class Panier.
     */
    public void testRemove2() {
        System.out.println("remove2");
        Orange o = new Orange(0.0,"France");
        Panier instance = new Panier(1);
        instance.add(o);
        instance.remove();
    }
    
    /**
     * Test of boycottOrigine method, of class Panier.
     */
    public void testBoycottOrigine2() {
        System.out.println("boycottOrigine2");
        String origine = "France";
        Orange o = new Orange(0.0,"France");
        Panier instance = new Panier(1);
        instance.add(o);
        instance.boycottOrigine(origine);
    }
    
    /**
     * Test of toString method, of class Panier.
     */
    public void testToString2() {
        System.out.println("toString2");
        Orange o = new Orange(0.0,"France");
        Panier instance = new Panier(1);
        instance.add(o);
        System.out.println(instance.toString());
        String expResult = "Panier(" + 1 + "/" + 1 + ")\n" + "\t" + o.toString() + "\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
