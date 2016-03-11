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
public class Estado {
    
    private String dificultad;
    private Casilla[][][][] cuadricula;
    
    public Estado(String linea) {
        cuadricula = new Casilla[3][3][3][3];
        List<Integer> listaNumeros = new ArrayList();
        
        String[] listaTokens = linea.split("\t");
        String dificultad = listaTokens[0];
        
        for(Integer i=1; i<listaTokens.length ;i++) {
            String[] listaFilas = listaTokens[i].split(",");
            
            for(String fila:listaFilas) {
                String[] listaTresNumeros = fila.split("");
                
                for(String numero:listaTresNumeros) {
                    listaNumeros.add(Integer.parseInt(numero));
                }
            }
        }
        
        Integer iterador = 0;
        for(Integer cFila = 0; cFila <= 2; cFila++) {
            for(Integer rFila = 0; rFila <= 2; rFila++) {
                for(Integer cColumna = 0; cColumna <= 2; cColumna++) {
                    for(Integer rColumna = 0; rColumna <= 2; rColumna++) {
                        cuadricula[cFila][cColumna][rFila][rColumna] = new Casilla(listaNumeros.get(iterador));
                        iterador++;
                    }
                }
            }
        }
    }
}
