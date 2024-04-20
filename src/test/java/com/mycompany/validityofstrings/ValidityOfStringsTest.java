/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.validityofstrings;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Huawei i5 CCM
 */
public class ValidityOfStringsTest {
    
    public ValidityOfStringsTest() {
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
     * Test of main method, of class ValidityOfStrings.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ValidityOfStrings.main(args);
        
    }

    /**
     * Test of isValid method, of class ValidityOfStrings.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        String Parenthesis = "()";
        boolean expResult = true;
        boolean result = ValidityOfStrings.isValid(Parenthesis);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of odd_squares_sum method, of class ValidityOfStrings.
     */
    @Test
    public void testOdd_squares_sum() {
        System.out.println("odd_squares_sum");
        int limit = 20;
        int expResult = 1330;
        int result = ValidityOfStrings.odd_squares_sum(limit);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of highestCommonFactor method, of class ValidityOfStrings.
     */
    @Test
    public void testHighestCommonFactor() {
        System.out.println("highestCommonFactor");
        double a = 10.0;
        double j = 15.0;
        double expResult = 5.0;
        double result = ValidityOfStrings.highestCommonFactor(a, j);
        assertEquals(expResult, result, 0.0005);
        
    }
    
}
