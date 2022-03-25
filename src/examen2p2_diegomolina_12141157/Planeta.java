/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_diegomolina_12141157;
import java.io.Serializable;
/**
 *
 * @author diego
 */
public abstract class Planeta implements Serializable{
    private String nombre;
    private int tamano;
    private int peso;
    private int x;
    private int y;

    public Planeta() {
    }

    public Planeta(String nombre, int tamano, int peso, int x, int y) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.peso = peso;
        this.x = x;
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return nombre;
    }
    public abstract int probabilidad();
}
