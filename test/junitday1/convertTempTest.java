/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitday1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.BeforeClass;

/**
 *
 * @author cottrell.lee
 */
public class convertTempTest {
    
    public convertTempTest() {
    }
    
    private static convertTemp instance = null;
    @BeforeClass
    public static void setupClass(){
        instance = new convertTemp();
    }
    
    @Test
    public void testCels100ToFah() {
        instance.setCelsius(100);
        double expected = 212;
        double result = instance.celsToFah();
        assertEquals(expected, result, 0.0);
    }
    
    @Test
    public void testCels0ToFah() {
        instance.setCelsius(0);
        double expected = 32;
        double result = instance.celsToFah();
        assertEquals(expected, result, 0.0);
    }
}
