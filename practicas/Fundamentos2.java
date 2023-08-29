package practicas;
public class Fundamentos2 {
    public static void main(String arg[]){
        
        /*Conversion de Tipos Jaava 
         * ampliacion de conversion(Automaticamente): de pequeño a grande 
         * Reduccion de conversion(Manualmente):de grande a pequeño
        */

        //Ampliación de Fundición, pasa automatico de pequeño a grande
        int myInt = 9;
        double myDouble = myInt; //Transformacion automatica

        // estrechamiento de Fundición: se realiza colocando el tipo de dato
        // delante del valor
        double myDouble2=2.78d;
        int myInt2=(int) myDouble2;
        System.out.println(myDouble);       
        System.out.println(myDouble2);

        // Operadores Java: usado en variables y valores:

        /* Java divide los operador en los siguientes grupos:
         *  Operadores aritmeticos : + , - , * , / , % , ++ , --
         *  Operadores de Asignacion : ' = ' , += , -= 
         * Operadores de Compracion
         * Operadores Logicos
         * Operadores bit a bit
         */
        
        // Operadores Aritmeticos:
        int x = 100+50; // '+' suma: valores y variables:
        int sumar =100+20;        
        int sumar2 = x + sumar;
        int sumar3 = sumar2 +200;


         // operadores de Asignación
         int x1=10; // asignamos 10
         System.out.println(x1);

         x1+=5; // sumamos un total de 5
         System.out.println(x1);

         x1/=3; // al total dividimos entre 3
         System.out.println(x1);

         x1 -=2; // Al total x1 restamos un 2
         System.out.println(x1);

         x1*=3; // x1 multiplicado por 3
         System.out.println(x1);


        /*Otros operadores:
         * %=
         * &=
         * |=
         * ^=
         * >>=
         * <<=
         */

         // Operadores de comparación
         /*
          + == : X == X
          + != : x distinto de y
          + > : z menor de y
          + < : z mayor de y
          + >= : A menor o igual que B
          + <= : B es mayor o igual que A
         */

         //Operadores Logicos:
         /*
         && : ejecuta si ambos true o false x>5 && x<10 
         || : ejecuta si ambos es verdadero false 1>5 || 20<10
         ! :  ejecuta si no es 
          */

         // Cadenas en Java: String usadas para almacenar text
         var _Ubicacion="Juan Aguirre Cerda";
         
         // length: metodo que permite contar la longituf de la cadena:
         System.out.println("La longitud de la cadena es: "+_Ubicacion.length());

         // mas metodos de cadena: toUppercase() y toLowerCase():
         String _Nombre= "EDUARDO";
         String _Apellido = "andres callejon azul";

         //toLowerCase: Transforma el texto en minuscula;
         System.out.println(_Nombre.toLowerCase());
        //toUpperCase: Transforma el texto en ;
         System.out.println(_Apellido.toUpperCase());
         //indexOf(): devuelve el indice (la posicion), del texto a buscar
         System.out.println(_Apellido.indexOf("callejon"));
 
         //Cantenacion de cadenas de Java

         // el operador "+" usada en concatenar para combinarlas
        String _pruebaString = "Juan";
        String _pruebaString2 = "Alvares Sosa";
        // Primera forma de concatenar: "   +   "
        System.out.println(_pruebaString+" : "+_pruebaString2);
        // Segunda forma de concatenar: concat():
        System.out.println(_pruebaString.concat(_pruebaString2));

        var _pruebaStrin3="Callejon esquina doblada";
        var _edad = 2;
        System.out.println(_pruebaStrin3+_edad);

        // Cadenas especiales:
        // String _text= "Caminando con el sol en la "patas"  ○"; 
        // nos generaría un error..

        // caracter de scape invertida: 
        String _text= "Caminando con el sol en la \"patas\" ○ ";       
        System.out.println(_text);

        /*
         *  \' 
         *  \"
         *  \\
         */
        String _text2= "Caminando \n con el \r sol \ten \bla patas\f ○ ";  
         System.out.println(_text2);
        
         /*
          * 
            Resultado en codigo
            \n	Nueva linea
            \r	Retorno de carro	
            \t	pestaña
            \b	retroceso	
            \f	avance de formulario
          */

          //Java Math: es una clase con muchos metodos, 
          // permiten realizar diversas tareas con numeros;
          var _num1=20;
          var _num2=22;
          var _num3=3;
          int _edadUsuario=64;
          //Math.max(x,y): encontrar el valor más alto;
          System.out.println("El numero mayor es: " + Math.max(_num1, _num2 ));

          //Math.min(x,y): encontrar el valor más bajo;
          System.out.println("El numero menor es: " + Math.min(_num2, _num3));

          //Math.sqtr(x): raiz cuadrada de(x);
          System.out.println("La raiz de "+ _edadUsuario + " es: "+ Math.sqrt(_edadUsuario));
        

          //Bool de java: tiene valores de: true a false:
          //si - no && encendido - apagado && verdadero && falso
          int _caramelos = 200;
          int _paletas = 250;
          boolean _credito = true;
          boolean _efectivo = false;
          System.out.println(_caramelos >= _paletas );
          System.out.println(_caramelos == _paletas );

          // aplicando lo aprendido con condiconales logicas:
          if(_credito==true && _efectivo==true){
            System.out.println( "Estamos con cretido disponible: :)");
          }else if(_credito==true || _efectivo==true){
            System.out.println("Realizando transferencia de pago: ");
          }
          else{
            System.out.println("Necesita recargar la tarjeta: ");
          }
          

    }
    
}
