Práctica 4: Manipulación de Arreglos e Interfaces en Java
Tareas (Laboratorio 4) | Autor: Eduardo Alejandro Sánchez Moya

Este proyecto implementa un sistema de gestión de usuarios que demuestra el uso avanzado de Programación Orientada a Objetos, específicamente la implementación de interfaces para manipular estructuras de datos (arreglos) y el uso de clases abstractas para modelar jerarquías.

Objetivo
Desarrollar una aplicación en Java que implemente la interfaz `arregloInterface` para gestionar un arreglo de objetos `Empleado`. El objetivo es aplicar lógica de programación para invertir, agregar, buscar y eliminar elementos manualmente, además de gestionar excepciones y herencia mediante una clase base abstracta `Usuario`.

Descripción
El proyecto consta de dos partes principales:
1. Modelo de Usuarios:
   - Una clase abstracta `Usuario` que define la estructura base y valida datos (nombre y correo) en el constructor.
   - Clases concretas `Empleado` y `Administrador` que heredan de `Usuario` e implementan el método abstracto `mostrarMenu`.

2. Lógica de Negocio (ManejadorLista):
   - Implementa la interfaz `arregloInterface`.
   - Realiza operaciones sobre arreglos de `Empleado` sin usar listas dinámicas (ArrayList), manipulando los índices y tamaños manualmente para:
     - Invertir: Regresa una copia del arreglo en orden inverso.
     - Agregar: Crea un nuevo arreglo de tamaño n+1 para insertar un elemento.
     - Eliminar: Genera un arreglo de tamaño n-1 excluyendo el índice seleccionado.
     - Buscar: Retorna el elemento en una posición específica.

Tecnologías utilizadas
- Lenguaje: Java
- Conceptos POO: Interfaces, Clases Abstractas, Herencia, Polimorfismo.
- Manejo de Errores: Bloques `try-catch` para capturar `IllegalArgumentException` e `IndexOutOfBoundsException`.

Estructura del Proyecto
- `src/interfaces/arregloInterface.java`: Define los métodos contractuales para manipular el arreglo.
- `src/modulos/Usuario.java`: Clase padre abstracta con validaciones de entrada.
- `src/ManejadorLista.java`: Clase que contiene la lógica para manipular el arreglo de empleados.
- `src/Main.java`: Clase principal que ejecuta las pruebas de funcionalidad.

Instrucciones de ejecución
Descargar las carpetas:
Compilar el código: 
Es necesario compilar todos los archivos respetando los paquetes. 
Desde la carpeta src, ejecuta:
`javac Main.java ManejadorLista.java interfaces/*.java modulos/*.java`
Ejecutar el programa: Desde la carpeta src:
`java Main`
