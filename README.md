# TallerSOLID

## Literal 1 
Al crear la clase Postre se realiza la herencia de una manera correcta cumpliendo el principio de Liskov que cada clase que hereda de otra puede usarse como su padre sin necesidad de conocer las diferencias entre ellas.

## Literal 2
Menciona que hay dos métodos en una clase concreta llamada OperacionesAderezo que pueden ser agregados a la clase padre Postre para que las clases que heredan puedan hacer uso de los mismos. Esto se debe a que se incumplió la Dependency Inversion Principle (DIP) al hacer uso de algunos métodos de una clase no abstracta para modificar los valores de otra clase (en este caso, las clases de Pastel y Helado).

## Literal 3 
Al cambiar los métodos de cálculos y show en otras clases especificas con el fin de separar responsabilidad y no sobrecargar clases aludimos al Principio de Responsabilidad Única

## Literal 4
Este literal alude al Principio de Sustitución de Liskov Donde separamos el enum para generar una jerarquía de clases.

## Literal 5
No se puede elaborar con leche deslactosada un pastel, la clase manejador de leche es quien debe cambiar el tipo de leche haciendo una verificacion y elaborar el pastel con 
la leche descremada, solo se necesita modificar el manejador para su correcto funcionamiento, por lo que se hace referencia al Open/close principle.

## Literal 6
En el metodo main se cambia la implemención de las clases para que funcionen con las correcciones realizadas anteriormente. Cumpliendo de esta forma con todos los princios de SOLID.

