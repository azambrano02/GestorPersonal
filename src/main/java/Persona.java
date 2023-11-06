import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String rut;
	private String nombre;
	private String apellido;
	private List<Correo_Electronico> correosElectronicos;
	private List<Automovil> automoviles;
	public Persona(String rut, String nombre, String apellido) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correosElectronicos = new ArrayList<>();
		this.automoviles = new ArrayList<>();
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setCorreosElectronicos(List<Correo_Electronico> correosElectronicos){
		this.correosElectronicos = correosElectronicos;
	}
	public void setAutomoviles(List<Automovil> automoviles){
		this.automoviles = automoviles;
	}

	public String getApellido() {
		return this.apellido;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getRut() {
		return this.rut;
	}
	public List<Correo_Electronico getCorreosElectronicos(){
		return this.correosElectronicos;
	}
	public List<Automovil> getAutomoviles(){
		return this.automoviles;
	}


}