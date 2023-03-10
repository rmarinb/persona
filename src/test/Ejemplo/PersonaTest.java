package test.Ejemplo;


import Ejemplo.Persona;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/** 
* Persona Tester. 
* 
* @author <Authors name> 
* @since <pre>oct 19, 2022</pre> 
* @version 1.0 
*/ 
public class PersonaTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: setName(String name)
     */
    @Test
    public void testSetName() throws Exception {
        Persona Person = new Persona("Emma");
        Person.setName("Luisa");

        String nombrenuevo = Person.getName();
        assertNotNull(nombrenuevo);
        assertTrue(nombrenuevo == "Luisa");
    }

}
