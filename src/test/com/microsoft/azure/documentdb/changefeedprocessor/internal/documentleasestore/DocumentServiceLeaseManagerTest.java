/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.azure.documentdb.changefeedprocessor.internal.documentleasestore;

import com.microsoft.azure.documentdb.changefeedprocessor.internal.Lease;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yoterada
 */
public class DocumentServiceLeaseManagerTest {
    
    public DocumentServiceLeaseManagerTest() {
    }

    /**
     * Test of dispose method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testDispose() {
        System.out.println("dispose");
        DocumentServiceLeaseManager instance = null;
        instance.dispose();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testInitialize() throws Exception {
        System.out.println("initialize");
        DocumentServiceLeaseManager instance = null;
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leaseStoreExists method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testLeaseStoreExists() throws Exception {
        System.out.println("leaseStoreExists");
        DocumentServiceLeaseManager instance = null;
        boolean expResult = false;
        boolean result = instance.leaseStoreExists();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createLeaseStoreIfNotExists method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testCreateLeaseStoreIfNotExists() throws Exception {
        System.out.println("createLeaseStoreIfNotExists");
        DocumentServiceLeaseManager instance = null;
        boolean expResult = false;
        boolean result = instance.createLeaseStoreIfNotExists();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listLeases method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testListLeases() {
        System.out.println("listLeases");
        DocumentServiceLeaseManager instance = null;
        Iterable<DocumentServiceLease> expResult = null;
        Iterable<DocumentServiceLease> result = instance.listLeases();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createLeaseIfNotExist method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testCreateLeaseIfNotExist() throws Exception {
        System.out.println("createLeaseIfNotExist");
        String partitionId = "";
        String continuationToken = "";
        DocumentServiceLeaseManager instance = null;
        boolean expResult = false;
        boolean result = instance.createLeaseIfNotExist(partitionId, continuationToken);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLease method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testGetLease() throws Exception {
        System.out.println("getLease");
        String partitionId = "";
        DocumentServiceLeaseManager instance = null;
        DocumentServiceLease expResult = null;
        DocumentServiceLease result = instance.getLease(partitionId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acquire method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testAcquire() throws Exception {
        System.out.println("acquire");
        DocumentServiceLease lease = null;
        String owner = "";
        DocumentServiceLeaseManager instance = null;
        DocumentServiceLease expResult = null;
        DocumentServiceLease result = instance.acquire(lease, owner);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of renew method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testRenew() throws Exception {
        System.out.println("renew");
        DocumentServiceLease lease = null;
        DocumentServiceLeaseManager instance = null;
        DocumentServiceLease expResult = null;
        DocumentServiceLease result = instance.renew(lease);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of release method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testRelease() throws Exception {
        System.out.println("release");
        DocumentServiceLease lease = null;
        DocumentServiceLeaseManager instance = null;
        boolean expResult = false;
        boolean result = instance.release(lease);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        DocumentServiceLease lease = null;
        DocumentServiceLeaseManager instance = null;
        instance.delete(lease);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAll method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testDeleteAll() throws Exception {
        System.out.println("deleteAll");
        DocumentServiceLeaseManager instance = null;
        instance.deleteAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isExpired method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testIsExpired() {
        System.out.println("isExpired");
        DocumentServiceLease lease = null;
        DocumentServiceLeaseManager instance = null;
        boolean expResult = false;
        boolean result = instance.isExpired(lease);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkpoint method, of class DocumentServiceLeaseManager.
     */
    @Test
    public void testCheckpoint() {
        System.out.println("checkpoint");
        Lease lease = null;
        String continuationToken = "";
        long sequenceNumber = 0L;
        DocumentServiceLeaseManager instance = null;
        Lease expResult = null;
        Lease result = instance.checkpoint(lease, continuationToken, sequenceNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}