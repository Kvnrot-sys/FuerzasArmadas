package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre {
	
	public Double velocidad = 0.0;
	
	

	public Tanque(Integer codigo, String nombre) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		
	}
	
	
	public Tanque(String codigoLargo, String nombre) {
		this.setCodigoLargo(codigoLargo);
		this.setNombre(nombre);
		
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

	@Override
	public void setVelocidad(Double vel) {
		this.velocidad = vel;
	}

}
