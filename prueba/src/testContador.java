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

    @Test
    public void volverValorInicial(){
        contador c = new contador(0,10,1);
        int comproba = c.volverValorInicial();
        assertEquals(0, comproba);
    }

    @Test
    public void verValorActual(){
        contador c = new contador(0,10,1);
        int comproba = c.getValorActual();
        assertEquals(0, comproba);
    }

    @Test
    public void resetValor(){
        contador c = new contador(0,10,1);
        int comproba = c.getValorActual();
        assertEquals(0, comproba);
    }
}
