/**
 * 
 */
package poo_modelo;

/**
 * @author Jesús De Dios.R4
 *
 */
public class Cuadrado {

	/**
	 * 
	 */
	private int lado;
	

	public Cuadrado() {
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getArea(){
		
		int area=(int) Math.pow(lado, 2);
		return area;
	}

	
	public void pintarCuadrado(int lado) {
		char arribaLado = 0;
		char abajoLado = 0;
		char resultado = 0;
		this.lado=lado;	
		this.lado=lado;
		for (int i = 0; i < lado; i++) {
			arribaLado='*';
			abajoLado='*';
		}
		
		
			System.out.println(arribaLado+abajoLado);
	}

}