/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import java.util.UUID;
import modelo.Estado;
import modelo.Nodo;
import modelo.Operador;

/**
 *
 * @author jsnar
 */
public class Agente {
    
    private Nodo raiz;
    private Estado tablero;
    
    public Agente() {
        
    }
    
    public void cargarSudoku(String dificultad) {
        tablero = new Estado();
        tablero.cargarEstadoCuadricula(dificultad);
    }
    
    public void solucionarSudoku() {
        raiz = new Nodo(UUID.randomUUID().toString(), null, tablero, null, 0);
        for(Integer i = 0; i<=100; i++) {
            generarHijos(raiz);
            if(!raiz.getHijos().isEmpty()) {
                Nodo mejorHijo = buscarMejorHijo(raiz);
                raiz.getEstado().ubicarNumero(mejorHijo.getOperador());
                raiz.getHijos().clear();   
            }
        }
    }
    
    public void generarHijos(Nodo nodo) {
        for(Integer indexFila = 0; indexFila < 9; indexFila++) {
            for(Integer indexColumna = 0; indexColumna < 9; indexColumna++) {
                for(Integer numero = 1; numero < 10; numero++) {
                    Operador operador = new Operador(indexColumna, indexFila, numero);
                    if(nodo.getEstado().posibleUbicarNumero(operador)) {
                        Estado nuevoEstado = new Estado(nodo.getEstado());
                        nuevoEstado.ubicarNumero(operador);
                        nodo.agregarHijo(new Nodo(UUID.randomUUID().toString(), nodo.getId(), nuevoEstado, operador, nodo.getCostoEstimado()));
                    }
                }
            }
        }
    }
    
    public Nodo buscarMejorHijo(Nodo nodo) {
        Nodo mejorHijo = nodo.getHijos().get(0);
        List<Nodo> listaHijos = nodo.getHijos();
        
        for(Integer index = 0; index < listaHijos.size(); index++) {
            if(listaHijos.get(index).getCostoEstimado() < mejorHijo.getCostoEstimado()) {
                mejorHijo = listaHijos.get(index);
            }
        }
        
        return mejorHijo;
    }
    
    public Estado getTablero() {
        return tablero;
    }
}
