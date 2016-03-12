/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Estado;

/**
 *
 * @author jsnar
 */
public class ControladorEstado {
    
    private List<Estado> listaEstadosIniciales;
    
    public ControladorEstado() {
        listaEstadosIniciales = new ArrayList();
        List<String> listaLineas = new ArrayList();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/modelo/estados.txt"));
            String linea;
            while((linea = br.readLine()) != null) {
                listaLineas.add(linea);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControladorEstado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControladorEstado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(String linea:listaLineas) {
            listaEstadosIniciales.add(new Estado(linea));
        }
    }

    public List<Estado> getListaEstadosIniciales() {
        return listaEstadosIniciales;
    }
    
    public Estado getEstadoInicial(Integer id) {
        return listaEstadosIniciales.get(id);
    }
}
