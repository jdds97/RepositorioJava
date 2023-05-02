package model;

import java.util.Objects;

import interfaces.IUsuario;
import interfaces.IValoracion;

public class Valoracion implements IValoracion,Comparable<IValoracion>{
	private String comentario;
	private int puntuacion;
	private IUsuario usuario;
	@Override
	public String getComentario() {
		// TODO Auto-generated method stub
		return this.comentario;
	}

	@Override
	public void setComentario(String comentario) {
		this.comentario=comentario;
	}

	@Override
	public int getPuntuacion() {
		// TODO Auto-generated method stub
		return this.puntuacion;
	}

	@Override
	public void setPuntuacion(int puntuacion) throws PuntuacionInvalidaException {
		this.puntuacion=puntuacion;
	}

	@Override
	public IUsuario getUsuario() {

		return usuario;
	}

	@Override
	public void setUsuario(IUsuario usuario) {
		this.usuario=usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valoracion other = (Valoracion) obj;
		return Objects.equals(usuario, other.usuario);
	}


	@Override
	public int compareTo(IValoracion o) {
		int numeroSaliente;
		if (this.puntuacion == o.getPuntuacion()) {
			numeroSaliente = 0;
		} else if (this.puntuacion <o.getPuntuacion()) {
			numeroSaliente = -1;
		} else {
			numeroSaliente = 1;
		}
		return numeroSaliente;		
	}




}	
