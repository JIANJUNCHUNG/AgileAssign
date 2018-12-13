/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment;

import agileassignment.StaffSalesOrder.OrderList;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yipki
 */
public class StaffSalesOrderTest {
    String Tno1 = "OD00001";
    String Tno2 = "OD00002";
    
    
    public StaffSalesOrderTest() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of PickUpList method, of class StaffSalesOrder.
     */
    @Test
    public void testPickUpList() {
        System.out.println("PickUpList");
        StaffSalesOrder instance = new StaffSalesOrder();
        ArrayList<OrderList> result = instance.PickUpList();
        assertEquals(Tno1, result.get(0).TransactionNo);
        assertEquals(Tno2, result.get(1).TransactionNo);
        
    }

    /**
     * Test of addRowToTable method, of class StaffSalesOrder.
     */
    @Test
    public void testAddRowToTable() {
        
    }

    /**
     * Test of main method, of class StaffSalesOrder.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StaffSalesOrder.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
