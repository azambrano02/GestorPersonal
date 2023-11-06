public class Chasis {
	private int numeroDeChasis;
	private String material;

	public void setMaterial(String material) {
		this.material = material;
	}
	public void setNumeroDeChasis(int numeroDeChasis) {
		this.numeroDeChasis = numeroDeChasis;
	}

	public String getMaterial() {
		return this.material;
	}
	public int getNumeroDeChasis() {
		return this.numeroDeChasis;
	}
	public Chasis(int numeroDeChasis, String material) {
		this.numeroDeChasis = numeroDeChasis;
		this.material = material;
	}
}