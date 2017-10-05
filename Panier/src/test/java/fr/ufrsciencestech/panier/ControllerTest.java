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
public class ControllerTest extends TestCase {
    
    public ControllerTest(String testName) {
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
     * Test of genererFruit method, of class Controller.
     */
    public void testGenererFruit() {
        System.out.println("genererFruit");
        Controller instance = new Controller();
        instance.genererFruit();
    }

    /**
     * Test of genererFruit method, of class Controller.
     */
    public void testGenererFruit2() {
        System.out.println("genererFruit2");
        Controller instance = new Controller();
        instance.setPanier(new Panier(1));
        String[] ex = new String[1];
        ex[0] = "France";
        instance.setExport(ex);
        instance.genererFruit();
    }
    
    /**
     * Test of retirerFruit method, of class Controller.
     */
    public void testRetirerFruit() {
        System.out.println("retirerFruit");
        Controller instance = new Controller();
        instance.retirerFruit();
    }

    /**
     * Test of retirerFruit method, of class Controller.
     */
    public void testRetirerFruit2() {
        System.out.println("retirerFruit2");
        Controller instance = new Controller();
        instance.setPanier(new Panier(1));
        instance.getP().add(new Orange());
        instance.retirerFruit();
    }
    
    /**
     * Test of boycotter method, of class Controller.
     */
    public void testBoycotter() {
        System.out.println("boycotter");
        Controller instance = new Controller();
        instance.boycotter();
    }

    /**
     * Test of boycotter method, of class Controller.
     */
    public void testBoycotter2() {
        System.out.println("boycotter2");
        Controller instance = new Controller();
        instance.setPanier(new Panier(1));
        instance.getP().add(new Orange(0.5, "France"));
        instance.setV(new Visu());
        instance.getV().getJcombo().addItem("France");
        instance.getV().getJcombo().setSelectedIndex(0);
        instance.boycotter();
    }
    
    /**
     * Test of getV method, of class Controller.
     */
    public void testGetV() {
        System.out.println("getV");
        Controller instance = new Controller();
        Visu expResult = null;
        Visu result = instance.getV();
        assertEquals(expResult, result);
    }

    /**
     * Test of setV method, of class Controller.
     */
    public void testSetV() {
        System.out.println("setV");
        Visu v = null;
        Controller instance = new Controller();
        instance.setV(v);
    }

    /**
     * Test of getP method, of class Controller.
     */
    public void testGetP() {
        System.out.println("getP");
        Controller instance = new Controller();
        Panier expResult = null;
        Panier result = instance.getP();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPanier method, of class Controller.
     */
    public void testSetPanier() {
        System.out.println("setPanier");
        Panier p = null;
        Controller instance = new Controller();
        instance.setPanier(p);
    }

    /**
     * Test of getEx method, of class Controller.
     */
    public void testGetEx() {
        System.out.println("getEx");
        Controller instance = new Controller();
        String[] expResult = null;
        String[] result = instance.getEx();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExport method, of class Controller.
     */
    public void testSetExport() {
        System.out.println("setExport");
        String[] ex = null;
        Controller instance = new Controller();
        instance.setExport(ex);
    }
    
}
