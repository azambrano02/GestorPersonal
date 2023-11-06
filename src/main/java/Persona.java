import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String rut;
	private String nombre;
	private String apellido;
	private List<Correo_Electronico> correosElectronicos;
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
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correosElectronicos = correosElectronicos;
	}
}