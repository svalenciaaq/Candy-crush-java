/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkgfinal;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;
import javax.swing.JFrame;
/**
 *
 * @Santiago valencia arango
 */
public class Mantrix {

    
       public ArrayList<Usuario>ListaUsuarios=new ArrayList<Usuario>();
       private  ArrayList<Nivel>Niveles=new ArrayList<Nivel>();
 
      
        public  void getLista(){
        
            for(int i=0;i<ListaUsuarios.size();i++){
                System.out.println(ListaUsuarios.get(i).getEdad());
          }
       }
      
    //Este metodo crea un usuario  si este no existes y lo agrega al arraylist
        public  void crearUsuario(Usuario c){
            
           if(existeUsuario(c)){
               System.out.println("EL usuario ingresado ya existe");
           } else{
           
            boolean encontro=false;
            
                
                    ListaUsuarios.add(c);
                   
                    encontro=true;
                 
                
            
            
        
            if(encontro){
                System.out.println("Se Creo");
            }else{
                System.out.println("No se pudo crear");
            }
        }
        }
        
        //Este metodo comprueba si el usuario ingresado ya existe.
        public  boolean existeUsuario(Usuario c){
            for(int i=0;i<ListaUsuarios.size();i++){
                if(ListaUsuarios.get(i)!=null){
                   if(c.equals(ListaUsuarios.get(i))){
                       return true;
                   } 
                
                }
            }
             return false;
        }
        //Este metodo me Muestra la lista de usuarios.
        public  void listaUsuarios(Usuario c){
            for(int i=0;i<ListaUsuarios.size();i++){
                if(ListaUsuarios.get(i)!=null){
                    System.out.println(ListaUsuarios.get(i));
                
            }
            
        }
            
        }
        //Este metodo me da la posibilidad de eliminar usuarios del arraylist.
        public  void eliminarUsuario(Usuario c){
             
             boolean encontro=false;
            for(int i=0;i<ListaUsuarios.size();i++){
                if(ListaUsuarios.get(i)!=null){
                    if(ListaUsuarios.get(i).equals(c)){
                        ListaUsuarios.set(i, null);
                        encontro=true;
                        System.out.println("Se ha eliminado con exito");
                    }
                }
                if(!encontro){
                    System.out.println("No se ha eliminado");
                }
            }
        }
        public  void escribirUsuarios(Usuario c){
        try{
            File usuario=new File("Usuarios.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(usuario.exists()){
                 fw=new FileWriter(usuario,true);
                bw=new BufferedWriter(fw);
                bw.newLine();
                bw.write(c.nombre);
                
            }else{
                fw=new FileWriter(usuario);
                 bw=new BufferedWriter(fw);
                bw.newLine();
                bw.write(c.nombre+"-"+c.genero+"-"+c.edad+"-"+
                        c.puntuacionMaxima+"-"+c.nivel);
            }
            bw.close();
            fw.close();
        }catch(Exception e){
        }
        }
        
        public void leer(){
            try {
                File pa=new File("Usuario.txt");
                        if(pa.exists()){
                            FileReader po=new FileReader(pa);
                            BufferedReader pi=new BufferedReader(po); 
                        }else{
                            System.out.println("El archivo no existe");
                        }
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
                
          }

          
        
        
    
    

        
        
        
            
        

   
        
    
    

    

