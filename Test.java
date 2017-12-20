public class Test
{
    /**
     * Test de la clase Todoist
     */
    public void main() 
    {
        System.out.println("Creamos un objeto todoist...");
        Todoist todoist = new Todoist();
        System.out.println("\nMostramos el numero de tareas pendientes...");
        todoist.printNumTareas();
        System.out.println("\nAñadimos una tarea...");
        todoist.addTarea("Limpiar la cocina");
        System.out.println("\nAñadimos otra tarea...");
        todoist.addTarea("Sacar la basura");
        System.out.println("\nAñadimos otra tarea...");
        todoist.addTarea("Dormir la siesta");
        System.out.println("\nMostramos todas las tareas...");
        todoist.mostrarTarea();
        System.out.println("\nEliminamos la segunda tarea...");
        boolean valorDevuelto;
        valorDevuelto = todoist.deleteNumTarea(1);
        System.out.println("El metodo de eliminar anterior devolvio...");
        System.out.println(valorDevuelto);
        System.out.println("\nMostramos todas las tareas...");
        todoist.mostrarTarea();
        System.out.println("\nIntentamos borrar una tarea que no existe...");
        valorDevuelto = todoist.deleteNumTarea(1000);
        System.out.println("El metodo de eliminar anterior devolvio...");
        System.out.println(valorDevuelto);
        System.out.println("\nMostramos todas las tareas...");
        todoist.mostrarTarea();
    }
    public void test2() 
    {
        System.out.println("### Creamos un objeto todoist...");
        Todoist todoist = new Todoist();
        System.out.println("\n### Añadimos 3 tareas...");
        todoist.addTarea("Limpiar la cocina");
        todoist.addTarea("Sacar la basura");
        todoist.addTarea("Dormir la siesta");
        System.out.println("\n### Mostramos todas las tareas...");
        todoist.mostrarTarea();
        System.out.println("\n### Eliminamos la primera tarea que contenga la palabra basura");
        todoist.eliminaPrimeraTareaCoincidente("basura");
        System.out.println("\n### Mostramos todas las tareas para comprobar que se elimino correctamente...");
        todoist.mostrarTarea();
    }
    
    public static void test3() 
    {
        System.out.println("### Creamos un objeto todoist...");
        Todoist todoist = new Todoist();
                
        System.out.println("\n### Añadimos 4 tareas...");
        todoist.addTarea("Limpiar la cocina");
        todoist.addTarea("Sacar la basura");
        todoist.addTarea("Dormir la siesta");    
        todoist.addTarea("Ordenar la basura"); 
        
        System.out.println("\n### Mostramos todas las tareas...");
        todoist.mostrarTareasNumeradas();     
        
        System.out.println("\n### Elimina todas las tareas con 'basura'...");
        todoist.eliminaTodasTareasCoincidentes("basura");
        
        System.out.println("\n### Mostramos todas las tareas (deberian salir 2 tareas...");
        todoist.mostrarTarea();            
    }
}