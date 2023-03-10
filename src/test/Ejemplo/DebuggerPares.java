package test.Ejemplo;

import org.junit.*;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DebuggerPares  {

    @Test
    public void basic(){

        for ( int i=0; i<10; i++) {
            System.out.print(i);

            if (i % 2 == 0) {
                System.out.println(" es par.");
            } else {
                System.out.println(" es impar.");
            }
        }

    }

}
