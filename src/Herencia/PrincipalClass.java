/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.ArrayList;

/**
 *
 * @author FASARLJP
 */
public class PrincipalClass {

    ArrayList<Persona> listaPersonas = new ArrayList();
      
    /*
    **Agrega un objeto de tipo Alumno al arreglo listaPersonas
    */
    public void agregarAlumno(
            String nombre, int edad, String matricula, float beca, String carrera){
       listaPersonas.add(new Alumno(nombre, edad,matricula,beca,carrera));
    }
    
    /*
    **Agrega un objeto de tipo Maestro al arreglo listaPersonas
    */
    public void agregarMaestro(
            String id,  String nombre, int edad,float salario, String categoria){
        Maestro maestro = new Maestro(id,nombre,edad,salario,categoria);
        listaPersonas.add(maestro);
    }
    
    /*
    **Metodo que retorna todos los objetos almacenados en el arreglo listaPersonas
    */
    public ArrayList<Persona> obtenerPersonas(){
        return listaPersonas;
    }
    
    /*
    **Metodo que recibe el id seleccionado de la tabla para eliminarlo
    */
    public void eliminar(int id){
        listaPersonas.remove(id);
    }
    
    /**
     * Metodo que actualiza los datos del alumno seleccionado
     * @param id del arreglo que se quiere actualizar
     * @param nombre
     * @param edad
     * @param matricula
     * @param beca
     * @param carrera 
     */
    public void modificarAlumno(
            int id,String nombre, int edad, String matricula, float beca, String carrera){
        listaPersonas.set(id, new Alumno(nombre, edad,matricula,beca,carrera));
    }
    
    /**
     * Metodo que actualiza los datos del Maestro seleccionado
     * @param id del arreglo que se quiere actualizar
     * @param idd del maestro
     * @param nombre
     * @param edad
     * @param salario
     * @param categoria 
     */
    public void modificarMaestro(
            int id,String idd,  String nombre, int edad,float salario, String categoria){
        listaPersonas.set(id, new Maestro(idd,nombre,edad,salario,categoria));
    }
    
    /**
     * 
     * @return retorna el total de registros que hay en el arreglo
     */
    public int size(){
        return listaPersonas.size();
    }
}
