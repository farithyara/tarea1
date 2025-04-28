package javaapplication10;

import java.util.Scanner;
import java.util.Base64; // Importamos librería para codificar en Base64

public class JavaApplication10 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in); // Crear objeto Scanner para entrada de datos
        
        System.out.println("Escriba su nombre: "); // Se pide el nombre
        String nombre = lectura.next(); // Se lee nombre como String
        
        // Convertimos nombre a Base64
        String nombreBase64 = Base64.getEncoder().encodeToString(nombre.getBytes());
        
        System.out.println("Escriba su carrera: "); // Se pregunta la carrera
        String carrera = lectura.next(); // Leer carrera como String
        
        System.out.println("Ingrese su edad: "); // Se pregunta edad
        String edadTexto = lectura.next(); // Para leer edad como String
        
        // Convertimos edad a Integer y Float
        Integer edadEntero = Integer.valueOf(edadTexto);
        Float edadDecimal = Float.valueOf(edadTexto);
        
        System.out.println("Ingrese su telefono: "); // Se pide el teléfono
        Integer telefono = lectura.nextInt(); // Para que lea teléfono como Integer
        
        // Convertimos teléfono a Double y luego a String
        Double telefonoDouble = Double.valueOf(telefono);
        String telefonoTexto = telefono.toString();
        //Con Integer hay un límite en el rango que acepta la variable
        // Para que se muestren los resultados
        System.out.println("Nombre en Base64: " + nombreBase64);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad como Integer: " + edadEntero);
        System.out.println("Edad como Float: " + edadDecimal);
        System.out.println("Teléfono como Double: " + telefonoDouble);
        System.out.println("Teléfono como String: " + telefonoTexto);
    }
}
