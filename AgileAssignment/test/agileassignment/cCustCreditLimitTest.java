/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class cCustCreditLimitTest {
    
    public cCustCreditLimitTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testClear() {
        System.out.println("Clear");
        cCustCreditLimit instance = new cCustCreditLimit();
        instance.Clear();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testCCustList() {
        System.out.println("CCustList");
        cCustCreditLimit instance = new cCustCreditLimit();
        instance.cCustList();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testAddRowToTable() {
        System.out.println("AddRowToTable");
        cCustCreditLimit instance = new cCustCreditLimit();
        instance.addRowToTable();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testCLimit() {
        System.out.println("cLimit");
        String limit = "1000";
        cCustCreditLimit instance = new cCustCreditLimit();
        String expResult = "1000";
        String result = instance.cLimit(limit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        cCustCreditLimit.main(args);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }
}
