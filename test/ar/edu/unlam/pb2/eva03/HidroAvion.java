package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Acuatico, Volador {
	
	private Double altura = 0.0;
	private Double profundidad = 0.0;
	

	public HidroAvion(Integer codigo, String nombre) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		
	}
	
	public HidroAvion(String codigoLargo, String nombre) {
		this.setCodigoLargo(codigoLargo);
		this.setNombre(nombre);
		
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}

	@Override
	public void setAltura(Double altura) {
		this.altura = altura;
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
