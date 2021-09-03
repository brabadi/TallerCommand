package co.edu.unicauca.commandrestaurant.domain;

/**
 * Clase abstracta que representa un Comando cualquieraF
 *
 * @author Astrid Carolina Cruz - Braian Alexis Bastidas
 */
public abstract class Command {

    /**
     * ¿Tiene deshacer?
     *
     */
    protected boolean hasUndo;

    /**
     * Ejecuta el comando
     */
    public abstract void execute();

    /**
     * Dehace el comando
     */
    public abstract void undo();

    public boolean hasUndo() {
        return hasUndo;
    }

    public void setHasUndo(boolean hasUndo) {
        this.hasUndo = hasUndo;
    }

}
