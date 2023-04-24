/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author suris
 */
public class Usuario {
    
    
    private String Nombre;
    private int idUsuario;
    private String Alias;
    private String DescripcionPerfil;
    private Date fechaCreacionDeLaCuenta;
    private ArrayList<Calendario> calendarios;
    private ArrayList<Publicacion> publicacionesUsuario;
    private ListaDeTareasPorHacer tareasUsuario;
    private String ClaveUsuario;
    
    
    public Usuario(String Nombre, int idUsuario, String Alias, String DescripcionPerfil, Date fechaCreacionDeLaCuenta, ArrayList<Calendario> calendarios, ArrayList<Publicacion> publicacionesUsuario, ListaDeTareasPorHacer tareasUsuario) {
        this.Nombre = Nombre;
        this.idUsuario = idUsuario;
        this.Alias = Alias;
        this.DescripcionPerfil = DescripcionPerfil;
        this.fechaCreacionDeLaCuenta = fechaCreacionDeLaCuenta;
        this.calendarios = calendarios;
        this.publicacionesUsuario = publicacionesUsuario;
        this.tareasUsuario = tareasUsuario;
    }

    Usuario() {
        
    }


    public ListaDeTareasPorHacer getTareasUsuario() {
        return tareasUsuario;
    }

    public void setTareasUsuario(ListaDeTareasPorHacer tareasUsuario) {
        this.tareasUsuario = tareasUsuario;
    }
    
    
    public ArrayList<Calendario> getCalendarios() {
        return calendarios;
    }

    public void setCalendarios(ArrayList<Calendario> calendarios) {
        this.calendarios = calendarios;
    }

    public ArrayList<Publicacion> getPublicacionesUsuario() {
        return publicacionesUsuario;
    }

    public void setPublicacionesUsuario(ArrayList<Publicacion> publicacionesUsuario) {
        this.publicacionesUsuario = publicacionesUsuario;
    }
 
    
    public Date getFechaCreacionDeLaCuenta() {
        return fechaCreacionDeLaCuenta;
    }

    public void setFechaCreacionDeLaCuenta(Date fechaCreacionDeLaCuenta) {
        this.fechaCreacionDeLaCuenta = fechaCreacionDeLaCuenta;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getAlias() {
        return Alias;
    }

    public String getDescripcionPerfil() {
        return DescripcionPerfil;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public void setDescripcionPerfil(String DescripcionPerfil) {
        this.DescripcionPerfil = DescripcionPerfil;
    }

    public String getClaveUsuario() {
        return ClaveUsuario;
    }

    public void setClaveUsuario(String ClaveUsuario) {
        this.ClaveUsuario = ClaveUsuario;
    }
    
    

    //comportamientos
    
    public void CrearUsuario(){
        
    }
    
    public void LeerUsuario(){
        
    }
    
    public void ActualizarUsuario(){
        
    }
    public void EliminarUsuario(){
        
    }

    void setFechaCreacionDeLaCuenta(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
