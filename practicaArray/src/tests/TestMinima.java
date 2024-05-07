package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;


import util.MisArrays;


class TestMinima {

	 private static int[] arrayCorrecto1;
	 private static int[] arrayCorrecto2;
	 private static int[] arrayIncorrecto;
	
	
	@BeforeAll
	static void setup() {
		 arrayCorrecto1 = new int[] {2, 1, 3, 5,9};
		 arrayCorrecto2 = new int[] {2, 5, 3, 8,7};
	     arrayIncorrecto = new int[] {7, 11, 6, 9, 2}; 
		
		
	}
	
	@Test
    public void testMinimaValido1() {
		float resultadoEsperado=1f;
        float resultadoObtenido = MisArrays.minimaNota(arrayCorrecto1);
        assertEquals(resultadoEsperado,resultadoObtenido); 
    }
	@Test
    public void testMinimaValido2() {
		float resultadoEsperado=2f;
        float resultadoObtenido = MisArrays.minimaNota(arrayCorrecto2);
        assertEquals(resultadoEsperado,resultadoObtenido); 
    }
    
    @Test
    public void testMinimaInvalido() {
    	Exception excepcion = assertThrows(IllegalArgumentException.class, () -> MisArrays.minimaNota(arrayIncorrecto));
        
        String esperado = "Las notas deben estar entre 0 y 10.";
		String obtenido = excepcion.getMessage();
		assertEquals (esperado, obtenido);
    }
}
