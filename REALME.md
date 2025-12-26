# Proyecto de gramática en VS Code

En este proyecto vamos a encontrar todo lo relacionado con la **gramática**, el **visitor** y demás clases que utilizaremos posteriormente.  
El proyecto finaliza en la parte de **automatizar la ejecución**: la ejecución de ANTLR, la compilación de los ficheros Java y la ejecución del `main`.

Quedaría pendiente implementar la **comunicación entre ANTLR y Webots**; de momento, solo llegamos a resolver ANTLR de forma funcional.

---

## Cómo ejecutar este proyecto

Situados en la carpeta del proyecto, abrimos el terminal de VS Code con `Ctrl + ñ` y ejecutamos los siguientes comandos:
- Es importante asegurarse de que **las librerías de ANTLR4 estén añadidas al proyecto**. 

### 1. Generar las clases con ANTLR

Ejecutamos:

```cmd
antlr4 -no-listener -visitor .\PLATA.g4
```
- **antlr4** hace referencia a un *batch* que tenemos configurado en la ruta correspondiente (`<ruta>`).

- Este comando genera las clases:  
  `PlataParser`, `PlataVisitor`, `PlataLexer` y `PLATABaseVisitor.java`.

- Los parámetros `-no-listener -visitor` indican que **no queremos generar las clases del listener**, ya que recorreremos el árbol usando el patrón **visitor**.

- `.\PLATA.g4` es el archivo donde se define nuestra gramática.  
  En nuestro caso, aquí se encuentra el **parser**, ya que el **lexer** está definido en otro archivo de gramática que es importado por `PLATA.g4`.

> Este comando debe ejecutarse **siempre que se realicen cambios en la gramática**.

### 2. Compilar los archivos Java

A continuación, compilamos todos los archivos Java:

```cmd
javac *.java
```
- Este comando compila todos los ficheros `.java`.  
 
- Este paso debe repetirse siempre que se modifique algún archivo Java.

### 3. Ejecutar el programa principal

Por último, ejecutamos el `main` y le pasamos como parámetro el fichero de datos que queremos procesar:

```cmd
java Main .\datos.arg
```
## Clases
### MiVisitor.java
Esta clase hereda de la clase PLATABaseVisitor y es un intérprete para el lenguaje PLATA, que recorre el árbol de sintaxis generado por ANTLR y ejecuta las instrucciones del programa. `Su principal función es evaluar expresiones aritméticas, lógicas y relacionales, manejar variables, y ejecutar estructuras de control como if, else if, else y bucles while`. También se encarga de verificar errores de ejecución, como operaciones inválidas o variables no definidas.

Además, la clase implementa comandos específicos que simulan las acciones de un tractor: avanzar cierta distancia a una velocidad determinada **(avanza)**, girar un ángulo **(gira)** y detenerse **(para)**. Los resultados de estas acciones se imprimen por consola, sirviendo como una especie de simulación de movimientos, mientras que los valores de las variables y los resultados de las expresiones se almacenan y usan según sea necesario.

### Valor.java
La clase Valor es un contenedor genérico utilizado por el intérprete del lenguaje PLATA para almacenar distintos tipos de datos de manera uniforme, como `Double, Boolean o String`. Su propósito principal es que todas las expresiones en el visitor (`MiVisitor`) puedan devolver un objeto `Valor`, facilitando así la evaluación homogénea de cualquier expresión o sentencia del programa.

`Valor` proporciona métodos de conversión (`asDouble(), asBoolean(), asString()`) que permiten acceder al valor interno en el tipo esperado, y métodos de comprobación (`isDouble(), isBoolean(), isString()`) para verificar el tipo de dato almacenado. Además, incluye un valor especial `VACIO` (similar a `void` en Java) que se utiliza para representar expresiones o sentencias que no devuelven un resultado significativo.

La clase también sobrescribe `equals(), hashCode() y toString()` para permitir comparaciones y representaciones consistentes de los valores almacenados, asegurando que diferentes tipos de datos puedan manejarse de manera segura dentro del intérprete. Esto convierte a `Valor` en un componente central para el manejo dinámico de datos en el lenguaje PLATA.

### PLATAException.java
La clase `PlataException` es una **excepción personalizada** para el lenguaje PLATA que extiende `RuntimeException` y se utiliza para manejar errores específicos del intérprete, como operaciones inválidas, variables no definidas o tipos incompatibles, permitiendo lanzar mensajes claros cuando ocurre un fallo en la ejecución del programa.

### Main.java
La clase Main es el **punto de entrada del intérprete PLATA**. Se encarga de leer un archivo de programa PLATA (o la entrada estándar si no se proporciona archivo), generar los tokens con el lexer, construir el árbol de análisis sintáctico con el parser y luego recorrerlo con `MiVisitor` para ejecutar el programa. Además, imprime el árbol de parseo en consola y lo muestra visualmente en una ventana usando `TreeViewer` de ANTLR, lo que permite depurar y visualizar la estructura del programa.