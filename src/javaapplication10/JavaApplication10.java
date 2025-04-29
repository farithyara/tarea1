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

        // Convertimos nombre a ascii.

        int len = nombre.length(); //para poder almacenar el tamaño del nombre ya que usaremos esto para convertir a ascii letra por letra.
        // necesitamos saber hasta donde llegar.
        System.out.println("tu nombre en ascii es: ");
        for (int i = 0; i < len; i++) { //con este bucle recorremos el nombre letra a letra de inicio a fin y la convertimos en un numero de la tabla ascii
            int nm_ascii = (int) nombre.charAt(i); // lo que hace nombre.charAt(i) es mostrar el caracter que se encuentra en la posicion "i"
                                              //de la variable nombre. "(int)"convierte a entero ascii el caracter nombre.charAt(i).
            System.out.print(nm_ascii+" "); //System.out.print no agrega un salto de linea al final como println. Aqui se puede imprimir 
                                    //horizontalmente creando un espacio vacio entre los elementos
        }
        System.out.println("\n"); // para que la ejecucion del programa no se vea extraña se añade un salto de linea.
    }
}
