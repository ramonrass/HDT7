/*
UVG
HDT 7
Ramon Samayoa
Jorge Mario Lara
Miercoles 5 de Cotubre de 2016
*/
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorge, Ramon
 */
public class TreeTest {
    
    public TreeTest() {
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
     * Test of getFrec method, of class Tree.
     */
    @Test
    public void testGetFrec() {
        System.out.println("getFrec");
        Tree instance = null;
        int expResult = 0;
        int result = instance.getFrec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrec method, of class Tree.
     */
    @Test
    public void testSetFrec() {
        System.out.println("setFrec");
        int Frec = 0;
        Tree instance = null;
        instance.setFrec(Frec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharacter method, of class Tree.
     */
    @Test
    public void testGetCharacter() {
        System.out.println("getCharacter");
        Tree instance = null;
        char expResult = ' ';
        char result = instance.getCharacter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCharacter method, of class Tree.
     */
    @Test
    public void testSetCharacter() {
        System.out.println("setCharacter");
        char Character = ' ';
        Tree instance = null;
        instance.setCharacter(Character);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCode method, of class Tree.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Tree instance = null;
        String expResult = "";
        String result = instance.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCode method, of class Tree.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        String codigo = "";
        String add = "";
        Tree instance = null;
        instance.setCode(codigo, add);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDerecha method, of class Tree.
     */
    @Test
    public void testGetDerecha() {
        System.out.println("getDerecha");
        Tree instance = null;
        Tree expResult = null;
        Tree result = instance.getDerecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDerecha method, of class Tree.
     */
    @Test
    public void testSetDerecha() {
        System.out.println("setDerecha");
        Tree Derecha = null;
        Tree instance = null;
        instance.setDerecha(Derecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIzquierda method, of class Tree.
     */
    @Test
    public void testGetIzquierda() {
        System.out.println("getIzquierda");
        Tree instance = null;
        Tree expResult = null;
        Tree result = instance.getIzquierda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIzquierda method, of class Tree.
     */
    @Test
    public void testSetIzquierda() {
        System.out.println("setIzquierda");
        Tree Izquierda = null;
        Tree instance = null;
        instance.setIzquierda(Izquierda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
