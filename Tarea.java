import java.util.ArrayList;
/**
 * Clase Tarea
 */
public class Tarea
{
    // Numero indeterminado de tareas
    private String contenido;
    private boolean completada;

    /**
     * Constructor. Crea un gestor con tres tareas vacias.
     */
    public Tarea()
    {
        contenido = "";
        completada = false;
    }

    /**
     * Metodo que devuelve en forma de booleano si la tarea esta completado o no.
     */
    public boolean getTareaCompletada()
    {
        return completada;
    }
}
