package javaapplication10;
import java.util.Scanner;
public class JavaApplication10 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        String nombre = lectura.next();
        System.out.println("Escriba su carrera: ");
        String carrera = lectura.next();
        System.out.println("Ingrese su edad: ");
        String edad = lectura.next();
        Integer.valueOf(edad);
        Float.valueOf(edad);
        Double.valueOf(edad);
        System.out.println("Ingrese su telefono: ");
        Integer telefono = lectura.nextInt();
        telefono.toString();
        
    }
    
}
