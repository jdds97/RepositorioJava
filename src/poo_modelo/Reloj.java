/**
 * 
 */
package poo_modelo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

/**
 * @author Jesús De Dios.R4
 *
 */
public abstract class Reloj {
	protected LocalTime hora = LocalTime.now();
	protected static LocalTime horaAlarma;
	protected static boolean alarma = false;

	/**
	 * @param hora
	 */

	abstract String mostrarHora();

	public static boolean isAlarma() {
		return alarma;
	}

	public static boolean activarAlarma(int horas, int minutos) {
		if (alarma) {
			horaAlarma = LocalTime.of(horas, minutos);

			return !alarma;
		}
		return alarma;
	}

	/**
	 * @return the horaAlarma
	 */
	public static LocalTime getHoraAlarma() {
		return horaAlarma;
	}

	/**
	 * @param horaAlarma the horaAlarma to set
	 */
	public static void setHoraAlarma(LocalTime horaAlarma) {
		Reloj.horaAlarma = horaAlarma;
	}

	/**
	 * 
	 * @return alarma desactivada
	 */
	public static boolean desactivarAlarma() {
		if (!alarma) {
			return alarma;
		}
		return alarma;
	}
}
