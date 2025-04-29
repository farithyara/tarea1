# Tarea conversiones
## Programación orientada a objetos
### Farith Antonio Segura Yara
### Juan Esteban Garcia Tarquino
### Edwin Mauricio Padilla Pelufo

# Objetivos

- Convertir valores ingresados por un usuario entre los distintos tipos de variables primitivos existentes.

- Observar los rangos de algunos tipos de variables primitivas como lo son (integer,Double,Float)

- Utilizar las herramientas dadas para escanear e imprimir valores por consola en el programa Netbeans

- Evidenciar cómo el código ASCII relaciona los datos enteros con los datos de tipo caracter, y que es posible hacer una conversión entre ellos. 

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

```javascript
 for (int i=0; i < len; i++) {
          int nm_ascii = (int) nombre.charAt(i);
           System.out.print(car+" ");
}
```
- Lo que nos compete acerca del código, principalmente, se encuentra dentro del bucle. "nm_ascii" significa numerical ascii, o sea que lo que nos ayuadará a mostrar dicha variable es el valor numérico asociado a un caracter ASCII. Cada caracter que se usa en ek código ASCII está asociado a un número y viceversa, cada número del código ASCII está asociado a un caracter. Tiene un máximo de 128 caracteres posibles, ya que usa 7 bits para representar todos estos símbolos.

```javascript
int nm_ascii = (int) nombre.charAt(i);
```
- Si prestamos especial atención a este código, nos daremos cuenta de que nm_ascii es una variable de tipo entero. Sin embargo,"nombre.chartAt(i)" es en sí mismo un dato de tipo char, porque está mostrando una letra perteneciente a la cadena que contiene nombre en una cierta posición i. ¿Entonces cómo es posible que una vairable entera tome como identidad un tipo de dato diferente? Por lo que está al frente: "(int)". Esta forma de escritura lo que hace es dictar cuál será el tipo de dato al que convertiremos a otro tipo de dato, en este caso lo convertiremos en entero. Y si convertimos a entero un dato tipo char, obtendremos el número asociado a esa letra o símbolo.  


## GRACIAS
