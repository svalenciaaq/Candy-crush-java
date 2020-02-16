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
public class Nivel {
    private int puntuacionMinima=0;
    private int puntuacionMaxima=0;
    private int movimientos=30;
    private int numeroNivel=0;
    private int puntuacionActual=0;

    public int getPuntuacionMinima() {
        return puntuacionMinima;
    }

    public void setPuntuacionMinima(int puntuacionMinima) {
        this.puntuacionMinima = puntuacionMinima;
    }

    public int getPuntuacionMaxima() {
        return puntuacionMaxima;
    }

    public void setPuntuacionMaxima(int puntuacionMaxima) {
        this.puntuacionMaxima = puntuacionMaxima;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    public int getNumeroNivel() {
        return numeroNivel;
    }

    public void setNumeroNivel(int numeroNivel) {
        this.numeroNivel = numeroNivel;
    }

    public int getPuntuacionActual() {
        return puntuacionActual;
    }

    public void setPuntuacionActual(int puntuacionActual) {
        this.puntuacionActual = puntuacionActual;
    }

}