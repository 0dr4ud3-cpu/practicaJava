package practicas;


// para usar clases que tiene utilidad usar import java.util.'clase'
import java.util.Scanner;

// Sintaxis fundamental de Java:
public class Fundamentos{
    public static void main(String args[]){ // linea principal unica

        //Usar metodo println: genera valores o imprime texto
        System.out.println("Bienvenido, por favor ingrese su nombre: ");
        
        //Implementar una clase para capturar datos: "Scanner" 
        Scanner consola = new Scanner(System.in);

        // netLine: espera hasta insertar un dato
        String _usuario = consola.nextLine(); 
        
        // imprimir la variable usuario con dato insertado:
        System.out.println("Saludos: " + _usuario);
        
    
        // podemos crear diferentes tipos de variables:
        /* Variables Java
         * String: Almacena texto, cómo "Hola", los valores están entre comillas dobles 
         * int: almacena enteros (Numeros Enteros), sin decimales, como 123 o -123
         * float: almacena numero de coma flotante, como decimales, como 19.99 o -19.99
         * char: almcena caracteres individuales, como 'a' o 'B'. los valores char en comillas simples
         * boolean: almacena valores con dos estados: verdadero o falso
         */

        // para declarar una variable espicificar el tipo y el valor:
        /*              type variableName = value;            */

        // crear variable tipo string, int:
        String _nombre; // creacion de la variable String: "Respetar mayuculas"
        int _edad; // no es necesario asignarle un valor
        _nombre = "Juan Alberto"; 
        _edad = 20;

        // crear variables finales:
        /*
         * para que la variable no sea modificada y es de solo lectura:
         * use la 'final' , esto declarará como final o constante.
         */

        // aplicar final en variables con datos unicos:
        final String _rut = "26.098.465.9";
        final int numeroCasa = 20;
        
        // otras variables:
        int cantidadFamiliares=5;
        float rut= 26098465-9;

        // imprimir cualquier variable creada:
        System.out.println(_rut);
        System.out.println(numeroCasa);
        System.out.println(_nombre);

        // crear multiples variables:
        String _padre, _madre, _hijo;
        
        // Asignaremos _nombrePadres con el metodo .nextLine()
        System.out.println("Cual es el nombre de tu papá: ");
        _padre = consola.nextLine();
        System.out.println("Cual es el nombre de tu mama: ");
        _madre = consola.nextLine();
        System.out.println("Cual es el nombre de tu nombre: ");
        _hijo = consola.nextLine();
        System.out.println("Hola: "+_hijo+ ", eres hijo de: "+_padre +" Y tu madres es: "+_madre);

        // tipos de datos:
        /*
         * int  - integer - > numeros enteros
         * float  -  Floating -> numeros con parte y decimal
         * boolean  - Boolean -> true or false
         * String  -  Character -> cadenas de texto
         */

        // los tipos de datos se dividen en dos grupos: ->Primitivos -- ->No Primitivos
        /* Tipos de Datos primitivos
         * Especifica el tamaño y el tipo de vairnales y no tiene metodos adicionales
         * Hay 8 tipos de datos primitivos en Java:
         * 
         -> byte : almacena -128 a 127
         -> short : almacena -32,768 a 32,767
         -> int	    4 bytes	- guarda numeros: -2,147,483,648 to 2,147,483,647
         -> long	8 bytes - guarda numeros: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         -> float	4 bytes	- guarda numeros fracciones de  6 a 7 digitos decimales 
         -> double	8 bytes	- Almacena números fraccionarios. Suficiente para almacenar 15 dígitos decimales
         -> boolean	1 bit  -  Almacena valores verdaderos o falsos
         ->char	2 bytes	Almacena un solo carácter/letra o valores ASCII

        */

        // los tipos de numeros primitivos:
        // los tipos de enters: byte, short, int, long.
        // los tipos de como flatante: float y double.

        //tipos de enteros:
        // byte: se usa cuando se sabe el valor ronda entre -128 y 127
        byte edadMascota = 15;

        //shot: puede almacenar desde -32768 hasta 32767
        short gastosMes = 18000;

        //int: capacidad de 2,147,483,648 a 2,147,483,647 save!!
        int precioDepartamento = 50000000;

        //long= -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // este tipo de dato debe terminar con una "L"
        long litroAgua=200L;

        
        //tipos coma flotante:para un numero con decimal 9,99 o 9,12343.
        //debe terminar el valor con una F o D.
        float myNum=5.75f; // precion de 6 a 7 digitos postComa
        double myNum2=19.99d; // precion de 15 digitos postComa

        //boolean: puede tomar los valores true or false
        boolean _resgritrado = true;
        boolean _credito = false;

        // char: almacena un solo caracter: como 'A' o 'c' 
        char _inicial='E';

        //String: usado para una secuencia de caracteres:
        //Tipo de dato no primitivo porque es un objeto y tiene metodos.
        String _instituto="Aiep";



    }
}