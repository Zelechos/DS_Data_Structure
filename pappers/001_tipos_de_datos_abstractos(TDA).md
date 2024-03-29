# Tipos de Datos Abstractos (TDA)

### By Alex T.H.

<img align="center" src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif" alt="javascript" width="1000"/>

#### En ciencias de la computacion un **_Tipo de Dato Abstracto(TDA)_** o **_Tipo Abstracto de Datos(TAD)_** es un modelo matematico compuesto por una coleccion de operaciones definidas sobre un conjunto de datos para el modelo.

- **TDA:** para la definición y representación de tipos de datos (valores + operaciones), junto con sus propiedades.
- **Objetos:** Son TDA a los que se añade propiedades de reutilización y de compartición de código.

##### Un TDA tambien puede definirse mediante la ecuacion :

```
TDA = Representacion(Datos) + Operaciones(Metodos)
```

### Ejemplos de TDA en Java

clase **point.java** que sera nuestro TDA para este ejemplo.

```java
/*
 * @Author : Alex T.H.
 * @Repositorio : https://github.com/Zelechos/DS_Data_Structure
 */
package TDA;

// La clase point es nuestro TDA
public class Point {

    private int coordinateX, coordinateY, coordinateZ;
    private String dimension;


    public Point(int coordinateX, int coordinateY){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Point(int coordinateX, int coordinateY, int coordinateZ){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    public Point(){
        this.coordinateX = 0;
        this.coordinateY = 0;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateX;
    }

    public int getCoordinateZ() {
        return coordinateZ;
    }

    public String getDimension(){
        return  dimension;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setCoordinateZ(int coordinateZ) {
        this.coordinateZ = coordinateZ;
    }


    public void setDimension(String dimension){
        this.dimension = dimension;
    }

}

```

y tambien tenemos nuestra clase **main.java**

```java
/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DS_Data_Structure
 */
package TDA;

public class main {

    public static void main(String[] args) {

//        Instanciamos nuestro TDA es que el point
        Point instance = new Point();
        instance.setCoordinateX(9);
        instance.setCoordinateY(99);
        instance.setCoordinateZ(999);
        instance.setDimension("3D");
        System.out.println("Dimension : " + instance.getDimension());
        System.out.println("Coordinate X: " + instance.getCoordinateX());
        System.out.println("Coordinate Y: " + instance.getCoordinateY());
        System.out.println("Coordinate Z: " + instance.getCoordinateZ());

    }

}
```

Un TDA está caracterizado por un conjunto de operaciones (funciones) al cual se denomina usualmente como interfaz pública y representa el comportamiento del TDA; mientras que la implementación como la parte privada del TDA está oculta al programa cliente que lo usa. Todos los lenguajes de alto nivel tienen predefinidos TDA; que son los tipos denominados simples y las estructuras predefinidas, y estos tienen sus interfaces públicas que incluyen las operaciones como la +, -, \*, etc.

No se necesita conocer como actúan tales operadores sobre la representación interna de los tipos definidos, que además, suele ser una implementación bastante dependiente de la máquina sobre la que trabaje el compilador. Lo interesante es que los lenguajes actuales nos van a permitir ampliar los TDA predefinidos con otros que serán definidos por el propio programador para adecuar así los tipos de datos a las necesidades de los programas.

Los TDA que nos van a interesar de ahora en adelante son aquellos que reflejen cierto comportamiento organizando cierta variedad de datos estructuradamente. A esta forma estructurada de almacenar los datos será a la que nos refiramos para caracterizar cada TDA.

Los TDA que tienen informaciones simples pero dependientes de un comportamiento estructural serán llamados políticos y aquellos TDA simples, como son los tipos predefinidos donde la información no es relacionada mediante ninguna estructura y no admiten más que un valor en cada momento será denominados TDA monolíticos.

Nótese que cuando hablemos de un TDA no haremos ninguna alusión al tipo de los elementos sino tan solo a la forma en que están dispuestos estos elementos. Solo nos interesa la estructura que soporta la información y sus operaciones. Para determinar el comportamiento estructural basta con observar la conducta que seguirán los datos.

Caractericemos entonces los TDA. Un TDA tendrá una parte que será invisible al usuario la cual hay que proteger y que se puede decir que es irrelevante para el uso del usuario y está constituida tanto por la maquinaria algorítmica que implemente la semántica de las operaciones como por los datos que sirvan de enlace entre los elementos del TDA, es decir, información interna necesaria para la implementación que se esté haciendo para ese comportamiento del TDA. Resumiendo podemos decir, que tanto la implementación de las operaciones como los elementos internos del TDA serán privados al acceso externo y ocultos a cualquier otro nivel.

Un TDA representa una abstracción:

- Se destacan los detalles (normalmente pocos) de la especificación (el qué).
- Se ocultan los detalles (casi siempre numerosos) de la implementación (el cómo).

#### Algunos ejemplos del uso de TDA en programación son:

- Conjuntos: implementación de conjuntos con sus operaciones básicas (unión, intersección y diferencia), operaciones de inserción, borrado, búsqueda...
- Árboles Binarios de Búsqueda: Implementación de árboles de elementos, utilizados para la representación interna de datos complejos. Aunque siempre se los toma como un TDA separado son parte de la familia de los grafos.
- Pilas y Colas: Implementación de los algoritmos FIFO y LIFO.
- Grafos: Implementación de grafos; una serie de vértices unidos mediante una serie de arcos o aristas.

[Referencia de TDA](https://es.wikipedia.org/wiki/Tipo_de_dato_abstracto)
