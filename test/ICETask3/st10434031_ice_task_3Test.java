/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ICETask3;

import ICETask3.st10434031_ice_task_3;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 27609
 */
public class st10434031_ice_task_3Test {
    
    public st10434031_ice_task_3Test() {
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
     * Test of isValid method, of class IsValid.
     */
    @Test
    public void testIsValid() 
    {
        
        String s =null;
        st10434031_ice_task_3 instance = new st10434031_ice_task_3 ();
        
        s="{}{)}";
        boolean expResult = false;
        boolean result = instance.isValid(s);
        assertEquals(expResult, result);
        
        
        s="";
        expResult = false;
        result = instance.isValid(s);
        assertEquals(expResult, result);
        
        s="{[}]";
        expResult = false;
        result = instance.isValid(s);
        assertEquals(expResult, result);
        
        s="()";
        expResult = true;
        result = instance.isValid(s);
        assertEquals(expResult, result);
        
        s="({[]})";
        expResult = true;
        result = instance.isValid(s);
        assertEquals(expResult, result);
        
     
    }

    
    @Test
    public void testOdd_squares_sum() 
    {
        
        
        st10434031_ice_task_3  instance = new st10434031_ice_task_3 ();
        
        int n = 1;
        int expResult = 1;
        int result = instance.odd_squares_sum(n);
        assertEquals(expResult, result);
        
        
        n = 3;
        expResult = 10;
        result = instance.odd_squares_sum(n);
        assertEquals(expResult, result);
        
        n = 2;
        expResult = 1;
        result = instance.odd_squares_sum(n);
        assertEquals(expResult, result);
        
        
        n = 5;
        expResult = 35;
        result = instance.odd_squares_sum(n);
        assertEquals(expResult, result);
        
        n = 6;
        expResult = 35;
        result = instance.odd_squares_sum(n);
        assertEquals(expResult, result);
        
        n = 7;
        expResult = 84;
        result = instance.odd_squares_sum(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testGreatest_common_divisor() 
    {
        
        
        st10434031_ice_task_3  instance = new st10434031_ice_task_3 ();
        
        
        int a = 2;
        int b = 4;
        int expResult = 2;
        int result = instance.greatest_common_divisor(a, b);
        assertEquals(expResult, result);
        
        
        a = 16;
        b = 4;
        expResult = 4;
        result = instance.greatest_common_divisor(a, b);
        assertEquals(expResult, result);
        
        a = 15;
        b = 100;
        expResult = 5;
        result = instance.greatest_common_divisor(a, b);
        assertEquals(expResult, result);
        
    }
    
    
}
