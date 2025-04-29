# Tarea conversiones
## Programación orientada a objetos
### Farith Antonio Segura Yara
### Juan Esteban Garcia Tarquino

# Objetivos

- Convertir valores ingresados por un usuario entre los distintos tipos de variables primitivos existentes.

- Observar los rangos de algunos tipos de variables primitivas como lo son (integer,Double,Float)

- Utilizar las herramientas dadas para escanear e imprimir valores por consola en el programa Netbeans

#### Javascript

```javascript
import java.util.Scanner;
import java.util.Base64;
```
- Importamos las dos librerias mostradas con su siguiente función:
1) Ingreso de información por parte del usuario desde la consola
2) Sirve para la codificaciòn de texto base a base64 y en viceversa

```javascript
System.out.println("Escriba su nombre: ");
String nombre = lectura.next(); 
```
- Con este apartado dentro del codigo podemos observar el funcionamiento de la herramienta para imprimir en consola de forma basica con una sentencia escrita en la misma.
- Asi mismo observamos el valor de captura utilizando la palabra lectura para el mismo.
- Realizamos la misma operación para los otros datos que fueron pedidos.

```javascript
String nombreBase64 = Base64.getEncoder().encodeToString(nombre.getBytes());
```
- Como podemos observar usamos la libreria ya mencionada de manera practica en el codigo para la conversión del dato nombre siendo este una cadena de texto a Base 64.
```javascript
        Integer edadEntero = Integer.valueOf(edadTexto);
        Float edadDecimal = Float.valueOf(edadTexto);
```
- Para realizar la conversión de las variables obtenidas en los valores ingresados por el usuario Observamos como se utiliza la creación de una nueva variable de almacenamiento y en esta ingresamos el valor que queremos convertir ya sea para Double,Float o Integer

## GRACIAS
