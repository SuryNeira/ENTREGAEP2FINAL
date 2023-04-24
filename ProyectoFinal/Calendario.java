/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.util.ArrayList;
/**
 *
 * @author suris
 */
public class Calendario { 
    
    private int idCalendario;
    private ArrayList<Dia> diasCalendario;
    private int anyoCalendario;
    
    public Calendario(){
        
    }

    public Calendario(int idCalendario, ArrayList<Dia> diasCalendario, int anyoCalendario) {
        this.idCalendario = idCalendario;
        this.diasCalendario = diasCalendario;
        this.anyoCalendario = anyoCalendario;
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
    
    public void LeerDatos(){
        
    }
    public void MostrarDatos(){
        
    }
    public void CrearCalendario(){
        
    }
    
    public void EliminarCalendario(){
        
    }

}
