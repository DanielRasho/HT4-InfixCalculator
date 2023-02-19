# Hoja de Trabajo 4

Elaborado con java 17 y maven.

**Código fuente:**  [*Aquí*](https://github.com/DanielRasho/HT4-InfixCalculator/tree/main/App_main/src/main/java)

**Unit Test:** [*Aquí*](https://github.com/DanielRasho/HT4-InfixCalculator/tree/main/App_main/src/test/java/App_main)

## Integrantes

- Daniel Rayo 22933

- Angela Rossana 22869

- Edwing de León 22809 

- Diego Linares 221256

## Singleton SI o NO? 🤨

Se termino usando Sigleton para la clase `Controller` como una medida para asegurar que no hubiera más de un controlador del programa en toda la ejecución. 

Las ventajas que tiene usar este patrón son: 
- Permite un acceso global a la instancia
- Uso limitado del número de instancias
- Garantizar que solo haya una instancia de la clase en el programa

Mientras que las desventajas de usarlo son: 
- Si se necesita multiples instancias de una clase genera problemas
- A la hora de probarlo es difícil, por ser una instancia única puede interferir con otras pruebas.

Y de su uso se puede concluir que el patrón Sigleton es muy fácil de implementar, pero su uso indiscriminado puede ser contrapoducente, porque dificulta el testeo con Pruebas Unitarias, Y SOLO POCAS clases necesitan instanciarse una sola vez. 

Por lo cual se puede decir que es un buen patrón de usar siempre y cuando se usa cuando se tenga que garanticar que solo exista una instancia de una clase en el programa.

---

## Cómo ejecutarlo?

1. Escribir los **operaciones matemáticas** para trabajar en un fichero.

2. Ejecutar de contenido en `Calculadora.jar` con el siguiente comando:
   
   ```javascript
   java -jar <Projecto.jar> <Ruta de archivo con operaciones>
   Ejemplo:
   java -jar Calculadora.jar ./operaciones.txt
   ```

![](media/howToUse.gif)

## Nota
- En caso que no corra el archivo .jar, deberá correr primero Java(TM) Platform SE binary para que Java reconozca el archivo

![](media/jarr.gif)

## UML

![](./classesUML.png)  
