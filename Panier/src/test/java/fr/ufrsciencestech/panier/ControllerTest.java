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
        Panier p = null;
        String[] export = null;
        Controller.genererFruit(p, export);
    }

    /**
     * Test of retirerFruit method, of class Controller.
     */
    public void testRetirerFruit() {
        System.out.println("retirerFruit");
        Panier p = null;
        Controller.retirerFruit(p);
    }

    /**
     * Test of boycotter method, of class Controller.
     */
    public void testBoycotter() {
        System.out.println("boycotter");
        Visu v = null;
        Panier p = null;
        Controller.boycotter(v, p);
    }
    
}
