/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jsnar
 */
public class Tablero {
 
    private Casilla[][][][] cuadricula;
    
    public Tablero() {

    }

    public Casilla[][][][] getCuadricula() {
        return cuadricula;
    }

    public void setCuadricula(Casilla[][][][] cuadricula) {
        this.cuadricula = cuadricula;
    }
}
