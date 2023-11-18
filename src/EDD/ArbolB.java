/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Main.Documentos;

/**
 *
 * @author gabri
 */
public class ArbolB {
    
    private int root;
    private int tamano;
    private Documentos[] cola_impresion;

    //constructor
    public ArbolB(int root, int tamano, Documentos[] cola_impresion) {
        this.root = root;
        this.tamano = tamano;
        this.cola_impresion = cola_impresion;
    }

    //getter and setter
    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Documentos[] getCola_impresion() {
        return cola_impresion;
    }

    public void setCola_impresion(Documentos[] cola_impresion) {
        this.cola_impresion = cola_impresion;
    }
    
    
    
}
