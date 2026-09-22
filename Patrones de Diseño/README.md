Patrones de Diseño
Objetivo del proyecto

El objetivo de este proyecto es implementar diferentes patrones de diseño de software mediante ejemplos prácticos, con el fin de comprender su estructura y funcionamiento.

Patrones implementados
###Singleton

El patrón Singleton tiene como objetivo garantizar que una clase tenga una única instancia durante la ejecución de la aplicación y proporcionar un punto de acceso global a dicha instancia.

En este proyecto se implementó mediante la clase singletonConfig, que permite administrar una configuración general de la aplicación, como el idioma y el tema.

La implementación utiliza un constructor privado, una instancia estática y el método getInstancia() para controlar la creación y el acceso a la única instancia.

Instrucciones para ejecutar los ejemplos
Requisitos

Para ejecutar el ejemplo se necesita:

Tener instalado Java JDK.
Tener Visual Studio Code con la extensión de Java instalada.
Ejecución
Abrir el proyecto en Visual Studio Code.
Ubicar la carpeta src/Singleton.
Dentro de esta carpeta se encuentran las clases singletonConfig.java y MainSingleton.java.
Abrir el archivo MainSingleton.java.
Ejecutar el método main.
Observar el resultado en la consola.

El programa mostrará la configuración inicial, permitirá modificarla y comprobará que las diferentes variables hacen referencia a la misma instancia del Singleton.