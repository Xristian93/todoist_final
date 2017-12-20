import java.util.ArrayList;
/**
 * Gestor de tareas
 */
public class Todoist
{
    // Numero indeterminado de tareas
    private ArrayList<String> tarea;

    /**
     * Constructor. Crea un gestor con tres tareas vacias.
     */
    public Todoist()
    {
        tarea = new ArrayList<String>();
    }

    /**
     * Inserta una nueva tarea
     */
    public void addTarea(String nuevaTarea)
    {
        tarea.add(nuevaTarea);
    }

    /**
     * Muestra por pantalla todas las tareas existentes
     */
    public void mostrarTarea()
    {
        System.out.println("Tareas existentes:");
        System.out.println(tarea);
    }

    /**
     * Devuelve el numero de tareas existentes
     */
    public int getNumTareas()
    {
        return tarea.size();
    }

    /**
     * Imprime por pantalla el numero de tareas pendientes
     */
    public void printNumTareas()
    {
        System.out.println("El numero de tareas pendientes es: " + tarea.size());
    }

    /**
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro (empezando en 0). Devuelve true si elimina una
     * tarea, false en caso contrario
     */
    public boolean deleteNumTarea(int posicionAEliminar)
    {
        boolean valorADevolver = false;
        if(esValidoElIndice(posicionAEliminar)){
            tarea.remove(posicionAEliminar);
            valorADevolver = true;
        }
        return valorADevolver;
    }

    /**
     * Metodo que comprueba si una posicion es valida y devuelve true
     * en caso afirmativo o false en otro caso.
     */
    public boolean esValidoElIndice(int indice)
    {
        return (indice >= 0 && indice < getNumTareas());
    }

    /**
     * Metodo que devuelve true en caso de que haya tareas por hacer, false
     * en otro caso
     */
    public boolean hayTareasPendientes()
    {
        return !tarea.isEmpty();
    }

    /** 
     * Metodo2 que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea.
     */
    public void mostrarTareasNumeradas2()
    {
        int numeroPosicion = 1;
        for (String tarea : tarea){
            System.out.println(numeroPosicion + ". " + tarea);
            numeroPosicion = numeroPosicion + 1;
        }
    }

    /** 
     * Metodo que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea. Si la tarea esta completada, entonces muestra
     * un "[X]" delante de la tarea; si no esta completada muestra un "[ ]"
     */
    public void mostrarTareasNumeradas()
    {
        for(int i=0;i<getNumTareas();i+=1){
            if (tarea.get(i).toLowerCase().contains("Completada".toLowerCase())){
                System.out.println("[X]" + "La tarea " + i + " es " + tarea.get(i));
            }
            else{
                System.out.println("[ ]" + "La tarea " + i + " es " + tarea.get(i));
                }
        }     
    }

    /**
     * Muestra solo las tareas en posiciones impares sin numero delante ni nada,
     * solo la tarea 
     */
    public void mostrarTareasEnPosicionImpar()
    {
        for(int i=1;i<getNumTareas();i+=2){
            System.out.println("La tarea " + i + " es " + tarea.get(i));
        }     
    }

    /**
     * Muestra por pantalla todas las tareas que contienen el texto indicado
     * como parámetro, una en cada linea, y ademas muestra un mensaje al final indicando
     * el numero de coincidencias encontradas. Si no hay ninguna que contenga el texto
     * buscado informa de la situacion. Este metodo es insensible a mayusculas o minusculas
     */
    public void mostrarCoincidentes(String textoIgual)
    {
        int hayCoincidencia = 0;
        for(int i=0;i<getNumTareas();i+=1){
            if (tarea.get(i).toLowerCase().contains(textoIgual.toLowerCase())){
                System.out.println("La tarea " + i + " es " + tarea.get(i));
                hayCoincidencia++;
            }
        }
        if (hayCoincidencia == 0){
            System.out.println("Ninguna tarea contiene el texto indicado");
        }
        else {
            System.out.println("Hay " + hayCoincidencia + " tareas coincidentes");
        }
    }

    /**
     * Muestra por pantalla la primera tarea que contenga el texto indicado como 
     * parametro. En caso de que no haya ninguna coincidencia no muestra nada
     */
    public void mostrarPrimeraCoincidente(String textoIgual){
        for(int i=0;i<getNumTareas();i+=1){
            if (tarea.get(i).toLowerCase().contains(textoIgual.toLowerCase())){
                System.out.println("La primera tarea coincidente es la tarea " + i + ". Que contiene lo siguiente: " + tarea.get(i));
                break;
            }
        }
    }

    /**
     * Muestra por pantalla todas las tareas existentes, una por línea,
     * usando un bucle while
     */
    public void mostrarTareas2()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < tarea.size()) {
            System.out.println(tarea.get(posicionTareaActual));
            posicionTareaActual++;
        }
    }

    /**
     * Muestra las tareas numeradas usando un bucle while
     */
    public void mostrarTareasNumeradas3(){
        int numPosicion = 0;
        while (numPosicion < tarea.size()) {
            System.out.println("La tarea " + (numPosicion+1) + " es " + tarea.get(numPosicion));
            numPosicion++;
        }
    }

    /**
     * Muestra por pantalla las primeras n tareas (siendo n un parametro). En
     * caso de que no haya suficientes tareas muestra solo las que haya.
     */
    public void mostrarNPrimeras(int numTareas){
        int numPosicion = 0;
        while (numPosicion < numTareas && numPosicion < tarea.size()){
            System.out.println("La tarea " + (numPosicion+1) + " es " + tarea.get(numPosicion));
            numPosicion++;
        }
    }

    /**
     * Devuelve true si hay al menos una tarea que contengan el texto indicado
     * como parámetro y false en caso contrario. El metodo se debe ejecutar con un bucle for each.
     */
    public boolean hayTareaCoincidenteForEach(String palabra){
        boolean hayCoincidencia = false;
        for (String tareaActual : tarea){
            if (tareaActual.toLowerCase().contains(palabra.toLowerCase())){
                hayCoincidencia = true; 
            }
        }
        return hayCoincidencia;
    }

    /**
     * Devuelve true si hay al menos una tarea que contengan el texto indicado
     * como parámetro y false en caso contrario. El metodo se debe ejecutar de la
     * forma mas rapida posible.
     */
    public boolean hayTareaCoincidente(String palabra){
        boolean hayCoincidencia = false;
        int i = 0;
        while (!hayCoincidencia && i < tarea.size()){
            if (tarea.get(i).toLowerCase().contains(palabra.toLowerCase())){
                hayCoincidencia = true; 
            }
            i++;
        }
        return hayCoincidencia;
    }

    /**
     * Elimina la primera tarea que contiene el texto indicado por parámetro
     */
    public void eliminaPrimeraTareaCoincidente(String textoABuscar)
    {
        boolean hayCoincidencia = false;
        int i = 0;
        while (!hayCoincidencia && i < tarea.size()){
            if (tarea.get(i).toLowerCase().contains(textoABuscar.toLowerCase())){
                hayCoincidencia = true;
                tarea.remove(i);
            }
            i++;
        }
    }

    /**
     * Elimina todas las tareas que contienen el texto a buscar
     */
    public void eliminaTodasTareasCoincidentes(String textoABuscar) 
    {
        int i = 0;
        while (i < tarea.size()){
            if (tarea.get(i).toLowerCase().contains(textoABuscar.toLowerCase())){
                tarea.remove(i);
            }
            else{
                i++;
            }
        }
    }
    
    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
        String tareaActual = tarea.get(indiceTarea);
        tareaActual += " Completada";
        tarea.set(indiceTarea, tareaActual);
    }
}
