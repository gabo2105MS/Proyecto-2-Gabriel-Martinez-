/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Main.Usuarios;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class validaciones {
    
    Usuarios user = new Usuarios("pedro", "alta");
    
    //validacion para el nombre de usuario
    public boolean validarNombreUsuario(String nombreUsuario) {
    // Verificar si el nombre de usuario contiene al menos un número.
    // Además, verificar que no haya espacios en el nombre de usuario.
    for (char caracter : nombreUsuario.toCharArray()) {
        if (Character.isDigit(caracter) || Character.isWhitespace(caracter)) {
            return true;
        }
    }

    // Si no se encontraron números ni espacios, el nombre de usuario es válido.
    return false;

    }
    
    public boolean tipoUsuario(String tipoUsuario){
           String[] tiposValidos = {"prioridad_alta", "prioridad_media", "prioridad_baja"};

        // Verificar si el tipo de usuario es válido.
        for (String tipoValido : tiposValidos) {
            if (tipoUsuario.equals(tipoValido)) {
                return true;
            }
        }

        return false;
    }
  
    public boolean NombreDocumento(String documento){
          // Verificar la longitud máxima.
        if (documento.length() > 15) {
            return false;
        }

        // Verificar la ausencia de arrobas.
        if (documento.contains("@")) {
            return false;
        }

        // Si pasa ambas verificaciones, el string es válido.
        return true;
    }
    
    //verificar el tamano del documento
    public boolean tamano(String tamano){
        // Verificar si el string es numérico.
        if (!tamano.matches("\\d+")) {
            return false;
        }

        // Convertir el string a un número entero.
        int numero = Integer.parseInt(tamano);

        // Verificar que el número no tenga más de 4 cifras.
        if (numero >= 10000) {
            return false;
        }

        // Si pasa ambas verificaciones, el string es un número válido con menos de 5 cifras.
        return true;
    }
    
     public boolean validarPrioridad(String prioridad) {
        // Verificar si el string es "prioritario" o "no prioritario" (ignorando mayúsculas/minúsculas).
        return prioridad.equalsIgnoreCase("prioritario") || prioridad.equalsIgnoreCase("no_prioritario");
    }
    
}
