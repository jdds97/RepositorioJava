package ExamenModelo;

import java.util.Random;

public abstract class Bebida {
	public final double IVA = 0.21;
	protected int id;
	protected int cantidad;
	private Random random=new Random();
	protected double precioBase=0 + (4.0 - 0.0) * random.nextDouble();
	protected double precioFinal = precioBase + (precioBase * IVA);
	protected String nombreMarca;
	protected Marca marca;
	protected String []arrayNombresMarcas;

	public Bebida(int id, int cantidad, double precioBase, double precioFinal, Marca marca,String[] arrayNombresMarcas,String nombreMarca) {
		this.id = id;
		this.cantidad = cantidad;
		this.precioBase = precioBase;
		this.precioFinal = precioFinal;
		this.marca = marca;
		this.arrayNombresMarcas=arrayNombresMarcas;
		this.nombreMarca=nombreMarca;
	}

	public double getPrecioFinalMarca(Marca marca) {
		return precioFinal;

	}

	public int getId() {
		return id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public Marca getNombreMarca() {
		return this.marca;
	}

	
}
