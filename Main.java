import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList Alumnos = DATA.ListaDeAlumnos();

        for (Object cadaObjeto : Alumnos){
            System.out.println(cadaObjeto);
        }
    }
}