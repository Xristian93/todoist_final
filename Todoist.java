import java.util.ArrayList;
/**
 * Gestor de tareas
 */
public class Todoist
{
    // Numero indeterminado de tareas
    private ArrayList<Tarea> tareas;

    /**
     * Constructor. Crea un gestor con tres tareas vacias.
     */
    public Todoist()
    {
        tareas = new ArrayList<Tarea>();
    }

    /**
     * Inserta una nueva tarea
     */
    public void addTarea(Tarea nuevaTarea)
    {
        tareas.add(nuevaTarea);
    }

    /**
     * Muestra por pantalla todas las tareas existentes
     */
    public void mostrarTarea()
    {
        System.out.println("Tareas existentes:");
        System.out.println(tareas);
    }

    
    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
        Tarea tareaActual = tareas.get(indiceTarea);
        tareas.set(indiceTarea, tareaActual);
    }
}
