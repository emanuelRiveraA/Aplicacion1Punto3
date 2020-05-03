
package aplicacion1punto3;

import java.util.ArrayList;

public class Grupo {
    
    private String grupo;
    private String modalidad;
    private Maestro maestro;
    private Alumno alumno;
    
    public Grupo(String grupo, String nombre, String materia, String modalidad, Alumno alumno) {//este metodo hace la compocision porque dentro del constructor hay contructor
        
        this.maestro = new Maestro(nombre, materia, modalidad); 
        this.alumno = alumno;
    }  
        
    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
        
    
}
