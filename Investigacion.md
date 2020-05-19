## ¿Qué son las pruebas unitarias?

Las pruebas unitarias (también test unitarios, o unit testing) son un método de pruebas de software que se realizan escribiendo fragmentos de código que testeará unidades de código fuente. El objetivo es asegurar que cada unidad funciona como debería de forma independiente.
Las pruebas unitarias son las primeras que se realizan ya con código escrito, y las crea el propio desarrollador.
Es importante también tener claro, que las pruebas unitarias, como el resto de pruebas, no demuestran la ausencia de errores en el código, ya que éstos pueden ser errores de integración, rendimiento, etc… que los test unitarios no son capaces de detectar.

## Estructura de las pruebas unitarias

* **Arrange (Organizar):** En esta parte de la prueba, debes establecer las condiciones iniciales para poder realizarla, así como el resultado que esperas obtener. Y esto significa por ejemplo, declarar las variables y crear las instancias de los objetos.
* **Act (Accionar):** Es la parte de ejecución, tanto del fragmento de código de la prueba, como del fragmento de código a testear.
* **Assert (Comprobar):** Por último, se realiza la comprobación para verificar que el resultado obtenido, coincide con el esperado.

## ¿Por qué deberías hacer pruebas unitarias?

* **Resolución de errores más rápida:** Gracias a una detección temprana de los bugs, es más fácil y rápido solucionarlo que cuando existe más código y componentes integrado
* **Sencillez de integración:** Si todos los test unitarios se han superado, no es seguro que los test de integración se superen, pero al menos sabes que no son problemas individuales de algún componente.
* **Localización de errores:** Te será más fácil encontrar donde está el error, ya que cada prueba que falle, al realizarse sobre una unidad de código, indica claramente el componente que falla.

## Framework para pruebas unitarias

Para los diferentes leguajes de porgrmación que exiten, se han desarrollado diferentes framework que te ayudan como programador a realizar estas pruebas para verificar posibles errores que tengas en una sentencia de código, acontinuación algunos de ellos dependiendo el lenguaje 

* PHP
Para PHP dispones de [PHPUnit](https://phpunit.de/documentation.html), está desarrollado por Sebastian Bergmann y es Open source.
Para instalarlo, puedes hacerlo descargando un .phar, o a través de Composer.
También cuenta con una buena documentación.

* Javascript
Para Javascript, existe una mayor variedad de frameworks, entre los que podría destacar [MochaJS](https://mochajs.org/api/mocha) o [JEST](https://jestjs.io/).
En el caso de MochaJS, trabaja tan bien con el front end como con el back end.
Mientras que JEST, destaca por su sencillez.

* Java
Para Java cuentas con [JUnit](https://junit.org/junit5/docs/current/user-guide/), en el momento de escribir el artículo va por su versión 5 y tienen una buena guía de usuario.
