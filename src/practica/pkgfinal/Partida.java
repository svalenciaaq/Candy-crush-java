/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkgfinal;

/**
 *
 * @author usuario
 */
public class Partida {
   private static int puntajeActual=0; 
    private  static int movimientos=30;
    private static int nivel;

    /**
     *
     * @return
     */
    public static int getPuntajeActual() {
        return puntajeActual;
    }

    public static void setPuntajeActual(int puntajeActual) {
        Partida.puntajeActual = puntajeActual;
    }

    public static int getMovimientos() {
        return movimientos;
    }

    public static void setMovimientos(int movimientos) {
        Partida.movimientos = movimientos;
    }

    public static int getNivel() {
        return nivel;
    }

    public static void setNivel(int nivel) {
        Partida.nivel = nivel;
    }
    
    //Este metodo me determina cuando se gana una partida,Cuando se pierde una vida y cuando se pierde una partida.
    public static void ganarPartida(){
        
       
         if(puntajeActual>200&&movimientos==0){
             System.out.println("Avanza de nivel");
             
         }else{
             System.out.println("Pierdes una vida");
         }
      
         if(nivel==10&&puntajeActual>200){
             System.out.println("Ganaste la partida");
             
         }else{
             System.out.println("Has perdido comienza de nuevo");
         }
     }
}
