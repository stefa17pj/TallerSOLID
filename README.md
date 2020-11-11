# TallerSOLID

El literal #2 menciona que hay dos métodos en una clase concreta llamada OperacionesAderezo que pueden ser agregados a la clase padre Postre para que las clases que heredan puedan hacer uso de los mismos.
Esto se debe a que se incumplió la Dependency Inversion Principle (DIP) al hacer uso de algunos métodos de una clase no abstracta para modificar los valores de otra clase (en este caso, las clases de Pastel y Helado).

