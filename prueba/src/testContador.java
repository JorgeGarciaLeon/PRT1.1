import static org.junit.jupiter.api.Assertions.assertEquals;

import  org.junit.*;

public class testContador {
    
    @Test
    public void comprobarConstructor(){
        contador c = new contador();
    }

    @Test
    public void comprobarLimite(){
        contador c = new contador(0,10,1);
        boolean comproba = c.comprobar();
        assertEquals(true, comproba);
    }
}
