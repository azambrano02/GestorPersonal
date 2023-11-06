public class Correo_Electronico {
	private String direccionCorreo;
	private String proveedor;

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public void setDireccionCorreo(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}

	public String getDireccionCorreo() {
		return this.direccionCorreo;
	}
	public String getProveedor() {
		return this.proveedor;
	}

	public Correo_Electronico(String direccionCorreo, String proveedor) {
		this.direccionCorreo = direccionCorreo;
		this.proveedor = proveedor;
	}
}