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

/**
 * 
 * @param	Método que recibe un array con las notas 
 * 
 * 
 * @return	Método que devuelve la mediana de las notas introducidas en el array	
 */
		public static float medianaNotas(int[] notas) {
	        for (int nota : notas) {
	            if (nota < 0 || nota > 10) {
	                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10.");
	            }
	        }
	        
	        int n = notas.length;
	        java.util.Arrays.sort(notas);
	        if (n % 2 == 0) {
	            return (float) (notas[n / 2 - 1] + notas[n / 2]) / 2;
	        } else {
	            return notas[n / 2];
	        }
	    }
/**
 * 
 * @param	Método que recibe un array con las notas	
 * 
 * 
 * @return	Método que devuelve la maxima de las notas introducidas en el array
 */
		public static int maximaNota(int[] notas) {
		        for (int nota : notas) {
		            if (nota < 0 || nota > 10) {
		                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10.");
		            }
		        }
		        
		        int max = notas[0];
		        for (int nota : notas) {
		            if (nota > max) {
		                max = nota;
		            }
		        }
		        return max;
		    }
}
