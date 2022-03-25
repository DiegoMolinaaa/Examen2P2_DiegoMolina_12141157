/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_diegomolina_12141157;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Cientifico {
    private String nombre;
    private ArrayList<Planeta> pDescubiertos = new ArrayList();

    public Cientifico() {
    }

    public Cientifico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Planeta> getpDescubiertos() {
        return pDescubiertos;
    }

    public void setpDescubiertos(ArrayList<Planeta> pDescubiertos) {
        this.pDescubiertos = pDescubiertos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
