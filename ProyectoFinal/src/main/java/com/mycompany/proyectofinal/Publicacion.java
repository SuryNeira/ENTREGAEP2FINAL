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
public class Publicacion {
    
    private String PrivacidadPublicacion; //publico o privado
    private int sumaInteraccionPositiva=0;
    private int sumaInteraccionNegativa=0;
    private int idUsuarioPublicacion;
    private Date FechaPublicacion;

    public Publicacion(String PrivacidadPublicacion, int idUsuarioPublicacion, Date FechaPublicacion) {
        this.PrivacidadPublicacion = PrivacidadPublicacion;
        this.idUsuarioPublicacion = idUsuarioPublicacion;
        this.FechaPublicacion = FechaPublicacion;
    }

    Publicacion() {
        
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public String getPrivacidadPublicacion() {
        return PrivacidadPublicacion;
    }

    public int getSumaInteraccionPositiva() {
        return sumaInteraccionPositiva;
    }

    public int getSumaInteraccionNegativa() {
        return sumaInteraccionNegativa;
    }

    public int getIdUsuarioPublicacion() {
        return idUsuarioPublicacion;
    }

    public void setPrivacidadPublicacion(String PrivacidadPublicacion) {
        this.PrivacidadPublicacion = PrivacidadPublicacion;
    }

    public void setSumaInteraccionPositiva(int sumaInteraccionPositiva) {
        this.sumaInteraccionPositiva = sumaInteraccionPositiva;
    }

    public void setSumaInteraccionNegativa(int sumaInteraccionNegativa) {
        this.sumaInteraccionNegativa = sumaInteraccionNegativa;
    }

    public void setIdUsuarioPublicacion(int idUsuarioPublicacion) {
        this.idUsuarioPublicacion = idUsuarioPublicacion;
    }
       public void setFechaPublicacion(Date FechaPublicacion) {
        this.FechaPublicacion = FechaPublicacion;
    }   
       
    public void LeerPublicacion(){
        
    }
       
    public void CrearPublicacion(){
        
    }
    
    public void EliminarPublicacion(){
        
    }
    
    public void ModificarPublicacion(){
        
    }

    void setFechaPublicacion(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
