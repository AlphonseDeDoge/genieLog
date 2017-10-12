/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import javax.swing.JComboBox;
import junit.framework.TestCase;

/**
 *
 * @author nl773507
 */
public class VisuTest extends TestCase {
    
    public VisuTest(String testName) {
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
     * Test of update method, of class Visu.
     */
    public void testUpdate() {
        System.out.println("update");
        Visu instance = new Visu();
        instance.update();
    }

    /**
     * Test of getExport method, of class Visu.
     */
    public void testGetExport() {
        System.out.println("getExport");
        Visu instance = new Visu();
        String[] expResult = null;
        String[] result = instance.getExport();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExport method, of class Visu.
     */
    public void testSetExport() {
        System.out.println("setExport");
        String[] export = null;
        Visu instance = new Visu();
        instance.setExport(export);
    }

    /**
     * Test of getJcomboBoycotter method, of class Visu.
     */
    public void testGetJcombo() {
        System.out.println("getJcombo");
        Visu instance = new Visu();
        JComboBox expResult = null;
        JComboBox result = instance.getJcomboBoycotter();
        assertEquals(expResult, result);
    }

    /**
     * Test of setJcombo method, of class Visu.
     */
    public void testSetJcombo() {
        System.out.println("setJcombo");
        JComboBox jcombo = null;
        Visu instance = new Visu();
        instance.setJcombo(jcombo);
    }

    /**
     * Test of getPanier method, of class Visu.
     */
    public void testGetPanier() {
        System.out.println("getPanier");
        Visu instance = new Visu();
        Panier expResult = null;
        Panier result = instance.getPanier();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPanier method, of class Visu.
     */
    public void testSetPanier() {
        System.out.println("setPanier");
        Panier panier = null;
        Visu instance = new Visu();
        instance.setPanier(panier);
    }

    /**
     * Test of getController method, of class Visu.
     */
    public void testGetController() {
        System.out.println("getController");
        Visu instance = new Visu();
        Controller expResult = null;
        Controller result = instance.getController();
        assertEquals(expResult, result);
    }

    /**
     * Test of setController method, of class Visu.
     */
    public void testSetController() {
        System.out.println("setController");
        Controller controller = null;
        Visu instance = new Visu();
        instance.setController(controller);
    }
    
}
