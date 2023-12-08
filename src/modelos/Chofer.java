package modelos;

public class Chofer {
	private String nombreChofer;
	private String direccionChofer;
	private String dniChofer;
	public Chofer(String nombreChofer, String direccionChofer, String dniChofer) {
		this.nombreChofer = nombreChofer;
		this.direccionChofer = direccionChofer;
		this.dniChofer = dniChofer;
	}
	public String getNombreChofer() {
		return nombreChofer;
	}
	public void setNombreChofer(String nombreChofer) {
		this.nombreChofer = nombreChofer;
	}
	public String getDireccionChofer() {
		return direccionChofer;
	}
	public void setDireccionChofer(String direccionChofer) {
		this.direccionChofer = direccionChofer;
	}
	public String getDniChofer() {
		return dniChofer;
	}
	public void setDniChofer(String dniChofer) {
		this.dniChofer = dniChofer;
	}
}
