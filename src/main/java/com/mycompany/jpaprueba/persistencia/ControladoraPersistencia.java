
package com.mycompany.jpaprueba.persistencia;

//controladora para controlar las istancias de cada jpaController

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Materia;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ControladoraPersistencia {
    //instancio un JPAController de Alumno para controlar
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    //instancio un CarreraJpaController
    CarreraJpaController carreJpa = new CarreraJpaController();
    //instancio un MateriaJpaController
    MateriaJpaController mateJpa = new MateriaJpaController();
    
    //metodo crear que recibe un alumno de controladoralogica y debe pasarlo a la JPAcontroller especifica de alumno

    public void crearAlumno(Alumno alu) {
       aluJpa.create(alu); 
    }
    
    //metodo para eliminar un alumno recibiendo un id

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
}

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
            }

    public ArrayList<Alumno> traerListaAlumnos() {
        //findAlumnoEntities me devuelve una lista (lo veo en el metodo en el JPA controller), 
        //entonces lo guardo en una lista que luego convierto a arrayList
        List <Alumno> listita = aluJpa.findAlumnoEntities();
        ArrayList <Alumno> listaAlumnos = new ArrayList<Alumno> (listita); 
        return listaAlumnos;
    }
    
    //metodos de Carrera
    public void crearCarrera(Carrera carre) {
        carreJpa.create(carre);
       
    }

    public void eliminarCarrera(int id) {
        try { 
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);  
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> lista = carreJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList(lista);
       return listaCarreras;
    }

    public void crearMateria(Materia mate) {
        mateJpa.create(mate); 
    }

    public void eliminarMateria(int id) {
        try {
            mateJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void editarMateria(Materia mate) {
        try {
            mateJpa.edit(mate);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return mateJpa.findMateria(id);
    }

    public LinkedList<Materia> traerListaMaterias() {
        List<Materia> lista = mateJpa.findMateriaEntities();
        LinkedList<Materia> listaMaterias =new LinkedList(lista); 
        return listaMaterias;
    }
}
