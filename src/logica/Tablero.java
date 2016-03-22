/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import controlador.EstadoControlador;
import modelo.Estado;

/**
 *
 * @author jsnar
 */
public class Tablero {
    
    private Estado estadoTablero;

    public Estado getEstadoTablero() {
        return estadoTablero;
    }
    
    public Tablero () {
        EstadoControlador controladorEstado = new EstadoControlador();
        estadoTablero = controladorEstado.getEstadoInicial(0);
    }
}
