/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import controlador.ControladorEstado;
import modelo.Estado;

/**
 *
 * @author jsnar
 */
public class Tablero {
    
    private Estado estadoTablero;
    
    public Tablero () {
        ControladorEstado controladorEstado = new ControladorEstado();
        estadoTablero = controladorEstado.getEstadoInicial(0);
    }
}
