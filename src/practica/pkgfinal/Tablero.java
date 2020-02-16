/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkgfinal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class Tablero   implements MouseListener, MouseMotionListener {

int[]papu;

    JFrame Mamu;
    JLabel Papusongo[][];
    int tablero[][];
    Random pio;

    public Tablero() {
     
       
        
        
        Mamu = new JFrame("Mantrix");
        Mamu.setBounds(0, 0,500,700);
        Mamu.setLayout(null);
        Mamu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        Papusongo = new JLabel[10][5];
        tablero = new int[10][5];
        pio=new Random();
        
        
       

        for (int i = 0; i < Papusongo.length; i++) {
            for (int j = 0; j < Papusongo[i].length; j++) {
                Papusongo[i][j] = new JLabel();
                Papusongo[i][j].setBounds(0 + j * 50, 0 + i * 50, 300, 300);
                tablero[i][j]=pio.nextInt(3)+1;
                Papusongo[i][j].setIcon(new ImageIcon("imagenes/"+tablero[i][j]+".jpg"));   
                Papusongo[i][j].setVisible(true);
                Mamu.add(Papusongo[i][j]);
               
               

            }
            
        }
         for (int i = 0; i < Papusongo.length; i++) {
            for (int j = 0; j < Papusongo[i].length; j++) {
              Papusongo[i][j].addMouseListener(new MouseAdapter(){
                  
                  @Override
                  public void mouseClicked(MouseEvent poe){
                      for (int k = 0; k <Papusongo.length; k++) {
                          for (int l = 0; l <Papusongo[l].length; l++) {
                              if(Papusongo[k][l]==poe.getSource()){
                                  System.out.println("posiciones"+k+""+l);
                              }
                          }
                      }
   
                  
                  }});
            }
         }
        
        Mamu.setVisible(true);
    }

    //Este metodo me permite rellenar el tablero aleatoriamente.
    public void rellenarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int m = 0; m < tablero[i].length; m++) {
                if (tablero[i][m] == tablero[0][0]) {
                    tablero[i][m] = papu[(int) (Math.random() * 1)];
                } else if (tablero[i][m] != tablero[0][0] && lado(i, m) == true) {
                    tablero[i][m] = papu[(int) (Math.random() * 1)];
                } else if (tablero[i][m] == tablero[i][m - 1]) {
                    tablero[i][m] = papu[(int) (Math.random() * 1)];
                } else {
                    tablero[i][m] = papu[(int) (Math.random() * 1)];
                }

            }

        }
        

    }

    public static boolean lado(int i, int m) {
        return i == 0 || m == 0;
    }

   

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");

            }
            System.out.println("");
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   public static void main(String[]args){
       Tablero obj=new Tablero();
   }

}
