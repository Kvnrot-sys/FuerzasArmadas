package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;



public class Batalla {
	
	
	private String nombre;
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla = new HashSet<Vehiculo>();
	
	
	public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		super();
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
	}

	
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		
		
		
		
		
		this.vehiculosEnLaBatalla.add(vehiculo);
		
	}
	
	

	public Set<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}



	public void setVehiculosEnLaBatalla(Set<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getLatitud() {
		return latitud;
	}


	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}


	public Double getLongitud() {
		return longitud;
	}


	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}


	public TipoDeBatalla getTipo() {
		return tipo;
	}


	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batalla other = (Batalla) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	
	
	
	
	
	
}
