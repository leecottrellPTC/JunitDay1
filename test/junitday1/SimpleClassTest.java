/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitday1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cottrell.lee
 */
public class SimpleClassTest {
    
    public SimpleClassTest() {
    }
    
    @Test
    public void testAddEm(){
        int a = 5;
        int b = 6;
        SimpleClass instance = new SimpleClass();
        int expresult = 10;
        int result = instance.addEm(a, b);
        assertEquals("Testing 5 + 6", expresult, result);
    }
    
    @Test
    public void testDivEm(){
        int a = 5;
        int b = 2;
        float expected = 2.5f;
        SimpleClass instance = new SimpleClass();
        float result = instance.divEm(a, b);
        assertEquals(expected, result, .01);
    }
}
