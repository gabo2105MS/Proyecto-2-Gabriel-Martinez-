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
public class Cola {
    
    
    //atributos
    private int pFirst;
    private int pLast;
    private Documentos[] cola_impresion;
    public int tamano;
    //constructor

    public Cola(int tamano) {
        this.pFirst = -1;
        this.pLast = -1;
        this.cola_impresion = new Documentos[tamano];
        this.tamano = tamano;
    }
    
    //getter and setter

    public int getpFirst() {
        return pFirst;
    }

    public void setpFirst(int pFirst) {
        this.pFirst = pFirst;
    }

    public int getpLast() {
        return pLast;
    }

    public void setpLast(int pLast) {
        this.pLast = pLast;
    }

    public Documentos[] getCola_impresion() {
        return cola_impresion;
    }

    public void setCola_impresion(Documentos[] cola_impresion) {
        this.cola_impresion = cola_impresion;
    }

    public boolean isEmpty(){
        if(pFirst == -1 ){
            return true;
        }else{
            return false;
        }
    }
    
    public int buscar_espacio(){
        for (int i = 0; i < tamano; i++) {
            if (cola_impresion[i] == null){
                return i;
            }
        }
        Documentos[] nuevo = new Documentos[tamano+1];
        for (int i = 0; i < tamano; i++) {
            nuevo[i] = null;
            nuevo[i] = this.cola_impresion[i];
            
        }
        this.cola_impresion = nuevo;
        return tamano;
    }
          
    public void encolar(Documentos documento){
        if(isEmpty()){
           cola_impresion[0] = documento;
        }else{
            int espacio = buscar_espacio();
            this.cola_impresion[espacio] = documento;
            this.cola_impresion[pLast].siguiente = espacio;
            this.pLast = espacio;
        }
    }
    
    
    public void desencolar(){
        if(!isEmpty()){
            int aux = this.cola_impresion[pFirst].siguiente;
            this.cola_impresion[pFirst] = null;
            this.pFirst = aux;
        }
    }

      public Documentos BuscarDocumento(String documento){
          Documentos buscado = null;
          if(cola_impresion[this.pFirst].getNombre().equals(documento)){
              return cola_impresion[this.pFirst];
          }
          else{
              Documentos aux = this.cola_impresion[pFirst];
              this.desencolar();
              buscado = this.BuscarDocumento(documento);
              this.encolar(aux);
          }
        return buscado;
    }
    
}
