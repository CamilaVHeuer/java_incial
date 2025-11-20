
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.LinkedList;


public class ControladoraLogica {
    //voy a tener todos los metodos que voy a necesitar para despues llamar a la persitencia e interactue con la BD
    
    //Voy a conectar mi ControladoraLogica con ControladoraPersistencia, como? a través de ua instancia
    //con la instancia voy a poder acceder a todos los métodos que tiene la controladora de persistencia.
    ControladoraPersistencia controlPersis = new ControladoraPersistencia(); 
    
    //creo un metodo create para que a apartir de los datos que se cargue o alumno que se cree, darlo de alta y pasarlo a la persistencia
    
    //aca creo un metodo que recibe un alumno hecho ya (desde main o IGU) y lo manda a la persistencia para darlo de ALTA
    //otra forma podria ser que reciba los datos del alumno y cree el alumno 
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
        
    }
    
    //metodo para eliminar un alumno que va a recibir un id como parametro
    public void eliminarAlumno(int id){
    controlPersis.eliminarAlumno(id);}
    
    //metodo para editar, basado en el metodo edit del JPA (que recibe un objeto alumno completo)
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
     
    }
    
     //metodo (funcion) para encontrar un alumno pasandole el id
    public Alumno traerAlumno(int id){
        return controlPersis.traerAlumno(id);}
    
    //metodo para traer todos los alumnos
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
    
    
    //----------Carreras-----------------------
    
    public void creaCarrera(Carrera carre){
        controlPersis.crearCarrera(carre);
      
    }
    
    //metodo para eliminar una carrera que va a recibir un id como parametro
    public void eliminarCarrera(int id){
    controlPersis.eliminarCarrera(id);}
    
    //metodo para editar, basado en el metodo edit del JPA (que recibe un objeto alumno completo)
    public void editarCarrera(Carrera carre){
        controlPersis.editarCarrera(carre);
     
    }
    
     //metodo (funcion) para encontrar una carrera pasandole el id
    public Carrera traerCarrera(int id){
        return controlPersis.traerCarrera(id);}
    
    //metodo para traer todas las carreras
    public ArrayList<Carrera> traerListaCarreras(){
        return controlPersis.traerListaCarreras();
    }
    
    
    //-------------Materias---------------
     public void crearMateria(Materia mate){
        controlPersis.crearMateria(mate);
      
    }
    
    public void eliminarMateria(int id){
    controlPersis.eliminarMateria(id);}
    
    //metodo para editar, basado en el metodo edit del JPA (que recibe un objeto alumno completo)
    public void editarMateria(Materia mate){
        controlPersis.editarMateria(mate);
    }
    
    public Materia traerMateria(int id){
        return controlPersis.traerMateria(id);}
    
    //metodo para traer todas las carreras
    public LinkedList<Materia> traerListaMaterias(){
        return controlPersis.traerListaMaterias();
    }
}
