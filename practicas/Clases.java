package practicas;

public class Clases {
    // los atributos son variables de una clase:
    //"Final": sirve para fijar una variable:
    private String _Nombre="";
    public String _Apellido= "";
    public int _Edad;


    /* METODO TIPO STATIC VS PUBLIC
     * Existen metodo y atributos estaticos o publicos:
     * diferencias: static se accede sin craear un objeto de la clase,
     * se accede solo mediante objetos:
     */
    // crear un metodo o funcion static
    static void saludar(String _persona){
        System.out.println("Buen dia: " +_persona);
    }

    // crear un metodo o funcion publica
    public void abrir(){
        System.out.println("Abriendo puerta... ");
    }
    // metodo constructor
    public Clases(String Nombre, String Apellido, int Edad){
        this._Nombre = Nombre;
        this._Apellido = Apellido;
        this._Edad=Edad;
    }

    //get
    public String getNombre(){
        return this._Nombre;
    }
    public String getApellido(){
        return this._Apellido;
    }
    public int getEdad(){
        return this._Edad;
    }

    //setter:
    public void setNombre(String Nombre){
        this._Nombre = Nombre;
    }
    public void setApellido(String Apellido){
        this._Apellido = Apellido;
    }
    public void setEdad(int Edad){
        this._Edad = Edad;
    }


    public static void main(String [] args){
        // crear un objejto de la clase "Clases":
        Clases persona = new Clases("Alberto","Fernandez",20);
        Clases _usuario1 = new Clases("Juan","Andres",22);


        //Usar el metodo Saludar()
        saludar("Juan");

        // modificar o agregar un atributo;
        persona._Edad=22;
        
        //mostrar el contenido de la instancia persona y _usuario;
        System.out.println(persona._Nombre + " : " + persona._Apellido);
        System.out.println(_usuario1._Nombre + " : " + _usuario1._Apellido);

        // accediendo a un metodo tipo publico y estatico:
        persona.abrir();
        saludar("Lucho");

        /*Recordar: El punto "." se usa para acceder a los atributos y métodos del objeto
         * para llamar un meotdo escriba el nombre seguido de (): "main();"
         * Una clase debe tener un nombre de archivo coincidente (Main y Main.java)
         */

    }
}
