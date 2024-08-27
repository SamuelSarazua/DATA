import  java.util.ArrayList;
import java.util.List;

public class DATA {
    public static ArrayList ListaDeAlumnos(){

        //LISTA
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Jose", "Lopez", 16));
        alumnos.add(new Alumno("Ana", "Correa", 15));
        alumnos.add(new Alumno("Sergio", "Lopez", 16));
        alumnos.add(new Alumno("Lucia", "Perez", 17));
        alumnos.add(new Alumno("Pablo", "Arizabalaga",16));

        //RETORNAR LA LISTA
        return alumnos;

    }
}
