# TallerSOLID

##Literal 1

##Literal 2
Menciona que hay dos métodos en una clase concreta llamada OperacionesAderezo que pueden ser agregados a la clase padre Postre para que las clases que heredan puedan hacer uso de los mismos.
Esto se debe a que se incumplió la Dependency Inversion Principle (DIP) al hacer uso de algunos métodos de una clase no abstracta para modificar los valores de otra clase (en este caso, las clases de Pastel y Helado).

##Literal 3 
Al cambiar los métodos de cálculos y show en otras clases especificas con el fin de separar responsabilidad y no sobrecargar clases aludimos al Principio de Responsabilidad Única

##Literal 4
Este literal alude al Principio de Sustitución de Liskov Donde separamos el enum para generar una jerarquía de clases.

##Literal 5
Hay una restriccion de que un pastel no se puede elaborar con leche deslactosada, la clase manejador de leche es quien debe cambiar el tipo de leche haciendo una verificacion
y elaborar el pastel con la leche descremada, solo se necesita modificar el manejador para su funcionamiento, por lo que se hace referencia al Open/close principle
