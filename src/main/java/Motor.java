public class Motor {
	private int numeroDeMotor;
	private double cmCubicos;

	public void setCmCubicos(double cmCubicos) {
		this.cmCubicos = cmCubicos;
	}
	public void setNumeroDeMotor(int numeroDeMotor) {
		this.numeroDeMotor = numeroDeMotor;
	}

	public int getNumeroDeMotor() {
		return this.numeroDeMotor;
	}
	public double getCmCubicos() {
		return this.cmCubicos;
	}

	public Motor(int numeroDeMotor, double cmCubicos) {
		this.numeroDeMotor = numeroDeMotor;
		this.cmCubicos = cmCubicos;
	}
}