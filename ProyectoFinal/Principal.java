/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//integrantes: Benjamín Vasquez, Jatsury Neira
//integrantes: Benjamín Vasquez, Jatsury Neira
/**
 *
 * @author suris
 */
public class Principal {
    
    public static Tarea tarea;
    public static Usuario usuario;
    public static ListaDeTareasPorHacer listaTareas;
    public static Feed feed;
    public static Publicacion publicacion;
    
    public static void InsertarDatosArchivos () throws FileNotFoundException {
        
        String file = "src/test/java/estudiantes.txt";
        int i=0;
        
        try{
         
         File archivo=new File(file);
         System.out.println(archivo.getAbsolutePath());
         Scanner scanner = new Scanner(archivo);
         
         while (scanner.hasNext()) {
                  String []datos=scanner.next().split(";");
                  System.out.print("Linea "+i + " Titulo:"+datos[0]);
                  System.out.print(" Numero:"+datos[1]);
                  System.out.print(" Descripcion:"+datos[2]);
                  System.out.print(" HoraCreacionTarea:"+datos[3]);
                  System.out.println(" PrioridadTarea:"+datos[4]);
                  System.out.println(" EstadoTarea:"+datos[4]);
                  i++;
         }
          scanner.close();
     }catch (FileNotFoundException e) {
        e.printStackTrace();
    }
      
    }
    
        public static void main(String args[]) throws FileNotFoundException {
       
        
        InsertarDatosArchivos();
         
         int tamanyo=5;
         
         Tarea[] tareas=new Tarea[tamanyo];
         
         for(int i=0; i<tareas.length; i++){
             tareas[i]=new Tarea();
             tareas[i].setTitulo("Estudiar Fisica");
             tareas[i].setDescripcion("Estudiar 2 horas");
             tareas[i].setEstadoTarea("incompleta");
             tareas[i].setHoraCreacionTarea(13.05);
             tareas[i].setNumero(1);
             tareas[i].setPrioridadTarea("alta");
             
         }
         
         System.out.println("Tarea: "+tareas[0].getTitulo());
         
         Dia[] dias=new Dia[tamanyo];
         
         for(int i=0; i<dias.length; i++){
             dias[i]=new Dia();
             dias[i].setCalificacionDia(5);
             dias[i].setConsejoDeProductividad("Organiza una tarea grande en pequeñas tareas");
             dias[i].setNombreDia("Miercoles");
             dias[i].setFechaDia("25/03 /08");
             
         }
 
    
}

}