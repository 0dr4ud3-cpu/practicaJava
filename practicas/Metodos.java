package practicas;

public class Metodos {
    // primer metodo o funcion:
    /*La informacion se puede insertar como parametros, que actuan como variables 
     *  los metodos o funciones se basan en: parametros y argumentos:
     * Valores devueltos: la void palabra clave, indica que el metodo no debe devolver
     * un valor, si de desea un valor devuelta usar un metodo primitivo como:(int,,char,etc)
     * en lugar de "void" usando "return" palabra clave dentro del método; 
     */

    // ejemplo con void:
    static void myMethod(String fnome){
        System.out.println(fnome + "Juan");
    }

    //ejemplo con int
    static int numeros(int fechaNacimiento, int fechaActual){
        return (fechaActual - fechaNacimiento);
        
    }

    // ejemplo de int con parametros y argumentos agregados:
    static void registrado(String _nombre){
        boolean _registrado = true;

        if(_registrado == true && _nombre=="Eduardo"){
            System.out.println( "Ingresando a la pagina... ");
        }else{
            System.out.println("Por favor registrarse");
        }

        System.out.println();
    }

    public static void main(String args[]){
        // usando el metodo y funcion
        myMethod("Eduardo ");
        System.out.println("La edad actual es: " + (numeros(2002,2023)));

        registrado("Eduardo");

        //Ejemplo de recursividad:
        int result = sum(10);
        System.out.println(result);

    }
    public static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }else{
            return 0;
        }
    }
}
