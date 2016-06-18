/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jsnar
 */
public class Operador {
    
    private Integer columna;
    private Integer fila;
    private Integer numero;

    public Operador(Integer columna, Integer fila, Integer numero) {
        this.columna = columna;
        this.fila = fila;
        this.numero = numero;
    }

    public Integer getColumna() {
        return columna;
    }

    public Integer getFila() {
        return fila;
    }

    public Integer getNumero() {
        return numero;
    }
}