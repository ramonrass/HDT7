/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorge
 */
public class CodificacionTest {
    
    public CodificacionTest() {
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
     * Test of Separar method, of class Codificacion.
     */
    @Test
    public void testSeparar() {
        System.out.println("Separar");
        Codificacion instance = null;
        Vector<Tree> expResult = null;
        Vector<Tree> result = instance.Separar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Construir method, of class Codificacion.
     */
    @Test
    public void testConstruir() {
        System.out.println("Construir");
        Codificacion instance = null;
        instance.Construir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cdatos method, of class Codificacion.
     */
    @Test
    public void testCdatos() {
        System.out.println("Cdatos");
        Tree find = null;
        Codificacion instance = null;
        instance.Cdatos(find);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQueue method, of class Codificacion.
     */
    @Test
    public void testGetQueue() {
        System.out.println("getQueue");
        Codificacion instance = null;
        Vector<Tree> expResult = null;
        Vector<Tree> result = instance.getQueue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQueue method, of class Codificacion.
     */
    @Test
    public void testSetQueue() {
        System.out.println("setQueue");
        Vector<Tree> queue = null;
        Codificacion instance = null;
        instance.setQueue(queue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMsg method, of class Codificacion.
     */
    @Test
    public void testGetMsg() {
        System.out.println("getMsg");
        Codificacion instance = null;
        String expResult = "";
        String result = instance.getMsg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMsg method, of class Codificacion.
     */
    @Test
    public void testSetMsg() {
        System.out.println("setMsg");
        String msg = "";
        Codificacion instance = null;
        instance.setMsg(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
