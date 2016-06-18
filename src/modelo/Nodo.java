/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jsnar
 */
public class Nodo {
    
    private Nodo padre;
    private Estado estado;
    private Operador operador;
    private Integer costoEstimado;
    private List<Nodo> hijos;
    
    public Nodo(Nodo padre, Estado estado) {
        this.padre = padre;
        this.estado = estado;
        operador = new Operador(4, 4, 1);
        costoEstimado = estado.calcularCosto(operador) + estado.calcularHeuristica();
        hijos = new ArrayList<>();
    }
    
    public void agregarHijo(Nodo hijo) {
        hijos.add(hijo);
    }
}
