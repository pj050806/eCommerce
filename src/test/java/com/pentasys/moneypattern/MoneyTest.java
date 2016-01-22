/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pentasys.moneypattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jordanpa
 */
public class MoneyTest {
    
    public MoneyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAmount method, of class Money.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Money instance = null;
        instance = new Money(12.33);
        Integer expResult = 1233;
        Integer result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrency method, of class Money.
     */
    @Test
    public void testGetCurrency() {
        System.out.println("getCurrency");
        Money instance = null;
        instance = new Money(12.33);
        String expResult = "EUR";
        String result = instance.getCurrency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Money.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Money compareObject = null;
        compareObject = new Money(12.03);
        Money instance = null;
        instance = new Money(12.33);
        boolean expResult = false;
        boolean result = instance.equals(compareObject);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printAmount method, of class Money.
     */
    @Test
    public void testPrintAmount() {
        System.out.println("printAmount");
        Money instance = null;
        instance = new Money(12.33);
        String expResult = "12.33";
        String result = instance.printAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Money.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Money m = null;
        m = new Money(0.67);
        Money instance = null;
        instance = new Money(12.33);
        int expResult = 1300;
        int result = instance.add(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class Money.
     */
    @Test
    public void testSub() throws Exception {
        System.out.println("sub");
        Money m = null;
        m = new Money(0.33);
        Money instance = null;
        instance = new Money(12.33);
        int expResult = 1200;
        int result = instance.sub(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class Money.
     */
    @Test
    public void testMul() throws Exception {
        System.out.println("mul");
        Money m = null;
        m = new Money(2);
        Money instance = null;
        instance = new Money(12.33);
        int expResult = 2466;
        int result = instance.mul(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Money.
     */
    @Test
    public void testDiv() throws Exception {
        System.out.println("div");
        Money m = null;
        m = new Money(2);
        Money instance = null;
        instance = new Money(12);
        int expResult = 6;
        int result = instance.div(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
