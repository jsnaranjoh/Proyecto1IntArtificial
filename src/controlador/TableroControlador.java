/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Casilla;
import modelo.Estado;
import modelo.Tablero;

/**
 *
 * @author jsnar
 */
public class TableroControlador {
    
    private Tablero tablero;
    
    public TableroControlador() {
        tablero = new Tablero();
    }
    
    public void setEstado(Estado estado) {
        tablero.setCuadricula(estado.getCuadricula());
    }
    
    public List<Character> getListaCaracteres() {
        List<Character> listaCaracteres = new ArrayList();
        Casilla[][][][] cuadricula = tablero.getCuadricula();
        
        for(Integer cFila = 0; cFila <= 2; cFila++) {
            for(Integer rFila = 0; rFila <= 2; rFila++) {
                for(Integer cColumna = 0; cColumna <= 2; cColumna++) {
                    for(Integer rColumna = 0; rColumna <= 2; rColumna++) {
                        Integer numero = cuadricula[cFila][cColumna][rFila][rColumna].getNumero();
                        Character caracter = Character.forDigit(numero, 10);
                        
                        if(caracter.equals('0')) {
                            listaCaracteres.add(' ');
                        } else {
                            listaCaracteres.add(caracter);
                        }
                    }
                }
            }
        }
        
        return listaCaracteres;
    }
}
