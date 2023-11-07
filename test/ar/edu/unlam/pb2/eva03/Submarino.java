package ar.edu.unlam.pb2.eva03;

public class Submarino extends Vehiculo implements Acuatico {
	private Double profundidad = 0.0;

	
	public Submarino(Integer codigo, String nombre) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		
	}
	
	
	public Submarino(String codigoLargo, String nombre) {
		this.setCodigoLargo(codigoLargo);
		this.setNombre(nombre);
		
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public void setProfundidad(Double prof) {
		this.profundidad = prof;
	}

	
	
	


}
