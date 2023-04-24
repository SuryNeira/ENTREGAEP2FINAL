/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.util.Date;
/**
 *
 * @author suris
 */
public class Dia {
    
    private String NombreDia;
    private Date FechaDia;
    private int CalificacionDia; //valor de 1 a 5
    private String ConsejoDeProductividad;
    
    
    public Dia(String NombreDia, Date FechaDia, int CalificacionDia, String ConsejoDeProductividad) {
        this.NombreDia = NombreDia;
        this.FechaDia = FechaDia;
        this.CalificacionDia = CalificacionDia;
        this.ConsejoDeProductividad = ConsejoDeProductividad;
    }

    public Dia() {
    }
    
    
    public String getConsejoDeProductividad() {
        return ConsejoDeProductividad;
    }

    public void setConsejoDeProductividad(String ConsejoDeProductividad) {
        this.ConsejoDeProductividad = ConsejoDeProductividad;
    }
    
    public Date getFechaDia() {
        return FechaDia;
    }

    public void setFechaDia(Date FechaDia) {
        this.FechaDia = FechaDia;
    }
   
    
    public String getNombreDia() {
        return NombreDia;
    }

    public void setNombreDia(String NombreDia) {
        this.NombreDia = NombreDia;
    }


    public int getCalificacionDia() {
        return CalificacionDia;
    }

    public void setCalificacionDia(int CalificacionDia) {
        this.CalificacionDia = CalificacionDia;
    }
    
    //comportamientos
    public void ModificarDia(){
        
    }

    void setFechaDia(String _08) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
