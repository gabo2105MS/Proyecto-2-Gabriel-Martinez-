/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Main.Documentos;
import Main.Usuarios;

/**
 *
 * @author gabri
 */
public class Hastable {

    //Atributos
    private int size;
    private Usuarios[] users;

    //constructor
    public Hastable() {
        this.size = 999;
        this.users = new Usuarios[size];
    }

    //getter and setter
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Usuarios[] getDocs() {
        return users;
    }

    public void setDocs(Usuarios[] docs) {
        this.users = docs;
    }

    //inicializar el hash
    public void initTable() {
        setDocs(new Usuarios[getSize()]);
        for (int i = 0; i < size; i++) {
            getDocs()[i] = null;
        }
    }

    //establecer una clave unica para cada usuario
    public int toHash(String usuario) {
        int hashcode = 0;
        for (int i = 0; i < usuario.length(); i++) {
            int hash = (int) usuario.charAt(i);
            hashcode += hash;
        }
        hashcode = hashcode % 998;
        return hashcode;
    }

    //insertar un usuario al hash
    public void insertar(String usuario, String tipo) {
        int hashcode = this.toHash(usuario);
        //System.out.println(hashcode);
        Usuarios user = new Usuarios(usuario, tipo);
        if (users[hashcode] == null) {
            users[hashcode] = user;
//            users[hashcode].head = user;
        } else {
            users[hashcode].insertar_usuario(user);
        }
    }

    //eliminar un usuario del hash
    public void eliminar(String usuario) {
        int hashcode = this.toHash(usuario);
        if (this.users[hashcode].getUsuario().equals(usuario)) {
            this.users[hashcode] = this.users[hashcode].next;
        } else {
            this.users[hashcode].eliminar_usuario(usuario);
        }
    }

    //imprimir el hash
    public void imprimir() {
        for (int i = 0; i < size; i++) {
            if (this.users[i] != null) {
                System.out.println(users[i].getUsuario());
                this.users[i].imprimirUser();

            }
        }
    }

    //funcion para insertar un documento al hash
    public void insertar_documento(String usuario, String nombre, String tamano, String tipo, int sec) {
        int hashcode = this.toHash(usuario);
        Documentos doc = new Documentos(nombre, tamano, tipo);
        doc.setTiempo(sec);
        if (this.users[hashcode].getUsuario().equals(usuario)) {
            this.users[hashcode].insertar_doc(doc);
        } else {
            Usuarios user = this.users[hashcode].buscar_usuario(usuario);
            if (user != null) {
                user.insertar_doc(doc);
            }
        }
    }

    //funcion para eliminar un documento del hash
    public void eliminar_documento(String usuario, String nombre) {
        int hashcode = this.toHash(usuario);
        if (this.users[hashcode].getUsuario().equals(usuario)) {
            this.users[hashcode].eliminar_doc(nombre);
        } else {
            Usuarios user = this.users[hashcode].buscar_usuario(usuario);
            if (user != null) {
                user.eliminar_doc(nombre);
            }
        }
    }

    //funcion para buscar un usuario en el hashtable
    public Usuarios buscarUsuario(String usuario) {
        int hashcode = this.toHash(usuario);

        if (this.users[hashcode].getUsuario().equals(usuario)) {
            return users[hashcode];
        } else {
            Usuarios aux = this.users[hashcode];
            while (aux != null && aux.getUsuario().equals(usuario)) {
                aux = aux.next;
            }
            return aux;
        }
    }

    // Función de validación para verificar si un usuario está presente en el hashtable.
    public boolean usuarioPresente(String usuario) {
        int hashcode = this.toHash(usuario);

        if (this.users[hashcode] != null && this.users[hashcode].getUsuario().equals(usuario)) {
            return true;
        } else {
            Usuarios aux = this.users[hashcode];
            while (aux != null) {
                if (aux.getUsuario().equals(usuario)) {
                    return true;
                }
                aux = aux.next;
            }
        }

        return false;
    }

    //funcion para ver si un documento esta en el hashtable
    public boolean documentoPresente(String nombreDocumento, String usuario) {
        int hashcode = this.toHash(usuario);
        if (this.users[hashcode] != null) {
            return this.users[hashcode].documentoLookFor(nombreDocumento);
        }
        return false;

    }

    //funcion para buscar un documento por su nombre y que me retorne el documento
    public Documentos buscarDocumentoPorNombre(String nombreDocumento) {
        for (int i = 0; i < size; i++) {
            if (users[i] != null) {
                Documentos resultado = users[i].Buscar_doc(nombreDocumento);
                if (resultado != null) {
                    return resultado;
                }
            }
        }
        return null;
    }

}
