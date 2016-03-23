/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.EstadoControlador;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jsnar
 */
public class Estado {
    
    private String dificultad;
    private Casilla[][][][] cuadricula;
    
    //Constructor que crea el estado a partir de un estado en forma de String con determinada dificultad.
    public Estado(String dificultad) {
        this.dificultad = dificultad;
        String lineaEstado = getLineaEstado(dificultad);
        List<Integer> listaNumeros = new ArrayList();
        String[] listaTokensLineaEstado = lineaEstado.split("\t");
        
        for(Integer i=1; i<listaTokensLineaEstado.length ;i++) {
            String[] listaFilas = listaTokensLineaEstado[i].split(",");
            
            for(String fila:listaFilas) {
                String[] listaTresNumeros = fila.split("");
                
                for(String numero:listaTresNumeros) {
                    listaNumeros.add(Integer.parseInt(numero));
                }
            }
        }
        
        cuadricula = new Casilla[3][3][3][3];
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
    
    /**Método auxiliar que lee el archivo estados.txt y retorna una linea del archivo que contiene un estado inicial al azar entre 
       un grupo de estados con determianda dificultad.**/
    public String getLineaEstado(String dificultad) {
        List<String> listaLineasEstado = new ArrayList();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/modelo/estados.txt"));
            String lineaEstado;
            while((lineaEstado = br.readLine()) != null) {
                String[] listaTokensLineaEstado = lineaEstado.split("\t",2);
                if(dificultad.equals(listaTokensLineaEstado[0])) {
                    listaLineasEstado.add(lineaEstado);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EstadoControlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EstadoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Random generador = new Random();
        Integer index = generador.nextInt(listaLineasEstado.size());
        return listaLineasEstado.get(index);
    }
}
