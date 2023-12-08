package controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import modelos.Camion;
import modelos.Chofer;

public class ControladorCamiones {
	//private ArrayList<Camion> camiones;
	private HashMap<String, Camion> camiones;
	public ControladorCamiones() {
		//this.camiones = new ArrayList<Camion>();
		this.camiones = new HashMap<String, Camion>();
	}
	
	/**ESTA ES LA MEJOR*/
	public void agregarCamion(Camion nuevoCamion) {
		//this.camiones.add(nuevoCamion);
		this.camiones.put(nuevoCamion.getMatricula(), nuevoCamion);
	}
	
	/**ESTA ES INTERMEDIA*/
	public void agregarCamion(String matricula, Chofer chofer) {
		Camion nuevoCamion = new Camion(matricula, chofer);
		//this.camiones.add(nuevoCamion);
		this.camiones.put(nuevoCamion.getMatricula(), nuevoCamion);
	}
	
	/**ESTA ES LA PEOR*/
	public void agregarCamion(String matricula, String nombreChofer, String direccionChofer, String dniChofer) {
		Chofer chofer = new Chofer(nombreChofer, direccionChofer, dniChofer);
		Camion nuevoCamion = new Camion(matricula, chofer);
		//this.camiones.add(nuevoCamion);
		this.camiones.put(nuevoCamion.getMatricula(), nuevoCamion);
	}
	
	/**Recuperar todos los destinos de un camion*/
	/*public ArrayList<String> devolverDestinos(String matricula) {
		ArrayList<String> destinos = new ArrayList<String>();
		for(int i = 0; i < this.camiones.size(); i++) {
			Camion camion = this.camiones.get(i);
			String matriculaCamion = camion.getMatricula();
			if (matriculaCamion.equalsIgnoreCase(matricula)) {
				destinos = camion.devolverDestinosPorCamion();
				break;
			}
		}
		return destinos;
	}*/
	
	/*public ArrayList<String> devolverDestinos(String matricula) {
		ArrayList<String> destinos = new ArrayList<String>();
		Camion camion = this.camiones.get(matricula);
		if (camion != null) {
			destinos = camion.devolverDestinosPorCamion();
		}
		return destinos;
	}*/
	
	public ArrayList<String> devolverDestinos2(String matricula) {
		ArrayList<String> destinos = new ArrayList<String>();
		Camion camion = this.camiones.get(matricula);
		if (camion != null) {
			ArrayList<String> destinosLista = camion.devolverDestinosPorCamion();
			destinos.addAll(destinosLista);
		}
		return destinos;
	}
	
	public HashSet<String> devolverDestinos(String matricula) {
		HashSet<String> destinos = new HashSet<String>();
		//destinos.add("Alain");
		//destinos.add("Alvaro");
		//destinos.add("Alain");
		Camion camion = this.camiones.get(matricula);
		if (camion != null) {
			ArrayList<String> destinosLista = camion.devolverDestinosPorCamion();//Puede llegar con duplicados
			/*ArrayList<String> sinDuplicados = new ArrayList<>();
			for (int i = 0; i < destinosLista.size(); i++) {
				String destino = destinosLista.get(i);
				if (sinDuplicados.contains(destino) == false) {
					sinDuplicados.add(destino);
				}
			}*/ //Sin hashset
			destinos.addAll(destinosLista);
		}
		return destinos;
	}
	
	public ArrayList<String> devolverMatriculasTodosCamiones() {
		ArrayList<String> matriculas = new ArrayList<String>();
	    ArrayList<Camion> camiones = new ArrayList<Camion>(this.camiones.values());
	    for (int i = 0; i < camiones.size(); i++) {
			Camion camion = camiones.get(i);
			String matricula = camion.getMatricula();
			matriculas.add(matricula);
		}
		return matriculas;
	}
}
