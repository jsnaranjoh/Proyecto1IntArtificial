/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jsnar
 */
public class Estado {
    
    private Casilla[][][][] cuadricula;
    
    public Estado() {

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
            System.out.println("Archivo estados.txt no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error leyendo estados.txt.");
        }
        
        Random generador = new Random();
        Integer index = generador.nextInt(listaLineasEstado.size());
        return listaLineasEstado.get(index);
    }
    
    public void cargarEstadoTxt(String dificultad) {
        String lineaEstado = getLineaEstado(dificultad);
        List<Integer> listaNumeros = new ArrayList();
        String[] listaTokens = lineaEstado.split("\t");
        
        for(Integer i=1; i<listaTokens.length ;i++) {
            String[] listaTresNumeros = listaTokens[i].split(",");
            
            for(String tresNumeros:listaTresNumeros) {
                String[] subListaNumeros = tresNumeros.split("");
                
                for(String numero:subListaNumeros) {
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
                        cuadricula[cFila][cColumna][rFila][rColumna] = new Casilla(listaNumeros.get(iterador), 0);
                        iterador++;
                    }
                }
            }
        }
    }
    
    public List<Character> getListaCaracteres() {
        List<Character> listaCaracteres = new ArrayList();
        
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

    public Casilla[][][][] getCuadricula() {
        return cuadricula;
    }
}
