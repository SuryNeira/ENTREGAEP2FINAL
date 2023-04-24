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
public class Feed { 
  
    private ArrayList<Publicacion> publicacionesFeed;    //donde estarán las publicaciones de todos los usuarios
    
    public Feed(){
        
    }

    public Feed(ArrayList<Publicacion> publicacionesFeed) {
        this.publicacionesFeed = publicacionesFeed;
    }
    
    
    public ArrayList<Publicacion> getPublicacionesFeed() {
        return publicacionesFeed;
    }

    public void setPublicacionesFeed(ArrayList<Publicacion> publicacionesFeed) {
        this.publicacionesFeed = publicacionesFeed;
    }
 
    //comportamientos
    
    public void AgregarPublicacion(){
        
    }
    
    
}
