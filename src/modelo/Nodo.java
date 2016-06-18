/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author jsnar
 */
public class Nodo {
    
    private Estado estado;
    private Nodo padre;
    private Operador operador;
    private Integer profundidad;
    private Integer costo;
    private List<Nodo> hijos;
    
    public Nodo(Estado estado, Nodo padre){
        this.estado = estado;
        this.padre = padre;
        operador = new Operador(0, 0, 0, 0, 2);
        //costo = estado.calcularCosto(operador);
    }
    
    public void ubicarNumero() {
        
    }
    
    public boolean pruebaDeMeta() {
        return false;
    }
}
