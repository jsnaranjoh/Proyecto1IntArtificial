/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;
import modelo.Estado;

/**
 *
 * @author jsnar
 */
public class Agente {
 
    private List<Estado> estadosPosibles;
    
    //Operador
    public void generarEstadosPosibles() {
        //Peor caso: 81 Casillas * 9 Posibilidades = 729 Estados Posibles
    }
    
    //Prueba de meta
    public boolean esMeta(Estado estado) {
        return true;
    }
    
    //g
    public Integer costoRuta() {
        //Suma de costos de los estados en la ruta
        return 0;
    }
}