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
public class MonticuloBinario {

    //atributos
    private int tamano;
    private Documentos[] docs;

    public MonticuloBinario() {
        this.tamano = 0;
        this.docs = new Documentos[1];
//        this.docs[0] = new Documentos("sdasada", null, "adsdasdsa");
//        this.docs[0].setTiempo(0);
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Documentos[] getDocs() {
        return docs;
    }

    public void setDocs(Documentos[] docs) {
        this.docs = docs;
    }

    public void subirDoc(int num) {
        while (num > 0 && this.docs[num] != null && this.docs[num / 2] != null
                && this.docs[num].getTiempo() < this.docs[num / 2].getTiempo()) {

            Documentos temporal = this.docs[num / 2];
            this.docs[num / 2] = this.docs[num];
            this.docs[num] = temporal;

            num = num / 2;
        }
    }

    //funcion para insertar el documento en el array
    public void insertar_array(Documentos doc) {
        Documentos[] nuevo = new Documentos[tamano + 2];

        for (int i = 0; i < tamano; i++) {
            nuevo[i] = this.docs[i];
        }

        nuevo[tamano] = doc;
        this.docs = nuevo;
        tamano++;
    }

    //funcion para insertar el documento en la cola
    public void insertarDoc(Documentos doc) {
        this.insertar_array(doc);
        this.subirDoc(tamano - 1); // Ajustar el índice para que sea 0-based
    }

    //funcion para imprimir la cola de impresion
    public void imprimir() {
        System.out.println("Cola de impresion:");
        for (int i = 0; i < tamano; i++) {
            if (this.docs[i] != null) {
                System.out.print(" [ " + this.docs[i].getNombre() + " ] " + " ----> ");
            }
        }
    }

    //funcion para eliminar el documento de la cola de impresion
    public void eliminarDoc(String nombreDocumento) {
        int index = -1;
        for (int i = 0; i < tamano; i++) {
            if (this.docs[i] != null && this.docs[i].getNombre().equals(nombreDocumento)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Eliminar el documento encontrando copiando el último elemento al índice y reduciendo el tamaño
            this.docs[index] = this.docs[tamano - 1];
            this.docs[tamano - 1] = null;
            tamano--;

            // Reajustar el montículo
            bajarDoc(index);
        }
    }

    //funcion para reajustar el monticulo luego del eliminar el documento
    private void bajarDoc(int num) {
        int hijoIzquierdo, hijoDerecho, min;

        while ((2 * num) + 1 < tamano) {
            hijoIzquierdo = (2 * num) + 1;
            hijoDerecho = (2 * num) + 2;
            min = num;

            if (this.docs[hijoIzquierdo] != null && this.docs[hijoIzquierdo].getTiempo() < this.docs[min].getTiempo()) {
                min = hijoIzquierdo;
            }

            if (hijoDerecho < tamano && this.docs[hijoDerecho] != null && this.docs[hijoDerecho].getTiempo() < this.docs[min].getTiempo()) {
                min = hijoDerecho;
            }

            if (min != num) {
                Documentos temporal = this.docs[num];
                this.docs[num] = this.docs[min];
                this.docs[min] = temporal;

                num = min;
            } else {
                break;
            }
        }
    }

//funcion para verificar que el documento este en la cola
    public boolean documentoEnCola(String nombreDocumento) {
        for (int i = 0; i < tamano; i++) {
            if (this.docs[i] != null && this.docs[i].getNombre().equals(nombreDocumento)) {
                return true;
            }
        }
        return false;
    }

//funcion para liberar impresora
    public String eliminarPrimero() {
        if (tamano > 0) {
            String nombreDocumentoEliminado = this.docs[0].getNombre();

            // Mover el último elemento al inicio del montículo
            this.docs[0] = this.docs[tamano - 1];
            this.docs[tamano - 1] = null;
            tamano--;

            // Reajustar el montículo
            if (tamano > 1) {
                bajarDocPrimero(0);
            }

            return nombreDocumentoEliminado;
        } else {
            return null; // Retornar null si el montículo está vacío
        }
    }
//verificar que la cola no este vacia

    public boolean colaNoVacia() {
        return tamano >= 0;
    }

    public String imprimirTextArea() {
        StringBuilder resultado = new StringBuilder("Cola de impresion: ");

        for (int i = 0; i < tamano; i++) {
            if (this.docs[i] != null) {
                resultado.append("[ ").append(this.docs[i].getNombre()).append(" ] ----> ");
            }
        }

        return resultado.toString();
    }

    private void bajarDocPrimero(int indice) {
        int indiceHijoIzquierdo = 2 * indice + 1;
        int indiceHijoDerecho = 2 * indice + 2;
        int indiceMinimo = indice;

        // Comparar con el hijo izquierdo
        if (indiceHijoIzquierdo < tamano && this.docs[indiceHijoIzquierdo].getTiempo() < this.docs[indiceMinimo].getTiempo()) {
            indiceMinimo = indiceHijoIzquierdo;
        }

        // Comparar con el hijo derecho
        if (indiceHijoDerecho < tamano && this.docs[indiceHijoDerecho].getTiempo() < this.docs[indiceMinimo].getTiempo()) {
            indiceMinimo = indiceHijoDerecho;
        }

        // Si el índice mínimo ha cambiado, intercambiar y seguir bajando
        if (indiceMinimo != indice) {
            Documentos temp = this.docs[indice];
            this.docs[indice] = this.docs[indiceMinimo];
            this.docs[indiceMinimo] = temp;

            // Continuar bajando en la nueva posición
            bajarDoc(indiceMinimo);
        }
    }


}
