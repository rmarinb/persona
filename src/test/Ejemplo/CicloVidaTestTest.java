package test.Ejemplo; 

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.assertTrue;

/** 
* CicloVidaTest Tester. 
* 
* @author <Authors name> 
* @since <pre>10/21/2022</pre> 
* @version 1.0 
*/ 
public class CicloVidaTestTest extends TestCase {

    public CicloVidaTestTest(String name) {
        super(name);
    }

    @org.junit.Test
    public void test1(){
        System.out.println("Test1");
        assertTrue(true);
    }
    @org.junit.Test
    public void test2(){
        System.out.println("Test2");
        assertTrue(true);
    }


    public static Test suite() {
        return new TestSuite(CicloVidaTestTest.class);
    }

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        System.out.println("Inicio caso de prueba");
    }

    @Override
    @After
    public void tearDown() throws Exception {
        super.tearDown();
        System.out.println("Fin caso de prueba");
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Inicio ciclo de vida");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Fin ciclo de vida");
    }
}
