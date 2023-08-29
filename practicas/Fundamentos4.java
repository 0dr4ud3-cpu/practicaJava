package practicas;
public class Fundamentos4 {
    public static void main(String args[]){
        //arrays: se usa para almacenar multiples valores
        // en una sola variable.

        // crear un array tipo String, int:
        String [] _alumnos={"Juan","Pedro","Luis","Manuel","Gonzalo"};        
        int[]numeros={0,2,3,4,5};
        
        // acceder a un array o matriz:
        System.out.println(_alumnos[3]);
        
        // Cambiar elementos:
        _alumnos[1]="Juan";
        
        //Longitud de una matriz:
        System.out.println(_alumnos.length);
        
        // recorres un array con for-Each
        for (String i : _alumnos ){
            System.out.println(i);
        }

        // recorrer un array con for
        for (int i=0;i<_alumnos.length;i++){
            System.out.println(_alumnos[i]);
        }
    }
    
}
