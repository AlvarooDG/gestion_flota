package modelos;

import java.util.ArrayList;

public class Camion {
	protected String matricula;
	protected ArrayList<Ruta> rutas;
	protected Chofer chofer;
	
	public Camion(String matricula, Chofer chofer) {
		this.matricula = matricula;
		this.rutas = new ArrayList<Ruta>();
		this.chofer = chofer;
	}
	
	public Camion(String matricula) {
		this.matricula = matricula;
		this.rutas = new ArrayList<Ruta>();
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void agregarRuta(Ruta nuevaRuta) {
		this.rutas.add(nuevaRuta);
	}

	public ArrayList<String> devolverDestinosPorCamion() {
		ArrayList<String> destinos = new ArrayList<String>();
		for (int i = 0; i < this.rutas.size(); i++) {
			Ruta ruta = this.rutas.get(i);
			String destino = ruta.getDestino();
			destinos.add(destino);
		}
		return destinos;
	}
}
