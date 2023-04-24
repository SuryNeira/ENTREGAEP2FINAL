/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author suris
 */
public class Calendario { 
    
    private int idCalendario;
    private ArrayList<Dia> diasCalendario;
    private int anyoCalendario;

    public Calendario(int idCalendario, ArrayList<Dia> diasCalendario, int anyoCalendario) {
        this.idCalendario = idCalendario;
        this.diasCalendario = diasCalendario;
        this.anyoCalendario = anyoCalendario;
    }

    Calendario() {
        
    }
   
    
    public ArrayList<Dia> getDiasCalendario() {
        return diasCalendario;
    }

    public void setDiasCalendario(ArrayList<Dia> diasCalendario) {
        this.diasCalendario = diasCalendario;
    }
    
    public int getAnyoCalendario() {
        return anyoCalendario;
    }

    public void setAnyoCalendario(int anyoCalendario) {
        this.anyoCalendario = anyoCalendario;
    }
    
    public int getIdCalendario() {
        return idCalendario;
    }
    public void setIdCalendario(int idCalendario) {
        this.idCalendario = idCalendario;
    }
    
    //comportamientos
    
    public boolean buscarDia(ArrayList<Dia> dias, Dia dia){
        for (Dia dia1 : dias) {
            if(dias.equals(dia)) {
                return true;
            }
        }
        return false;
         
    }
    
    public void agregarDia(Dia nuevoDia){
        diasCalendario.add(nuevoDia);   
    }
    public void modifCalendario(int anyoNuevo){
        anyoCalendario = anyoNuevo;
    }
    public void eliminarDia(Dia diaEliminar){
        diasCalendario.remove(diaEliminar);
    }
    public void mostrarCalendario(){
        System.out.println("año: "+ anyoCalendario + "\n");
        for(var elemento: diasCalendario){
            System.out.println("Fecha: "+ elemento.getFechaDia());
            System.out.println("\t Nombre del dia: "+ elemento.getNombreDia());
            System.out.println("\t Consejo: "+ elemento.getConsejoDeProductividad());
            System.out.println("\t calificacion:"+ elemento.getCalificacionDia());
        }
    }
}
