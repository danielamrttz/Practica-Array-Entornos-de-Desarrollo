package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMaxima {

	 private static int[] arrayCorrecto1;
	 private static int[] arrayCorrecto2;
	 private static int[] arrayIncorrecto;
	
	
	@BeforeAll
	static void setup() {
		 arrayCorrecto1 = new int[] {2, 1, 3, 5,9};
		 arrayCorrecto2 = new int[] {2, 5, 1, 8,7};
	     arrayIncorrecto = new int[] {7, 11, 6, 9, 2}; 
		
		
	}
	
	@Test
    public void testMaximaValido1() {
		float resultadoEsperado=9f;
        float resultadoObtenido = MisArrays.maximaNota(arrayCorrecto1);
        assertEquals(resultadoEsperado,resultadoObtenido); 
    }
	@Test
    public void testMaximaValido2() {
		float resultadoEsperado=8f;
        float resultadoObtenido = MisArrays.maximaNota(arrayCorrecto2);
        assertEquals(resultadoEsperado,resultadoObtenido); 
    }
    
    @Test
    public void testMaximaInvalido() {
    	Exception excepcion = assertThrows(IllegalArgumentException.class, () -> MisArrays.maximaNota(arrayIncorrecto));
        
        String esperado = "Las notas deben estar entre 0 y 10.";
		String obtenido = excepcion.getMessage();
		assertEquals (esperado, obtenido);
    }
}


