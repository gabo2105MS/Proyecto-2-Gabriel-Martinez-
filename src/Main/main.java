package Main;

import EDD.MonticuloBinario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Documentos d = new Documentos("sdasad", 1, "sadsads");
        d.setTiempo(5);
        Documentos e = new Documentos("sadas", 3, "fdfs");
        e.setTiempo(4);
        Documentos f = new Documentos("fdfds", 2, "fdsfd");
        f.setTiempo(6);
        
        Documentos h = new Documentos("fdfds", 5, "fdsfd");
        f.setTiempo(1);
        
        MonticuloBinario m = new MonticuloBinario();
        m.insertarDoc(d);
        m.insertarDoc(e);
        m.insertarDoc(f);
        m.insertarDoc(h);
        m.imprimir();

    }
    
}
