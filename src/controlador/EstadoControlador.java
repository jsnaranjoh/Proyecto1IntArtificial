/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Estado;

/**
 *
 * @author jsnar
 */
public class EstadoControlador {
    
    public EstadoControlador() {
        
    }
    
    public Estado getEstadoInicial(Integer indexDificultad) {
        String dificultad;
        if(indexDificultad == 0) {
            dificultad = "principiante";
        } else if(indexDificultad == 1) {
            dificultad = "facil";
        } else if(indexDificultad == 2) {
            dificultad = "medio";
        } else if(indexDificultad == 3) {
            dificultad = "dificil";
        } else {
            dificultad = "experto";
        }
        Estado estadoInicial = new Estado(dificultad);
        return estadoInicial;
    }
}
