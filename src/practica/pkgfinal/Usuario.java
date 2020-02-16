/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkgfinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author usuario
 */
public class Usuario {
     
    String nombre;
    String genero;
    int edad;
    int puntuacionMaxima;
    int nivel;
    
    public Usuario(String nombre,String genero,int edad){
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;
        this.puntuacionMaxima=0;
        this.nivel=0;
    }
    
    public Usuario(String nombre){
        this.nombre=nombre;
    }

   


    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getGenero(){
        return genero;
        
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public int getPuntuacionMaxima(){
        return puntuacionMaxima;
    }
    
    public void setPuntuacionMaxima(int puntuacionMaxima){
        this.puntuacionMaxima=puntuacionMaxima;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public void setNivel(int nivel){
        this.nivel=nivel;
    }
    
    public boolean equals(Usuario c){
        if(this.nombre.equalsIgnoreCase(c.getNombre())){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "nombre: "+nombre+" "+" genero: "+genero+" "+" Edad: "+edad+" "+" PuntuacionMaxima: "+puntuacionMaxima+
                " "+" Nivel: "+nivel;
    }
    
} 
