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
    
    private Integer[][] cuadricula;
    
    public Estado() {

    }
    
    /** Lee el archivo estados.txt, busca los estados con la dificultad requerida y selecciona al azar alguno de ellos **/
    public String leerEstadoArchivo(String dificultad) {
        List<String> listaEstados = new ArrayList<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/modelo/estados.txt"));
            String estado;
            while((estado = br.readLine()) != null) {
                String primerTokenEstado = estado.split("\t", 2)[0];
                if(dificultad.equals(primerTokenEstado)) {
                    listaEstados.add(estado);
                }
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo estados.txt no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error leyendo estados.txt.");
        }
        
        Random random = new Random();
        Integer index = random.nextInt(listaEstados.size());
        return listaEstados.get(index);
    }
    
    /** Hace uso del método leerEstadoArchivo() para obtener un estado con la dificultad requerida y lo carga en la matriz cuadricula[][] **/
    public void cargarEstadoCuadricula(String dificultad) {
        String estado = leerEstadoArchivo(dificultad);
        
        List<Integer> listaNumeros = new ArrayList<>();
        
        String[] listaNueveCaracteres = estado.split("\t");
        
        for(Integer i=1; i<listaNueveCaracteres.length; i++) {
            String[] listaTresCaracteres = listaNueveCaracteres[i].split(",");
            
            for(String tresCaracteres:listaTresCaracteres) {
                String[] listaCaracteres = tresCaracteres.split("");
                
                for(String caracter:listaCaracteres) {
                    listaNumeros.add(Integer.parseInt(caracter));
                }
            }
        }
        
        cuadricula = new Integer[9][9];
        Integer index = 0;
        
        for(Integer fila = 0; fila < 9; fila++) {
            for(Integer columna = 0; columna < 9; columna++) {
                cuadricula[columna][fila] = listaNumeros.get(index);
                index++;
            }
        }
    }
    
    /**  Convierte la matriz cuadricula[][] en una lista de caracteres **/
    public List<Character> generarListaCaracteres() {
        List<Character> listaCaracteres = new ArrayList<>();
        
        for(Integer fila = 0; fila < 9; fila++) {
            for(Integer columna = 0; columna < 9; columna++) {
                Integer numero = cuadricula[columna][fila];
                Character caracter = Character.forDigit(numero, 10);
                
                if(caracter.equals('0')) {
                    listaCaracteres.add(' ');
                } else {
                    listaCaracteres.add(caracter);
                }
            }
        }
        
        return listaCaracteres;
    }
    /**
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
    }**/
    
    public Integer calcularHeuristica() {
        return 0;
    }

    public Integer[][] getCuadricula() {
        return cuadricula;
    }
}
