/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gin-1
 */
public class customizeBillTest {
    
    public customizeBillTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of billList method, of class customizeBill.
     */
    @Test
    public void testBillList() {
        System.out.println("billList");
        customizeBill instance = new customizeBill();
      //  ArrayList expResult = null;
      //  ArrayList result = instance.billList();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ShowTable method, of class customizeBill.
     */
    @Test
    public void testShowTable() {
        System.out.println("ShowTable");
        customizeBill instance = new customizeBill();
        instance.ShowTable();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class customizeBill.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        customizeBill.main(args);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of testButton method, of class customizeBill.
     */
    @Test
    public void testTestButton() {
        System.out.println("testButton");
        String name = "-";
        customizeBill instance = new customizeBill();
        String expResult = "-";
        String result = instance.testButton(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
