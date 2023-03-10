package test.Ejemplo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/** 
* CicloVidaTest Tester. 
* 
* @author <Authors name> 
* @since <pre>10/21/2022</pre> 
* @version 1.0 
*/ 
public class CicloVidaTest extends TestCase {


    // nuevo comentario
    public CicloVidaTest(String name) {
        super(name);
    }


    @BeforeClass
    public static void beforeClass() {
        System.out.println("Inicio ciclo de vida");
    }

    @AfterClass
    public static void afterClass()  {
        System.out.println("Fin ciclo de vida");
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


}
