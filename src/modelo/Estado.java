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

    public Integer calcularCosto(Operador operador) {
        Integer columna = operador.getColumna();
        Integer fila = operador.getFila();
        Integer costo = 0;
        
        //Costo en columna
        for(Integer indexFila = 0; indexFila < 9; indexFila++) {
            if(cuadricula[columna][indexFila] == 0) {
                costo++;
            }
        }
        
        //Costo en fila
        for(Integer indexColumna = 0; indexColumna < 9; indexColumna++) {
            if(cuadricula[indexColumna][fila] == 0) {
                costo++;
            }
        }
        
        //Costo en región
        Integer iColumna, iFila;
        
        if(columna < 3) {
            iColumna = 0;
        } else if(columna < 6) {
            iColumna = 3;
        } else {
            iColumna = 6;
        }
        
        if(fila < 3) {
            iFila = 0;
        } else if(fila < 6) {
            iFila = 3;
        } else {
            iFila = 6;
        }
        
        for(Integer indexFila = iFila; indexFila < (iFila + 3); indexFila++) {
            for(Integer indexColumna = iColumna; indexColumna < (iColumna + 3); indexColumna++) {
                if(cuadricula[indexColumna][indexFila] == 0) {
                    costo++;
                }
            }
        }
        
        return costo - 3;
    }
    
    public Integer calcularHeuristica() {
        Integer heuristica = 0;
        
        for(Integer indexFila = 0; indexFila < 9; indexFila++) {
            for(Integer indexColumna = 0; indexColumna < 9; indexColumna++) {
                if(cuadricula[indexColumna][indexFila] == 0) {
                    heuristica++;
                }
            }
        }

        return heuristica - 1;
    }
    
    public boolean posibleUbicarNumero(Operador operador) {
        Integer columna = operador.getColumna();
        Integer fila = operador.getFila();
        Integer numero = operador.getNumero();
        
        //Verificación de que la casilla este vacía
        if(cuadricula[columna][fila] != 0) {
            return false;
        }
        
        //Recorrido por la columna buscando el numero
        for(Integer indexFila = 0; indexFila < 9; indexFila++) {
            if(cuadricula[columna][indexFila] == numero) {
                return false;
            }
        }
        
        //Recorrido por la fila buscando el numero
        for(Integer indexColumna = 0; indexColumna < 9; indexColumna++) {
            if(cuadricula[indexColumna][fila] == numero) {
                return false;
            }
        }
        
        //Recorrido por la región buscando el numero
        Integer iColumna, iFila;
        
        if(columna < 3) {
            iColumna = 0;
        } else if(columna < 6) {
            iColumna = 3;
        } else {
            iColumna = 6;
        }
        
        if(fila < 3) {
            iFila = 0;
        } else if(fila < 6) {
            iFila = 3;
        } else {
            iFila = 6;
        }
        
        for(Integer indexFila = iFila; indexFila < (iFila + 3); indexFila++) {
            for(Integer indexColumna = iColumna; indexColumna < (iColumna + 3); indexColumna++) {
                if(cuadricula[indexColumna][indexFila] == numero) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
