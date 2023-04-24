/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author suris
 */
public class Tarea {
    private String Titulo;
     private int Numero;
     private String Descripcion;
     private Double HoraCreacionTarea;
     private String PrioridadTarea;//alta, media o baja
     private String EstadoTarea; //si está incompleta, en proceso o finalizada
     
     
    public Tarea(String Titulo, int Numero, String Descripcion, Double HoraCreacionTarea, String PrioridadTarea, String EstadoTarea) {
        this.Titulo = Titulo;
        this.Numero = Numero;
        this.Descripcion = Descripcion;
        this.HoraCreacionTarea = HoraCreacionTarea;
        this.PrioridadTarea = PrioridadTarea;
        this.EstadoTarea = EstadoTarea;
    }

    Tarea() {
       
    }
      
     

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Double getHoraCreacionTarea() {
        return HoraCreacionTarea;
    }

    public void setHoraCreacionTarea(Double HoraCreacionTarea) {
        this.HoraCreacionTarea = HoraCreacionTarea;
    }

    public String getPrioridadTarea() {
        return PrioridadTarea;
    }

    public void setPrioridadTarea(String PrioridadTarea) {
        this.PrioridadTarea = PrioridadTarea;
    }

    public String getEstadoTarea() {
        return EstadoTarea;
    }

    public void setEstadoTarea(String EstadoTarea) {
        this.EstadoTarea = EstadoTarea;
    }
      
    
    //metodo para designar fecha y hora de la tarea
    
    public void CrearTarea(){
        
    }
    
    public void designarFechaYHoraTarea(){
        
    }
    
}
