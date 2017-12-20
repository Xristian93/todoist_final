import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
/**
 * Clase que nos permite seleccionar uno o varios alumnos 
 * aleatoriamente de entre un listado de ellos
 */
public class SelectorAlumno
{
    private ArrayList<String> listaAlumnos;
    /** 
     * Constructor de la clase
     */
    public SelectorAlumno()
    {
        listaAlumnos = new ArrayList<String>();
    }

    /**
     * Añade un alumno
     */
    public void agregarAlumno(String nombreAlumno) 
    {
        listaAlumnos.add(nombreAlumno);
    }

    /**
     * Muestra por pantalla los alumnos añadidos uno por linea
     */
    public void verListadoAlumnos()
    {
        for(int i=0;i<listaAlumnos.size();i+=1){
            System.out.println("El alumno " + i + " es " + listaAlumnos.get(i));
        }
    }

    /** 
     * Muestra por pantalla un alumno aleatoriamente. En caso de no haber alumnos
     * no muestra nada e informa del error.
     */
    public void seleccionarAlumnoAleatoriamente()
    {
        if (listaAlumnos.size() == 0){
            System.out.println("Error, no hay alumno en la lista.");
        }
        else {     
            int numAleatorio = (int)(Math.random()*listaAlumnos.size()-1);
            System.out.println("El alumno " + numAleatorio + " es " + listaAlumnos.get(numAleatorio));
        }
    }

    /**
     * Muestra por pantalla n alumnos seleccionados aleatoriamente. En caso de no haber 
     * alumnos suficientes no muestra ninguno e informa del error.
     */
    public void seleccionarNAlumnosAleatoriamente(int numeroAlumnosASeleccionar)
    {
        ArrayList<String> copiaLista = (ArrayList<String>) listaAlumnos.clone();
        if (copiaLista.size() == 0){
            System.out.println("Error, no hay alumno en la lista.");
        }
        else {     
            if (numeroAlumnosASeleccionar <= copiaLista.size()){
                for(int i=0 ;i<=numeroAlumnosASeleccionar-1;i+=1){
                    Random random = new Random(System.currentTimeMillis());
                    int numAleatorio = random.nextInt(copiaLista.size());
                    System.out.println("Alumno: " + copiaLista.get(numAleatorio));
                    copiaLista.remove(numAleatorio);
                }
            }
            else {
                System.out.println("Error, no puedes sacar mas alumnos de los que hay en la lista.");
            }
        }
    }
    
     /**
     * Añade varios alumnos separados por comas
     */
    public void agregarAlumnos(String nombreAlumnos) 
    {
        ArrayList<String> listaAlumnos2 = new ArrayList(Arrays.asList(nombreAlumnos.split(",")));
        for (String alumno : listaAlumnos2){
            listaAlumnos.add(alumno);
        }
    }
}