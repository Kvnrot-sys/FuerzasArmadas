package ar.edu.unlam.pb2.eva03;

public class Avion  extends Vehiculo implements Volador {
	
	
	
	private Double altura = 0.0;
	
	

	public Avion(Integer codigo, String nombre) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		
	}
	
	public Avion(String codigoLargo, String nombre) {
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

}
