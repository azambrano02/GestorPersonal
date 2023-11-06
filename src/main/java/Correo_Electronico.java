public class Correo_Electronico {
	private String direccionCorreo;
	private String proveedor;

	public Correo_Electronico(String direccionCorreo, String proveedor) {
		this.direccionCorreo = direccionCorreo;
		this.proveedor = proveedor;
	}
	public String getDireccionCorreo() {
		return this.direccionCorreo;
	}

	public void setDireccionCorreo(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}

	public String getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

}