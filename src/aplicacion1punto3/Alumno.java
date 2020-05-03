
package aplicacion1punto3;

public class Alumno {
    
    private String nombre;
    private String modalidad;

    public Alumno(String nombre, String modalidad) {
        this.nombre = nombre;
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    
}
