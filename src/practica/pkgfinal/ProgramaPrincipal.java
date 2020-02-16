/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkgfinal;


import java.util.Scanner;


/**
 *
 * @author Santiago
 */
public class ProgramaPrincipal {
    

    public static void main(String[]args){
      Scanner papu = new Scanner(System.in);
       papu.useDelimiter("\n");
      boolean are=false;
       Mantrix pao=new Mantrix();
      
          int opcion;
         String nombre;
          String genero;
          int edad = 0;
          int puntuacionMaxima = 0;
          int nivel = 0;
          Usuario c = null ;
       
       while(!are) {
            System.out.println("1. Añadir usuario");
            System.out.println("2.Empezar partida");
            System.out.println("3.Mostrar lista de usuarios");
            System.out.println("4.Eliminar Usuario");
            System.out.println("5.Retomar partida");
            try{
                System.out.println("Escribe una de las opciones");
                opcion = papu.nextInt();

                switch (opcion) {
                    case 1:

                        //Pido valores
                        System.out.println("Escribe tu nombre");
                        nombre = papu.next();

                        System.out.println("Escribe tu genero");
                       
                        genero = papu.next();
                        
                        System.out.println("Escribe tu edad");
                        edad=papu.nextInt();
                        

                //Creo el Usuario
                c = new Usuario(nombre, genero,edad);

                        pao.crearUsuario(c);
                        pao.escribirUsuarios(c);

                        break;
                    case 2:
                     
                        Tablero mamu=new Tablero();
                        
                        
                        
                        
                        

                        break;
                    case 3:

                      pao.listaUsuarios(c);

                        break;
                    case 4:
                       //pido el nombre
                        System.out.println("Escribe un nombre");
                        nombre = papu.next();
                        System.out.println("Escribe tu genero");
                        genero=papu.next();
                        System.out.println("Escribe tu edad");

                        //Creo el contacto auxiliar
                        c = new Usuario(nombre,genero,edad);

                       pao.eliminarUsuario(c);

                        break;
                    case 5:

                        
                        break;
                        
                }
                        } catch (Exception e) {
                System.out.println("Ingresa una opcion");
                papu.nextInt();
                    
            
                        }
          }
    }
}



