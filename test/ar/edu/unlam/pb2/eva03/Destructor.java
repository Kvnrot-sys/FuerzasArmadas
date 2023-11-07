package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Acuatico {
	
	private Double profundidad = 0.0;

	
	public Destructor(Integer codigo, String nombre) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		
	}
	
	public Destructor(String codigoLargo, String nombre) {
		this.setCodigoLargo(codigoLargo);
		this.setNombre(nombre);
		
	}
	

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProfundidad(Double prof) {
		// TODO Auto-generated method stub
		
	}

}
