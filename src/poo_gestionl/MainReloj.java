/**
 * 
 */
package poo_gestionl;

import javax.swing.JOptionPane;


import poo_modelo.RelojAnalógico;
import poo_modelo.RelojDigital;

/**
 * @author Wally
 *
 */
public class MainReloj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RelojDigital AppleWatch=new RelojDigital();
		RelojAnalógico Casio=new RelojAnalógico();
		JOptionPane.showMessageDialog(null, Casio.mostrarHora());
		JOptionPane.showMessageDialog(null, AppleWatch.mostrarHora());
	}

}
