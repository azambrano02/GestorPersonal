public class Motor {
	private int numeroDeMotor;
	private double cmCubicos;

	public int getNumeroDeMotor() {
		return this.numeroDeMotor;
	}

	public void setNumeroDeMotor(int numeroDeMotor) {
		this.numeroDeMotor = numeroDeMotor;
	}

	public double getCmCubicos() {
		return this.cmCubicos;
	}

	public void setCmCubicos(double cmCubicos) {
		this.cmCubicos = cmCubicos;
	}

	public Motor(int numeroDeMotor, double cmCubicos) {
		throw new UnsupportedOperationException();
	}
}