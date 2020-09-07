# Introducción a Java
___
![java](https://www.manualweb.net/img/logos/java.png)
##### Java se creó como una herramienta de programación para ser usada en un proyecto de set-top-box en una pequeña operación denominada the Green Project en Sun Microsystems en 1991. El equipo (Green Team), compuesto por trece personas y dirigido por James Gosling, trabajó durante 18 meses en Sand Hill Road, en Menlo Park, para desarrollarlo.Java es un lenguaje de programación de propósito general, tipado, orientado a objetos,… que permite el desarrollo desde aplicaciones básicas, pasando por aplicaciones empresariales hasta aplicaciones móviles.

##### Java nacía como un lenguaje de programación que pudiese ser multiplataforma y multidispositivo, bajo el paradigma “Write Once Run Anywhere” (WORA)

##### De esta forma un programa Java escrito una vez podemos ejecutarle sobre diferentes plataformas, siendo soportados los sistemas operativos Windows, MacOs y UNIX. Y a su vez en diferentes tipos de dispositivos.

##### Para poder seguir este paradigma la compilación de un programa Java no genera código fuente, si no que genera bytecodes. Estos bytecodes son interpretados por una máquina virtual o JVM (Java Virtual Machine). Dicha máquina ya está escrita para cada uno de los sistemas operativos en cuestión.

## Características del lenguaje Java
___
### Independiente de Plataforma
##### Cuando compilamos código fuente Java no se genera código máquina específico, si no que se generan bytecodes, los cuales son interpretados por la Java Virtual Machine (JVM), posibilitando que un mismo código fuente pueda ser ejecutado en múltiples plataformas.

### Orientado a Objetos
##### Cualquier elemento del lenguaje Java es un objeto. Dentro de los objetos se encapsulan los datos, los cuales son accedidos mediante métodos.

### Sencillo
##### Java está enfocado para ser un lenguaje fácil de aprender. Simplemente se deberán de entender los conceptos básicos de la programación orientada a objetos (POO).

### Seguro
##### Es seguro ya que los programas se ejecutan dentro de la Java Virtual Machine (JVM) en un formato de “caja de arena”, de tal manera que no pueden acceder a nada que esté fuera de ella.

##### Tiene una validación sobre los bytecodes para comprobar que no hay códigos de fragmento ilegal.

### Arquitectura Neutral
##### Independientemente de que se ejecute en una arquitectura de 32bits o de 64bits. En Java los tipos de datos siempre ocupan lo mismo.

### Portable
##### Java no tiene nada que dependa de la plataforma, lo cual le hace que sea portable a diferentes plataformas.

### Robusto
##### El lenguaje Java intenta controlar las situaciones de error en los procesos de compilación y de ejecución, reduciendo de esta manera el riesgo de fallo.

##### Además Java realiza el control total de la memoria alocándola y retirandola mediante un garbage colletor, de tal manera que no podemos utilizar punteros para acceder a ella.

### Multi-hilo
##### Java nos permite la programación concurrente, de tal manera que un único programa puede abrir diferentes hilos de ejecución.

### Interpretado
##### Los bytecodes son interpretados en tiempo real a código máquina.

### Alto Rendimiento
##### Java ofrece compiladores Just-In-Time que permiten tener un alto rendimiento.

### Distribuido
##### El lenguaje Java está pensando para ser ejecutado en arquitecturas distribuidas, como pueda ser Internet.