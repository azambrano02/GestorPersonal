import java.util.ArrayList;

public class Persona {
	private String rut;
	private String nombre;
	private String apellido;
	private ArrayList<Correo_Electronico> correosElectronicos = new ArrayList<Correo_Electronico>();
	private ArrayList<Automovil> automoviles = new ArrayList<Automovil>();

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Persona(String rut, String nombre, String apellido) {
		throw new UnsupportedOperationException();
	}
}