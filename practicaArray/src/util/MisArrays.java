package util;

public abstract class MisArrays {
	
/**
 * 	
 * @param 	Método que recibe un array con las notas
 * 
 * 
 * @return	Método que devuelve la media de las notas introducidas en el array
 */
	public static float mediaNotas(int[] notas) {
	        for (int nota : notas) {
	            if (nota < 0 || nota > 10) {
	                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10.");
	            }
	        }
	        
	        int sum = 0;
	        for (int nota : notas) {
	            sum += nota;
	        }
	        return (float) sum / notas.length;
	    }


}
