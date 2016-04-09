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
    
    private Integer rFila;
    private Integer rColumna;
    private Integer cFila;
    private Integer cColumna;
    private Integer n;

    public Operador(Integer rFila, Integer rColumna, Integer cFila, Integer cColumna, Integer n) {
        this.rFila = rFila;
        this.rColumna = rColumna;
        this.cFila = cFila;
        this.cColumna = cColumna;
        this.n = n;
    }

    public Integer getrFila() {
        return rFila;
    }

    public Integer getrColumna() {
        return rColumna;
    }
    
    public Integer getcFila() {
        return cFila;
    }

    public Integer getcColumna() {
        return cColumna;
    }
}