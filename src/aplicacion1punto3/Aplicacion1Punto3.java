
package aplicacion1punto3;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion1Punto3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        //Declaración de variables para leer los datos
        String nombre_grupo;
        String Nombre_maestro;
        String materia;
        String modalidad;
        String nombre_alumno;
        String modalidad_alumno;
        //Variable auxiliar que contendrá la referencia a cada grupo nuevo.
        int i, N;
        //se pide por teclado el número de Grupos a leer
        do {
            System.out.print("Número de grupos? ");
            N = teclado.nextInt();
        } while (N < 0);
        teclado.nextLine(); //limpiar
        //lectura de N grupos
        for (i = 1; i <= N; i++) {
            //leer datos de cada grupo
            System.out.println("Grupo: ");
            nombre_grupo = teclado.nextLine();
                       
            System.out.print("Nombre maestro: ");
            Nombre_maestro = teclado.nextLine();          
            System.out.print("Materia: ");
            materia = teclado.nextLine();
            System.out.print("Modalidad: ");
            modalidad = teclado.nextLine();  
            
            System.out.print("Ingrese alumno y modalidad: ");
            nombre_alumno = teclado.nextLine();   
            modalidad_alumno = teclado.nextLine();   
            Alumno alumno = new Alumno(nombre_alumno, modalidad_alumno);//se instancia la clase alumnos para agregarla al objeto "Grupo"

            Grupo grupo = new Grupo(nombre_grupo, Nombre_maestro, materia, modalidad, alumno);//aqui se aplica la composición y la agregacion cuando se inserta "alumnos" 
                      
        }
    }
    
}
