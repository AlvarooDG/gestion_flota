package modelos;

public class CamionLargaDistancia extends Camion {
	private double pesoMaximo;
	private double pesoMinimo;
	
	public CamionLargaDistancia(String matricula, Chofer chofer, double pesoMaximo, double pesoMinimo) {
		super(matricula, chofer);
		this.pesoMaximo = pesoMaximo;
		this.pesoMinimo = pesoMinimo;
	}

	public CamionLargaDistancia(String matricula, double pesoMaximo, double pesoMinimo) {
		super(matricula);
		this.pesoMaximo = pesoMaximo;
		this.pesoMinimo = pesoMinimo;
	}
	
	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		if (pesoMaximo > 0) {
			this.pesoMaximo = pesoMaximo;
		}
	}

	public double getPesoMinimo() {
		return pesoMinimo;
	}

	public void setPesoMinimo(double pesoMinimo) {
		if (pesoMinimo > 0) {
			this.pesoMinimo = pesoMinimo;
		}
	}
}
