package tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class testMedia {

	 private static int[] arrayCorrecto1;
	 private static int[] arrayCorrecto2;
	 private static int[] arrayIncorrecto;
	
	
	@BeforeAll
	static void setup() {
		 arrayCorrecto1 = new int[] {3, 8, 6, 5};
		 arrayCorrecto2 = new int[] {2, 6, 6, 9};
	     arrayIncorrecto = new int[] {7, 11, 6, 9, 12}; 
		
		
	}
	
	@Test
    public void testMediaNotasValidas1() {
		float resultadoEsperado=5.5f;
        float resultadoObtenido = MisArrays.mediaNotas(arrayCorrecto1);
        assertEquals(resultadoEsperado,resultadoObtenido); 
    }
	@Test
    public void testMediaNotasValidas2() {
		float resultadoEsperado=5.75f;
        float resultadoObtenido = MisArrays.mediaNotas(arrayCorrecto2);
        assertEquals(resultadoEsperado,resultadoObtenido); 
    }
    
    @Test
    public void testMediaNotasInvalidas() {
    	Exception excepcion = assertThrows(IllegalArgumentException.class, () -> MisArrays.mediaNotas(arrayIncorrecto));
        
        String esperado = "Las notas deben estar entre 0 y 10.";
		String obtenido = excepcion.getMessage();
		assertEquals (esperado, obtenido);
    }
}
