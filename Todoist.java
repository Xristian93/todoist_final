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
     * Añade una tarea
     */
    public void addTarea(String tarea)
    {
        Tarea nuevaTarea = new Tarea(tarea);
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
     * Mostrar tareas numeradas
     */
    public void mostrarTareasNumeradas()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < tareas.size()) {
            System.out.println((posicionTareaActual+1) + ". " + tareas.get(posicionTareaActual).getDatosTarea());
            posicionTareaActual++;
        }
    }

    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
        tareas.get(indiceTarea).setTareaCompletada();
    }
    
    /**
     * Cambiar prioridad a la tarea indicada por parametro.
     */
    public void cambiarPrioridad(int indiceTarea, int nuevaPrioridad)
    {
        tareas.get(indiceTarea).setPrioridad(nuevaPrioridad);
    }
}
