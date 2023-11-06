public class Automovil {
	private String marca;
	private String modelo;
	private int aoDeFabricacion;
	private double precio;
	private Motor motor;
	private Chasis chasis;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getA�oDeFabricacion() {
		return this.a�oDeFabricacion;
	}

	public void setA�oDeFabricacion(int a�oDeFabricacion) {
		this.a�oDeFabricacion = a�oDeFabricacion;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Automovil(String marca, String modelo, int a�oDeFabricacion, double precio) {
		throw new UnsupportedOperationException();
	}
}