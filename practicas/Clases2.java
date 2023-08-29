package practicas;

public class Clases2 {

    // atributos de la clase
    String _altura = "";
    String _raza = "";    

    // metodo constructor: no puede tener un tipo de retorno como 
    // (    VOID    )
    //crearemos un constructor con parametros:
    public Clases2(String _Altura, String _Raza){
        _altura = _Altura;
        _raza = _Raza;
    }
    // metodo:
    static void ladrar(){
        System.out.println("Ladrando.. ");
    }

    static void dar(){
        System.out.println("dandno mano.. ");
    }
    public void pensar(){
        System.out.println("Pensar... ");
    }

    public static void main(String [] args){

        // usando el metodo constructor:
        Clases2 perro_1 = new Clases2("2M", "Doberman");
        System.out.println( perro_1._raza + " : " + perro_1._altura);

        // modificadores:
        /* La palabra public es bastante usado pero veamos su significado:
         * Public; es un modificador de acceso para clases, atributos, 
         * metodos y constructores.
         * 
         * Dividimos los modificadores en dos grupos:
         * -> modificadores de acceso: controla el nivel de acceso_
         * -> modificadores sin aceeso: no controlan el nivel de acceso, pero proporcionan otras
         * funciones
         * 
         * Modificadores de acceso (Para las Class):
         * public: la clase es accesible por cualquier otra clase..
         * default: solo las clases del mismo paquete pueden acceder a la clase, usado cuando no 
         * se usa un modificador.
         * 
         * Modificadores de acceso (Para Atributos-Metodos-Constructores):
         * Public : El código es accesible para todas las clases.
         * 
         * Private: El código sólo es accesible dentro de la clase declarada
         * 
         * Desfault: Solo se puede acceder al código 
         * en el mismo paquete. Esto se utiliza cuando no se especifica un modificador.
         * 
         * Protected: El código es accesible en el mismo paquete y subclases.
         * 
         * 
         * Modificadores de No Acesso (final o abstract)
         * final: : La clase puede ser heredada por otras clases.
         * abstract: la clase no se puede usar para crear objetos(Para acceder a un 
         * clase abstracta, se debe heredar de otra clase)
         * 
         * Modificadores de no Acceso (atributos y metodos):
         * Final: los atributos y metodos finales no se pueden anular/modificar
         * 
         * Abstract: Solo se puede usar en una clase abstracta y solo se puede usar
         * en métodos. El método no tiene cuerpo, por ejemplo abstract void run();.
         *  El cuerpo lo proporciona la subclase (heredada de).
         * 
         * Trasient: los atributos y metodos se omiten al serializar el objeto que 
         * los contiene.
         * 
         * synchronized: solo se puede acceder mediante un hilo a la vez
         * 
         * volatile: el valor de un atributo no se almacena en un caché localmente y siempre
         * se lee desde la memoria principal.
         */

        // Si no deseamos modificar el valor existente declare "final":
        final String _rut = "26.098.465-9";

        // static: se puede acceder al metodo sin crear un objeto de la clase,
        // a diferencia de public:
        /*
         * static void saludar(){}
         * public void pensar(){}
         */

         /*
          * un abstract metodo pertenece a una abstract clase y no tiene cuerpo. El cuerpo
          lo proporciona la subClase; 

            abstract class Main {
            public String fname = "John";
            public int age = 24;
            public abstract void study(); // abstract method
            }

            // Subclass (inherit from Main)
            class Student extends Main {
            public int graduationYear = 2018;
            public void study() { // the body of the abstract method is provided here
                System.out.println("Studying all day long");
            }
            }
          */

          // get and set: permiten manipulacion de datos privados de otra clase, que producto a 
          // a la encapsulación no se accederia a ellas sin estos metodos publicos;
        
    }
}
