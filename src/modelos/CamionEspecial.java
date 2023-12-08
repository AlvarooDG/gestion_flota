package modelos;

public class CamionEspecial extends Camion {
	private String fechaUltimaRevision;
	
	public CamionEspecial(String matricula, Chofer chofer, String fechaUltimaRevision) {
		super(matricula, chofer);
		this.fechaUltimaRevision = fechaUltimaRevision;
	}
	
	public CamionEspecial(String matricula, String fechaUltimaRevision) {
		super(matricula);
		this.fechaUltimaRevision = fechaUltimaRevision;
	}

	public String getFechaUltimaRevision() {
		return fechaUltimaRevision;
	}

	public void setFechaUltimaRevision(String fechaUltimaRevision) {
		this.fechaUltimaRevision = fechaUltimaRevision;
	}
}
