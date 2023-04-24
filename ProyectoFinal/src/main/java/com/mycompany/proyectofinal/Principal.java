/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


//integrantes: Benjamín Vasquez, Jatsury Neira
//integrantes: Benjamín Vasquez, Jatsury Neira
/**
 *
 * @author suris
 */
public class Principal {
    
    public static Usuario usuario;
    public static Feed feed;
    
    public static void InsertarDatosArchivos () throws FileNotFoundException {
        
        String file = "src/test/java/estudiantes.csv";
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
         
    
             Dia dia=new Dia();
             dia.setCalificacionDia(5);
             dia.setConsejoDeProductividad("Organiza una tarea grande en pequeñas tareas");
             dia.setNombreDia("Miercoles");
             dia.setFechaDia("25/03/23");
             
         
          System.out.println("Dia: "+dia.getNombreDia());
   
          Publicacion[] publicaciones=new Publicacion[tamanyo];
          for(int i=0; i<publicaciones.length; i++){
              
              publicaciones[i]=new Publicacion();
              publicaciones[i].setFechaPublicacion("24/09/23");
              publicaciones[i].setIdUsuarioPublicacion(456);
              publicaciones[i].setPrivacidadPublicacion("Publico");
              publicaciones[i].setSumaInteraccionPositiva(1);
              publicaciones[i].setSumaInteraccionNegativa(0);
              
          }
          
          ListaDeTareasPorHacer listaTareas=new ListaDeTareasPorHacer();
          listaTareas.setIdLista(425);
          
          Usuario[] usuarios=new Usuario[tamanyo];
          for(int i=0; i<usuarios.length;i++){
              usuarios[i]=new Usuario();
              usuarios[i].setAlias("Pepe");
              usuarios[i].setDescripcionPerfil("Persona feliz");
              usuarios[i].setFechaCreacionDeLaCuenta("24/08/23");
              usuarios[i].setIdUsuario(345);
              usuarios[i].setNombre("Pedro");
          }
          
          
          Calendario calendario = new Calendario();
          calendario.setAnyoCalendario(2023);
          calendario.setIdCalendario(1);
          Scanner leer = new Scanner(System.in);
          //menu
          int opc = 0;
          do{
              System.out.println("opcion 1 para agregar dia al calendario");
              System.out.println("opcion 2 para modificar año del calendario");
              System.out.println("opcion 3 para eliminar dia del calendario");
              System.out.println("opcion 4 para mostrar calendario");
              switch (opc){
                    case 1: 
                        if(calendario.buscarDia(calendario.getDiasCalendario(), dia) == false){
                            calendario.agregarDia(dia);
                            System.out.println("El dia ha sido agregado");
                        }
                            
                        break;
                    case 2: 
                        int anyoNuevo;
                        
                        System.out.println("ingresa el año del calendario");      //anyo
                        anyoNuevo = leer.nextInt();
                        calendario.modifCalendario(anyoNuevo);
                        System.out.println("El calendario ha sido actualizado");
                        break;
                    case 3:
                        if(calendario.buscarDia(calendario.getDiasCalendario(), dia) == true)
                            calendario.eliminarDia(dia);
                            System.out.println("Se ha eliminado un dia");
                        break;
                    case 4:
                        System.out.println("Mostrando calendario: ");
                        calendario.mostrarCalendario();
                        break;
                        
                    default:
                        System.out.println("Opcion no válida");
                        
                        break;
            }
       
          
          }while(opc!=0);
          
         
          
    
}

}