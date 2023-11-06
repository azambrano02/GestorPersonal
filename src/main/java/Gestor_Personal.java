import java.util.ArrayList;
import java.util.List;

public class Gestor_Personal {
    private List<Persona> personas;

    public Gestor_Personal(Persona persona) {
        this.personas = new ArrayList<>();
    }
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    public List<Persona> getPersonas() {
        return personas;
    }

    public boolean personaExiste(Persona persona) {
        for (Persona p : this.personas) {
            if (persona.getRut().equals(p.getRut())) {
                return true;
            }
        }
        return false;
    }
    public boolean correoExiste(Persona persona) {
        for (Persona p : this.personas) {
            if (persona.getCorreosElectronicos().equals(p.getCorreosElectronicos())) {
                return true;
            }
        }
        return false;
    }
    public void agregarPersona(Persona persona) {
        if (!personaExiste(persona)) {
            this.personas.add(persona);
        }
    }
    public Persona obtenerPersonaPorRut(String rut) {
        for (Persona persona : personas) {
            if (persona.getRut().equals(rut)) {
                return persona;
            }
        }
        return null;
    }
    public List<Persona> obtenerPersonasPorNombre(String nombre) {
        List<Persona> personasNombreIgual = new ArrayList<Persona>();
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre))
                personasNombreIgual.add(persona);
        }
        return personasNombreIgual;
    }
    public void agregarAutomovilPersona(String rut, Automovil automovil){
        Persona persona = obtenerPersonaPorRut(rut);
        if (persona != null){
            persona.agregarAutomovil(automovil);
        }
    }
    public void agregarCorreoElectronico(String rut, Correo_Electronico correoElectronico){
        Persona persona = obtenerPersonaPorRut(rut);
        if (persona != null && !correoExiste(persona) ){
            persona.agregarCorreoElectronico(correoElectronico);
        }
    }
    public List<Persona> obtenerPersonasPorMarcaAutomovil(String marca){
        List<Persona> personasConMismaMarcaAuto = new ArrayList<>();
        for(Persona persona : personas){
            if(persona.automovilMarca(marca)){
                personasConMismaMarcaAuto.add(persona);
            }
        } return personasConMismaMarcaAuto;
    }
}
