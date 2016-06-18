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
    
    private String id;
    private String idPadre;
    private Estado estado;
    private Operador operador;
    private Integer costoEstimado;
    private List<Nodo> hijos;
    
    public Nodo(String id, String idPadre, Estado estado, Operador operador, Integer costoAcumulado) {
        this.id = id;
        this.idPadre = idPadre;
        this.estado = estado;
        
        if(operador != null) {
            this.operador = operador;
            costoEstimado = estado.calcularCosto(operador) + estado.calcularHeuristica() + costoAcumulado;   
        } else {
            costoEstimado = costoAcumulado;
        }
        
        hijos = new ArrayList<>();
    }
    
    public void agregarHijo(Nodo hijo) {
        hijos.add(hijo);
    }

    public String getId() {
        return id;
    }

    public Estado getEstado() {
        return estado;
    }

    public Integer getCostoEstimado() {
        return costoEstimado;
    }

    public List<Nodo> getHijos() {
        return hijos;
    }

    public Operador getOperador() {
        return operador;
    }
}
