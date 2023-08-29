package practicas;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Fundamentos3{
    public static void main(String args []){
        // CondicionesJava y declaraciones if
        /*java soporta las condiones logicas habitules:
         * menor que: a<b
         * mayor o igual que a>=b
         * mayor que a>b
         * menor o igual que a<=b
         * igual a  (a==b)
         * no igual a (a!=b) 
         */

         /*Java tiene las siguientes declaraciones
         condicionales: 
          * if: ejecutará si una condicion se cumple
          * else: ejecutará si la anterior no cumple
          * else if: ejecutará si la segunda es falsa
          * switch: evalua varias condicionales:
          */

        boolean requisito = true;
        var _time = 20;
        if(!requisito){ // repetar las minusculas 
            System.out.println( "Cumple :)");
        }else if(requisito==true && _time==20) {
            System.out.println("Usando else if");
        }
        else{
            System.out.println("No cumple :(");
        }

        // crea un codigo que inserte un numero y use condicionales:
        System.out.println("Seleciona un numero del 1 - 10: ");
        Scanner disparador = new Scanner(System.in);
        int contenido = disparador.nextInt();

        // saca los multiplos del numero:
        if(contenido%2==0){
            System.out.println("Es un numero Par");
        }else if (contenido%3==0){
            System.out.println("es multiplo de 3 ");
        }else if (contenido%5==0){
            System.out.println("Es multiplo de 5: ");
        }


        // short hand if..else
        var _identificacion = (requisito)?"Cumple con dos req":"No cumple requisito";
        var _identificacion2 = (requisito==true && _time==20)?"Cumple con dos req":"No cumple requisito";
        System.out.println(_identificacion);

        // Java switch: sirve para varias declaraciones:
        /* Selecciona uno de los muchos bloques de codigo
         * que se ejecutará
         */
        // usando switch
         switch(_time){
            case (18) :
                System.out.println("Es apto para el ingreso: ");
                break; // que cuando se cumpla la condicion pare el programa
            case (16):
                System.out.println("No cumple con la condicion:");
                break; 
            default: // se ejecutará si no hay coincidencia de casos:
                System.out.println("hace falta mas datos y a mi no me pagan tanto :( ");
         }
        
        // Ciclo While de Java

        /* Bucles:
         * Los bucles pueden ejecutar un bloque de codio siempre que se alcance una
         * condicion especifica, utiles porque ahorran tiempo, reducen errores y hacen
         *  que el codigo sea más logible:  
         */

         //while: recorre un bloque de codigo si la condicion es true:

         boolean _registrado = true;
         var i=0;
         while(i<=5){
            System.out.println( "Esta es la linea: "+i + " : Usando While");
            i++;
         }

         //hacer/Mientras || do/while
         // se ejecutará una vez antes de verificar
         var o=0;
        do{
                System.out.println("Ejecutando do while: " + i + "veces");
                o++;
            }
        while (o<5);

        //For: para recorrer un bloque de codigo:
        for(i=0;i<5;i++){
            System.out.println(i + " : Linea de For");
        }

        // for - break - continue 

        for(i=1;i<50;i++){
            if(i%2==0){
                System.out.println(i+" Este numero es par :)");
                continue;
            }
            else if(i%3==0){
                System.out.println(i+" Este numero es divisible en 3");
                break;
            }
        }


        //Bucles Anidados:
        for(i=0;i<2;i++){
            System.out.println("Fuera: " + i);
            for(i=0;i<5;i++){
                System.out.println("Dentro: "+ i);
            }
        }

        // Creación de array para ser interadas:
        String[] autos = {"Pagani","Audi","Bmw","Ford","mitsubishi","RollRoyce","Lambo"};

        for(String p : autos){
            System.out.println(p);
        }





    }
}
