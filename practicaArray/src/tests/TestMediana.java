package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMediana {

	 private static int[] arrayCorrecto1;
	 private static int[] arrayCorrecto2;
	 private static int[] arrayIncorrecto;
	
	
	@BeforeAll
	static void setup() {
		 arrayCorrecto1 = new int[] {2, 1, 3, 5,9};
		 arrayCorrecto2 = new int[] {2, 5, 1, 9,7};
	     arrayIncorrecto = new int[] {7, 11, 6, 9, 2}; 
		
		
	}
	
	@Test
    public void testMedianaValido1() {
		float resultadoEsperado=3f;
        float resultadoObtenido = MisArrays.medianaNotas(arrayCorrecto1);
        assertEquals(resultadoEsperado,resultadoObtenido); 
    }
	@Test
    public void testMedianaValido2() {
		float resultadoEsperado=5f;
        float resultadoObtenido = MisArrays.medianaNotas(arrayCorrecto2);
        assertEquals(resultadoEsperado,resultadoObtenido); 
    }
    
    @Test
    public void testMedianaInvalido() {
    	Exception excepcion = assertThrows(IllegalArgumentException.class, () -> MisArrays.medianaNotas(arrayIncorrecto));
        
        String esperado = "Las notas deben estar entre 0 y 10.";
		String obtenido = excepcion.getMessage();
		assertEquals (esperado, obtenido);
    }
}


