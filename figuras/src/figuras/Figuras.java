package figuras;

public class Figuras {

	/**
	 * 
	 * @param lado Es el valor que tendra el lado del cuadrado
	 */
	public static void cuadrado(int lado){
		
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print("* ");		
			}
			System.out.print("\n");
		}		
	}
	
	/**
	 * 
	 * @param base es la base del rectangulo
	 * @param altura es la altura del rectangulo 
	 */
	public static void rectangulo(int base, int altura){
		
		for (int i = 0; i < base; i++) {
			for (int j = 0; j < altura; j++) {
				System.out.print("* ");		
			}
			System.out.print("\n");
		}
	}
	
	public static void paralelogramo(int base, int altura){
		
		for (int i = 0; i < base; i++) {
			for (int j = 0; j < altura; j++) {
				System.out.print("* ");		
			}
			System.out.print("\n");
		}
	}
	
	/** 
	 * @param lado
	 */
	public static void triangulo(int lado){
				
		int mitad = lado;
		int longitud = 1;
		
		for (int i = 0; i < lado; i++) {			
			for (int j = 0; j < mitad; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < longitud; j++) {
				System.out.print("* ");
			}
			longitud++;
			mitad--;
			System.out.print("\n");
		}
	}

}
