/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_diegomolina_12141157;

/**
 *
 * @author diego
 */
public class Terrestre extends Planeta {

    public Terrestre() {
    }

    public Terrestre(String nombre, int tamano, int peso, int x, int y) {
        super(nombre, tamano, peso, x, y);
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
