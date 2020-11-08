/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author FASARLJP
 */
import java.util.ArrayList;
public class EjemploHerenciaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Reutilizacion del codigo
      
        
       
        
        //Lista de Personas
        ArrayList<Persona>listaPersonas= new ArrayList();
        
        
       // listaPersonas.add(new Alumno("Flor",19,"1643533",3600,"Ingenieria en computacion"));
        listaPersonas.add(new Maestro("12345","Flor selene",34,1456,"Maestra"));
        listaPersonas.add(new Maestro("12345","Flor selene",34,1456,"Maestra"));
        listaPersonas.add(new Maestro("12345","Flor selene",34,1456,"Maestra"));        
        
        //Listar a las personas
        System.out.println("Nombre \t\t Edad  \t Otro");
        for(int indice =0; indice<listaPersonas.size(); indice++){

        if (listaPersonas.get(indice) instanceof Alumno)
            System.out.println("Alumno");
       else
           if (listaPersonas.get(indice)instanceof Maestro)
               System.out.println("Maestro");
       else
               System.out.println("Desconocido");

System.out.println(listaPersonas.get(indice).getNombre()+"\t\t"+((Maestro)listaPersonas.get(indice)).getCategoria()+listaPersonas.get(indice).getEdad());
        } 

    }
    }
    

