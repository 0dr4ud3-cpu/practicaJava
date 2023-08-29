package practicas;

public class Persona {
    private String _Nombre="";
    public String _Apellido= "";
    public int _Edad;

    public Persona(String Nombre, String Apellido, int Edad){
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
    
        Persona _usador = new Persona("Juan", "Alberto", 20);
        System.out.println(_usador.getEdad());
        

    }
}
