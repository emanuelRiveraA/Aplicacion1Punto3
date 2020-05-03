
package aplicacion1punto3;

public class Maestro {
    
    private String nombre;
    private String materia;
    private String modalidad;

    public Maestro(String nombre, String materia, String modalidad) {
        this.nombre = nombre;
        this.materia = materia;
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    
}
