# Notación Big O & análisis de complejidad para algoritmos

### By Alex T.H.

<img align="center" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif" alt="javascript" width="1000"/>

### Objetivos de Aprendizaje

- Describir la motivación para usar la notación Big O.
- Explorar las reglas para simplificar Big O.
- Tutorial sobre como derivar la complejidad de los fragmentos de codigo.

#### ¿Por qué usamos Big O?

Bueno como ingenieros de software nuestro objetivo es por supuesto, resolver problemas y para cualquier problema podria haber muchas soluciones y como ingenieros de software queremos asegurarnos de que implementamos y elejimos la mejor solucion, para esto tenemos Big O.

Entonces **_Big O es un marco que podemos usar para juzgar y comparar que soluciones son "mejores" que otras_**.

esto nos lleva a pensar entonces como determinamos que una solucion es mejor que otra?? que es lo que hace que una solucion sea mejor que otra?? a continuacion responderemos esta pregunta.

#### ¿Qué hace que una solución sea "mejor"?

Bueno cuando se trata de Ingenieria de Software o Programacion mas amplia, realmente queremos considerar que nuestros programas y nuestras soluciones en terminos de los recursos que utilizan sean optimos.

Entonces **_Preferimos soluciones que utilicen la menor cantidad de recursos_**.

Y en general estamos preocupados por dos tipos de recursos en especifico estos son:

- Tiempo (Duracion)
- Espacio (Memoria)

Nos encantaria escribir soluciones que utilicen **_la menor cantidad de tiempo para ejecutarse y la menor cantidad de memoria_** y es posible que se refieran a ellos como complejidad de tiempo y complejidad de espacio tambien conocidos como **_complejidad temporal y complejidad espacial_**, por lo general queremos minimizar la complejidad de tiempo y espacio de nuestras soluciones, por lo que a primera vista la cosas pueden parecer sencillas, porque parece que el tiempo y el espacio son dos cosas que definitivamente podemos medir.

Por ejemplo para medir el tiempo podriamos tener un cronometro implementado en nuestro codigo y medir en milisegundos el tiempo que tarda en finalizar una subrutina, de igual manera podriamos medir la cantidad de espacio que mi programa usa en kylobytes o megabytes, sin embargo hay un problema que aun no hemos resuelto.

#### El Problema

Hagamos un pequeño analisis a la complejidad del tiempo, digamos que tenemos el mismo programa y lo ejecutamos en dos computadores diferentes, podemos esperar como resultado una cantidad diferente de tiempo transcurrido cuando se trata de la ejecucion de ese programa, ahora imaginese que ejecuta el mismo programa en una computadora vieja de los años 80 versus una computadora portatil nueva de la era moderna, es claro que se espera que el hardware moderno funcione mucho mas rapido y para empeorar un poco mas las cosas incluso si ejecuto el mismo programa en la misma computadora dos veces seguidas, aun asi podemos esperar ver algunas variantes en la cantidad de tiempo transcurrido de nuestro programa.

En general tenemos que enfrentar este problema
Entonces **_¿Cómo controlamos las diferencias en el hardware y el entorno de la computadora?_**.

A continuacion implementaremos una pequeña subrutina en JavaScript para fundamentar el anterior analisis.

```javascript
const sumArray = (numbers) => {
  let sum = 0;
  for (let i = 0; i < numbers.length; i++) {
    sum += numbers[i];
  }
  return sum;
};

const arrayOfNumbers = [5, 76, 40, 48, 24, 18, 62, 100, 99, 22, 95, 72, 91];
const startTime = new Date();
console.log(sumArray(arrayOfNumbers));
const endTime = new Date();

const elapsedTime = endTime - startTime;
console.log(`Subrutine sumArray finished in ${elapsedTime} ms.`);
```

Resultados obtenidos al ejecutar la subrutina sumArray.

```bash
752
Subrutine sumArray finished in 6 ms.
752
Subrutine sumArray finished in 15 ms.
752
Subrutine sumArray finished in 7 ms.
752
Subrutine sumArray finished in 8 ms.
752
Subrutine sumArray finished in 7 ms.
```

Ahora vemos que no podemos utilizar milisegundos ni segundos, ni kilobytes o bytes para medir la cantidad de tiempo y espacio que tarda en ejecutarse una solucion determinada y como resolvemos este problema?.

#### La Solucion

- La notación Big O puede describir objetivamente la eficiencia del código sin el uso de unidades concretas.
- Concéntrandose en cómo escalan los requisitos de tiempo y espacio
- Prepararse para el peor de los casos

Veamos a continuacion un ejemplos de como podemos usar Big O notation
A continuacion tenemos la implementación de un subrutina que calcula el promedio de un array de numeros.

```javascript
const calculateAverage = (numbers) => {
  let sum = 0;
  for (let i = 0; i < numbers.length; i++) {
    let number = numbers[i];
    sum += number;
  }
  return sum / numbers.length;
};

console.log(calculateAverage([5, 76, 40, 48]));
```

Dado el siguiente ejemplo y considerando que cada iteracion del bucle for aumenta la complejidad podemos decir que al respuesta correcta es :

$O(n)$ , donde $n$ es la longitud de la matriz de entrada

#### Simplificando Big O

[Continuar Aprendiendo Big O dando click aqui ](https://coderbyte.com/video/the-complete-guide-to-big-o-notation-part-1-of-2)
