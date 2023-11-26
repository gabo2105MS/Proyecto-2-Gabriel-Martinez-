/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author gabri
 */
public class Documentos {
    
    //atributos 
    private String nombre;
    private String tamano;
    private String tipo;
    private int tiempo;
    private int hijo_izq;
    private int hijo_der;
    public int siguiente;
    
    public Documentos(String nombre, String tamano, String tipo){
        this.nombre = nombre;
        this.tamano = tamano;
        this.tipo = tipo;
        this.hijo_der = this.hijo_izq = 0;
        this.tiempo =0;
        this.siguiente = -1;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the hijo_izq
     */
    public int getHijo_izq() {
        return hijo_izq;
    }

    /**
     * @param hijo_izq the hijo_izq to set
     */
    public void setHijo_izq(int hijo_izq) {
        this.hijo_izq = hijo_izq;
    }

    /**
     * @return the hijo_der
     */
    public int getHijo_der() {
        return hijo_der;
    }

    /**
     * @param hijo_der the hijo_der to set
     */
    public void setHijo_der(int hijo_der) {
        this.hijo_der = hijo_der;
    }

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
    
}
