/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author gabri
 */
public class LeerCSV {
    
    public void leerCSV(Hastable hashTable){
        //Hastable hashTable = new Hastable();
        
        try (BufferedReader br = new BufferedReader(new FileReader("test//Usuarios.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Dividir la línea en campos usando StringTokenizer o split
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                
                // Obtener el usuario y el tipo
                String usuario = tokenizer.nextToken().trim();
                String tipo = tokenizer.nextToken().trim();
                
                // Insertar el usuario en la Hashtable
                hashTable.insertar(usuario, tipo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
