public class Alumno {

    //Propiedades
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private int grado;

    //Metodo Constructor
    public Alumno(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Getters
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    //Setters
    public void  setNombre(String nombre){
        this.nombre = nombre;
    }

    public void  setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
