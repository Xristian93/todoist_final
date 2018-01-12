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
     * Cambiar prioridad a la tarea indicada por parametro. Si el usuario indica una posicion no válida, el metodo no
     * hace nada.
     */
    public void cambiarPrioridad(int indiceTarea, int nuevaPrioridad)
    {
        if (indiceTarea >=0 && indiceTarea < tareas.size()){
            tareas.get(indiceTarea).setPrioridad(nuevaPrioridad);
        }
    }

    /**
     * Imprimir datos tareas con porcentajes.
     */
    public void mostrarDatos()
    {
        int numTareasCompletadas = 0;
        for (Tarea tarea : tareas) {
            if (tarea.getTareaCompletada()){
                numTareasCompletadas++;
            }
        }
        int numTareasSinCompletar = tareas.size() - numTareasCompletadas;
        System.out.println("Numero de tareas completadas: " + numTareasCompletadas +
            " Porcentaje de tareas completadas: " + numTareasCompletadas*100/tareas.size() + "%");
        System.out.println("Numero de tareas sin completar: " + numTareasSinCompletar +
            " Porcentaje de tareas sin completar: " + numTareasSinCompletar*100/tareas.size() + "%");
        System.out.println("Numero de tareas totales: " + tareas.size());
    }

    /**
     * Imprime todos los datos de la tarea con mayor prioridad. Si hay empate,
     * imprime la última encontrada.
     */
    public void imprimirMayorPrioridad()
    {
        if (tareas.size() > 0){
            Tarea tareaPrioridadMaxima = tareas.get(0);
            for (Tarea tareaActual : tareas){
                if(tareaActual.getPrioridad() >= tareaPrioridadMaxima.getPrioridad()){
                    tareaPrioridadMaxima = tareaActual;
                }
            }
            System.out.println(tareaPrioridadMaxima.getDatosTarea());
        }
    }
}
