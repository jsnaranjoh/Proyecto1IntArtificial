/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Estado;
import modelo.Tablero;

/**
 *
 * @author jsnar
 */
public class TableroControlador {
    
    private Tablero tablero;
    
    public TableroControlador() {
        tablero = new Tablero();
    }
    
    public void setEstado(Estado estado) {
        tablero.setCuadricula(estado.getCuadricula());
    }
}
