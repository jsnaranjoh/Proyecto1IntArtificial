/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Estado;
import modelo.Nodo;

/**
 *
 * @author jsnar
 */
public class Agente {
    
    private Nodo raiz;
    private Estado tablero;
    
    public Agente(String dificultad){
        tablero = new Estado();
        tablero.cargarLineaEstadoEnCuadricula(dificultad);
        raiz = new Nodo(tablero, null);
    }
    
    public Estado getTablero() {
        return tablero;
    }
}
