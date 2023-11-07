package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Vehiculo {
	protected String codigoLargo;
	protected Integer codigo;
	protected String nombre;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoLargo() {
		return codigoLargo;
	}
	public void setCodigoLargo(String codigoLargo) {
		this.codigoLargo = codigoLargo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, codigoLargo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(codigoLargo, other.codigoLargo);
	}
	
	
	
	
	
	

}
