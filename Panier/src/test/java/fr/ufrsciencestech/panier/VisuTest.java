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
     * Test of init method, of class Visu.
     */
    public void testInit() {
        System.out.println("init");
        Visu instance = new Visu();
        instance.init();
    }

    /**
     * Test of main method, of class Visu.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Visu.main(args);
    }
    
    /**
     * Test of init method, of class Visu.
     */
    public void testInit2() {
        System.out.println("init2");
        Visu instance = new Visu();
        instance.setVisible(true);
    }
    
}
