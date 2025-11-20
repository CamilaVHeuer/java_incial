

package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.ControladoraLogica;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.Date;
import java.util.LinkedList;



                                                                                
public class JpaPrueba {

    public static void main(String[] args) {
        //creo una instancia de ControladoraLogica para poder interactuar con ella
        ControladoraLogica control = new ControladoraLogica();
        
         //CREO LISTA DE MATERIAS VACIA
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
        
        //CREO UNA CARRERA CON LISTA DE MATERIAS
        Carrera  carre = new Carrera(9, "Ingeniería en Informática", listaMaterias);
        
         //guardado en la BD (la doy de alta): para eso llamo a la logica y uso el metodo crearCarrera
        control.creaCarrera(carre);
        
        // CREO MATERIAS
        Materia mate1 = new Materia(5, "Programación I", "Cuatrimestral", carre);
        Materia mate2 = new Materia(59, "Programación II", "Cuatrimestral", carre);
        Materia mate3 = new Materia(8, "Programación Avanzada", "Anual", carre);
        
        //GUARDO EN LA BD/LAS DOY DE ALTA
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //CREO LISTA DE MATERIAS Y LAS AGREGO A LA LISTA
     
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
       //Modifico carrera a nivel lógico 
        
        carre.setListaMaterias(listaMaterias);
        //modifico a nivel BD, o sea edito
        control.editarCarrera(carre);
        
              
        //CREO UN ALUMNO
        Alumno a1 = new Alumno(23, "Sabrina", "Romero", new Date(), carre); 
        
        //Guardo el alumno
        control.crearAlumno(a1);
       
       
    
        
       
      
        
      
     
      
      
      
    }
}
