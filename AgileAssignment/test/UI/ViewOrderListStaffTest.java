/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jun-1
 */
public class ViewOrderListStaffTest {
    ViewOrderListStaff vols;
    public ViewOrderListStaffTest() {
    }
    
    @Before
    public void setUp() {
        vols = new ViewOrderListStaff();
    }

    /**
     * Test of OrderList method, of class ViewOrderListStaff.
     */
    @Test
    public void testOrderList() {
        System.out.println("OrderList");
        ViewOrderListStaff instance = new ViewOrderListStaff();
        instance.OrderList();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of refreshDateDDL method, of class ViewOrderListStaff.
     */
    @Test
    public void testRefreshDateDDL() {
        System.out.println("refreshDateDDL");
        ViewOrderListStaff instance = new ViewOrderListStaff();
        instance.refreshDateDDL();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of refreshOrdeTable method, of class ViewOrderListStaff.
     */
    @Test
    public void testRefreshOrdeTable() {
        System.out.println("refreshOrdeTable");
        ViewOrderListStaff instance = new ViewOrderListStaff();
        instance.refreshOrdeTable();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testdateDDL() {
        System.out.println("Date DDL");
        String date = " ";
        ViewOrderListStaff instance = new ViewOrderListStaff();
        String expResult = " ";
        String result = instance.dateDDL(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class ViewOrderListStaff.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ViewOrderListStaff.main(args);
        // TODO review the generated test code and remove the default call to fail.
       }*/
    
}
