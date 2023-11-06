public class Automovil {
	private String marca;
	private String modelo;
	private int añoDeFabricacion;
	private double precio;
	private Motor motor;
	private Chasis chasis;

	public void setAñoDeFabricacion(int añoDeFabricacion) {
		this.añoDeFabricacion = añoDeFabricacion;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}

	public String getModelo() {
		return this.modelo;
	}
	public String getMarca() {
		return this.marca;
	}
	public int getAñoDeFabricacion() {
		return this.añoDeFabricacion;
	}
	public double getPrecio() {
		return this.precio;
	}
	public Motor getMotor() {
		return motor;
	}
	public Chasis getChasis(){
		return chasis;
	}

	public Automovil(String marca, String modelo, int añoDeFabricacion, double precio, Motor motor, Chasis chasis) {
		this.marca = marca;
		this.modelo = modelo;
		this.añoDeFabricacion = añoDeFabricacion;
		this.precio = precio;
		this.motor = motor;
		this.chasis = chasis;
	}
}