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
    public Usuarios next;
    public Usuarios head;
    
    
    //cosntructor
    public Usuarios(String usuario, String tipo){
        this.tipo = tipo;
        this.usuario = usuario;
        this.docs = new Documentos[1];
        this.docs[0] = null;
        this.tamano = 1;
        this.next = null;
        this.head = null;
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
    
    public void setHead(Usuarios head){
        this.head = head;
    }
    
    public Usuarios getHead(){
        return head;
    }
    
    //funcion para insertar un doc dentro del array del usuario que esta en el hastable
    public void insertar_doc(Documentos doc){
        boolean insertado = false;
    for (int i = 0; i < this.getDocs().length; i++) {
        if (this.docs[i] == null) {
            this.docs[i] = doc;
            insertado = true;
            break;
        }
    }
    if (!insertado) {
        Documentos[] nuevo = new Documentos[tamano + 1];
        for (int i = 0; i < tamano; i++) {
            nuevo[i] = this.docs[i];
        }
        nuevo[tamano] = doc;
        this.docs = nuevo;
        tamano++;
    }
         
     
    }
    //funcion para insertar un usuario
    public void insertar_usuario(Usuarios user){
        if(this.head == null){
            this.head = user;
        }
        else if(this.next == null && !this.usuario.equals(user.getUsuario())){
            this.next = user;
        }else{
            Usuarios aux = this.next;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = user;
        }
    }
    
    //funcion para eliminar un usuario
    public void eliminar_usuario(String usuario) {
        Usuarios aux = this.next;
        while (aux.next != null && (aux.next.usuario == null ? usuario != null : !aux.next.usuario.equals(usuario))) {
            aux = aux.next;
        }
        if (aux.next!=null){
            aux.next = aux.next.next;
        }else{
            System.out.println("Usuario no Encontrado");
        }
    }
    
    //funcion para eliminar un documento
    public void eliminar_doc(String doc) {
        for (int i = 0; i < tamano; i++) {
            if (this.docs[i] != null && this.docs[i].getNombre().equals(doc)) {
                this.docs[i] = null;
                break;
            }
        }
    }
    
    //primitiva isempty
     public boolean isEmpty(){
        return this.head == null;
    }
     
     
    //funcion para buscar un usuario en el hastable
   public Usuarios buscar_usuario(String user) {
           Usuarios aux = this;
           while(aux != null && aux.getUsuario().equals(user)){
               aux = aux.next;
           }  
       return aux;
}
   
   //funcion para imprimir los documentos dentro de los usuarios
    public void imprimirUser() {
      Usuarios aux = this;
    while (aux != null) {
        System.out.println("Usuario: " + aux.getUsuario() + "   Docs: ");
        for (int i = 0; i < aux.getDocs().length; i++) {
            if (aux.getDocs()[i] != null) {
                System.out.println("  - " + aux.getDocs()[i].getNombre());
            }
        }
        aux = aux.next;
    }
}
    
    //funcion para buscar un documento
     public boolean documentoLookFor(String doc) {
        for (int i = 0; i < tamano; i++) {
        if (this.docs[i] != null && this.docs[i].getNombre().equals(doc)) {
            return true;
        }
    }
    return false;
    }
     
     //funcion para buscar un documento pero que me retorne el documento
     public Documentos Buscar_doc(String doc) {
         for (int i = 0; i < tamano; i++) {
        if (docs[i] != null && docs[i].getNombre().equals(doc)) {
            return docs[i];
        }
    }
    return null;
    }
    
    
    
    
    
    
}
