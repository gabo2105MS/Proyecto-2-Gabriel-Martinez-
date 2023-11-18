/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author gabri
 */
public class Usuarios {
    
    //atributos
    private String usuario;
    private String tipo;
    private Documentos[] docs;
    public int tamano;
    
    
    //cosntructor
    public Usuarios(String usuario, String tipo){
        this.tipo = tipo;
        this.usuario = usuario;
        this.docs = new Documentos[1];
        this.docs[0] = null;
        this.tamano = 1;
    }
    
    //getter and setter
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the docs
     */
    public Documentos[] getDocs() {
        return docs;
    }

    /**
     * @param docs the docs to set
     */
    public void setDocs(Documentos[] docs) {
        this.docs = docs;
    }
    
    private void insertar_doc(Documentos doc){
        boolean insertado = false;
         for (int i = 0; i < tamano; i++) {
            if (this.docs[i] == null){
                this.docs[i] = doc;
                insertado = true;
                break;
            }
        }
         if (!insertado){
             Documentos[] nuevo = new Documentos[tamano+1];
             for (int i = 0; i < tamano; i++) {
                 nuevo[i] = null;
                 nuevo[i] = this.docs[i];
                     
             }
             nuevo[tamano] = doc;
         }
    }
    
    
    
    
    
}
