package ar.edu.unlam.pb2.eva03;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy = new HashSet<Vehiculo>();
	private Map<String, Batalla> batallas = new HashMap<String, Batalla>();
	private String nombre;

	final Integer CAPACIDAD_DE_DEFENSA = 12;

	public FuerzaArmada() {

	}

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {

		if (this.convoy.size() < CAPACIDAD_DE_DEFENSA) {
			this.convoy.add(vehiculo);
		}

	}

	public void crearBatalla(String nombre, TipoDeBatalla terrestre, Double latitud, Double longitud) {

		Batalla nuevaBatalla = new Batalla(nombre, terrestre, latitud, longitud);

		this.batallas.put(nombre, nuevaBatalla);

	}

	public Batalla getBatalla(String nombreDeLaBatalla) {

		for (Map.Entry<String, Batalla> entry : batallas.entrySet()) {
			if (entry.getKey().equalsIgnoreCase(nombreDeLaBatalla)) {
				return entry.getValue();
			}

		}
		return null;
	}
	
	
	public Vehiculo getVehiculo(Integer codigoDeVehiculo) {

		for (Vehiculo actual : convoy) {
			if(actual.getCodigo().equals(codigoDeVehiculo)) {
				return actual;
			}
		}
		return null;

		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//	public void presentarBatalla() {
//		
//		Set<Terrestre> vehiculosTerrestres = new HashSet<Terrestre>();
//		Set<Acuatico> vehiculosAcuaticos = new HashSet<Acuatico>();
//		Set<Volador> vehiculosVoladores = new HashSet<Volador>();
//		
//		for(Vehiculo actual : convoy) {
//			if(actual instanceof Terrestre ) {
//				vehiculosTerrestres.add( (Terrestre) actual);
//			}
//			else if (actual instanceof Acuatico) {
//				vehiculosAcuaticos.add((Acuatico) actual);
//			}
//			else if (actual instanceof Volador ) {
//				vehiculosVoladores.add((Volador) actual);
//			}
//			
//			
//		}
//		
//		for(Map.Entry<String, Batalla> entry : batallas.entrySet()) {
//			if(entry.getValue().getTipo().equals(TipoDeBatalla.TERRESTRE)) {
//				entry.getValue().getVehiculosEnLaBatalla().addAll((Collection<? extends Vehiculo>) vehiculosTerrestres);
//				
//			}
//			
//			else if(entry.getValue().getTipo().equals(TipoDeBatalla.NAVAL)) {
//				entry.getValue().getVehiculosEnLaBatalla().addAll((Collection<? extends Vehiculo>) vehiculosAcuaticos);
//				
//			}
//			
//			else if(entry.getValue().getTipo().equals(TipoDeBatalla.AEREA)) {
//				entry.getValue().getVehiculosEnLaBatalla().addAll((Collection<? extends Vehiculo>) vehiculosVoladores);
//				
//			}
//		}
//		
//
//	}

	public Boolean enviarALaBatalla(String nombre, Integer codigo) throws VehiculoIncompatible, VehiculoInexistente {
		Batalla batalla = getBatalla(nombre);
		Vehiculo vehiculo = getVehiculo(codigo);
		
		
		if(!(vehiculo == null)) {
			
			
		
		
		if(vehiculo instanceof Acuatico && batalla.getTipo().equals(TipoDeBatalla.NAVAL)) {
			batalla.agregarVehiculo(vehiculo);	
			return true;
		}
		
		else if(vehiculo instanceof Terrestre && batalla.getTipo().equals(TipoDeBatalla.TERRESTRE)) {
			batalla.agregarVehiculo(vehiculo);	
			return true;
			
		}
		
		else if(vehiculo instanceof Volador && batalla.getTipo().equals(TipoDeBatalla.AEREA)) {
			batalla.agregarVehiculo(vehiculo);	
			return true;
		}
		
		throw new VehiculoIncompatible();
		
		}
		throw new VehiculoInexistente();
		
	}

}
