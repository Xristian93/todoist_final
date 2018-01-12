import java.util.ArrayList;
/**
 * Clase Tarea
 */
public class Tarea
{
    // Numero indeterminado de tareas
    private String contenido;
    private boolean completada;
    private int prioridad;

    /**
     * Constructor. Crea un gestor con tres tareas vacias.
     */
    public Tarea(String contenido)
    {
        this.contenido = contenido;
        completada = false;
        prioridad = 1;
    }

    /**
     * Devuelve la descripción de la tarea.
     */
    public String getContenido()
    {
        return contenido;
    }

    /**
     * Devuelve toda la informacion de la tarea en formato String
     */
    public String getDatosTarea()
    {
        String aDevolver = contenido + " Prioridad: " + prioridad;
        if (completada) {
            aDevolver = "[X] " + aDevolver;
        }
        else {
            aDevolver = "[ ] " + aDevolver;
        }
        return aDevolver; 
    }

    /**
     * Metodo que devuelve en forma de booleano si la tarea esta completado o no.
     */
    public boolean getTareaCompletada()
    {
        return completada;
    }
    
    /**
     * Metodo que marca la tarea como completada.
     */
    public void setTareaCompletada()
    {
        completada = true;
    }
    
    /**
     * Metodo que devuelve en forma de entero la prioridad de una tarea.
     */
    public int getPrioridad()
    {
        return prioridad;
    }
    
    /**
     * Metodo que cambia la prioridad de una tarea. Si no es un valor legal la prioridad se queda como esta.
     */
    public void setPrioridad(int nuevaPrioridad)
    {
        if (nuevaPrioridad <=5 && nuevaPrioridad >=1){
            prioridad = nuevaPrioridad;
        }
    }
}
