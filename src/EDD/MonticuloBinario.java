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
    
    public MonticuloBinario(){
        this.tamano = 0;
        this.docs = new Documentos[1];
        this.docs[0] = new Documentos("sdasada", 0, "adsdasdsa");
        this.docs[0].setTiempo(0);
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
    
    
    public void subirDoc(int num){
    while(num > 0 && this.docs[num] != null && this.docs[num/2] != null &&
          this.docs[num].getTiempo() < this.docs[num/2].getTiempo()){
        
        Documentos temporal = this.docs[num/2];
        this.docs[num/2] = this.docs[num];
        this.docs[num] = temporal;

        num = num/2;
    }
}

public void insertar_array(Documentos doc){
    Documentos[] nuevo = new Documentos[tamano + 2];
    
    for (int i = 0; i < tamano + 1; i++) {
        nuevo[i] = this.docs[i];
    }
    
    nuevo[tamano] = doc;
    this.docs = nuevo;
    tamano++;
}

public void insertarDoc(Documentos doc){
    this.insertar_array(doc);
    this.subirDoc(tamano - 1); // Ajustar el índice para que sea 0-based
}

  public void imprimir() {
    System.out.println("Documentos ordenados por Tiempo:");
    for (int i = 0; i < tamano; i++) {
        if (this.docs[i] != null) {
            System.out.println("Documento " + (i + 1) + ": Tiempo = " + this.docs[i].getTiempo());
            // Puedes agregar más información según tus necesidades
        }
    }
}
    
}
