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

Se termino usando Sigleton para la clase `Controller` como una medidad para asegurarse que no hubiera más de un controlador del programa en toda la ejecución. 

Y de su uso se puede concluir que el patrón Sigleton es muy facil de implementar, pero su uso indiscriminado puede ser contrapoducente, porque dificulta el testeo con Pruebas Unitarias, Y SOLO POCAS clases necesitan instanciarse una sola vez.

---

## Cómo ejecutarlo?

1. Escribir los **operaciones matemáticas** para trabajar en un fichero.

2. Ejecutar de contenido en `Calculadora.jar` con el siguiente comando:
   
   ```javascript
   java -jar <Projecto.jar> <Ruta de archivo con operaciones>
   Ejemplo:
   java -jar Calculadora.jar ./datos.txt
   ```

![](media/howToUse.gif)

##Nota
- En caso que no corra el archivo .jar, deberá correr primero Java(TM) Platform SE binary para que Java reconozca el archivo

## UML

![](./classesUML.png)  
