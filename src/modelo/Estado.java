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
    
    private Integer[][][][] cuadricula;
    
    public Estado() {

    }
    
    /**Método auxiliar que lee el archivo estados.txt y retorna una linea del archivo que contiene un estado inicial al azar entre 
       un grupo de estados con determianda dificultad.**/
    public String leerLineaEstadoAlAzar(String dificultad) {
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
    
    public void cargarLineaEstadoEnCuadricula(String dificultad) {
        String lineaEstado = leerLineaEstadoAlAzar(dificultad);
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
        
        cuadricula = new Integer[3][3][3][3];
        Integer iterador = 0;
        
        for(Integer rFila = 0; rFila <= 2; rFila++) {
            for(Integer cFila = 0; cFila <= 2; cFila++) {
                for(Integer rColumna = 0; rColumna <= 2; rColumna++) {
                    for(Integer cColumna = 0; cColumna <= 2; cColumna++) {
                        cuadricula[rFila][rColumna][cFila][cColumna] = listaNumeros.get(iterador);
                        iterador++;
                    }
                }
            }
        }
    }
    
    public List<Character> generarListaCaracteres() {
        List<Character> listaCaracteres = new ArrayList();
        
        for(Integer rFila = 0; rFila <= 2; rFila++) {
            for(Integer cFila = 0; cFila <= 2; cFila++) {
                for(Integer rColumna = 0; rColumna <= 2; rColumna++) {
                    for(Integer cColumna = 0; cColumna <= 2; cColumna++) {
                        Integer numero = cuadricula[rFila][rColumna][cFila][cColumna];
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
    
    public Integer calcularCosto(Operador operador) {
        Integer costo = 0;
        Integer rFila = operador.getrFila();
        Integer rColumna = operador.getrColumna();
        Integer cFila = operador.getcFila();
        Integer cColumna = operador.getcColumna();
        
        //Costo en x (fila)
        for(Integer rColumnaI = 0; rColumnaI <= 2; rColumnaI++) {
            for(Integer cColumnaI = 0; cColumnaI <= 2; cColumnaI++) {
                if(cuadricula[rFila][rColumnaI][cFila][cColumnaI] == 0){
                    costo++;
                }
            }
        }
        
        //Costo en y (columna)
        for(Integer rFilaI = 0; rFilaI <= 2; rFilaI++) {
            for(Integer cFilaI = 0; cFilaI <= 2; cFilaI++) {
                if(cuadricula[rFilaI][rColumna][cFilaI][cColumna] == 0){
                    costo++;
                }
            }
        }
        
        //Costo en r (región)
        for(Integer cFilaI = 0; cFilaI <= 2; cFilaI++) {
            for(Integer cColumnaI = 0; cColumnaI <= 2; cColumnaI++) {
                if(cuadricula[rFila][rColumna][cFilaI][cColumnaI] == 0){
                    costo++;
                }
            }
        }
        
        System.out.println("Costo: " + costo);
        return costo;
    }
    
    public Integer calcularHeuristica() {
        return 0;
    }

    public Integer[][][][] getCuadricula() {
        return cuadricula;
    }
}
