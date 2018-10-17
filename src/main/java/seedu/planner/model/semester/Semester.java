package seedu.planner.model.semester;

import java.util.ArrayList;
import java.util.List;

import seedu.planner.model.module.Module;

//@@author Hilda-Ang

/**
 * Represents a Semester in the module planner.
 * Holds the list of modules taken and the list of modules available for
 * that semester.
 *
 * A semester can be characterised by the year it is in, and whether it is
 * the first or second semester in that year.
 */
public class Semester {

    /** Constant for the first index. */
    public static final int FIRST = 1;

    /** Constant for the second index. */
    public static final int SECOND = 2;

    // Basic information
    private final int index;
    private final int year;

    // Indicator of whether user has passed the index
    private boolean hasBeenTaken;

    // Modules lists
    private List<Module> modulesTaken = new ArrayList<Module>();
    private List<Module> modulesAvailable = new ArrayList<Module>();

    /**
     * Constructs a {@code Semester}.
     *
     * @param year A valid year
     * @param index A valid index
     * @param hasBeenTaken Whether the semester has been taken
     */
    public Semester(int year, int index, boolean hasBeenTaken) {
        this.year = year;
        this.index = index;
        this.hasBeenTaken = hasBeenTaken;
    }

    //TODO: change dummy implementation
    /**
     * Adds one or more module(s) to the list of modules taken.
     *
     * @param modules A non-empty list of modules to be added
     */
    public void addModules(List<Module> modules) {
        this.modulesTaken = modules;
    }

    //TODO: change dummy implementation
    /**
     * Adds one or more modules(s) to the list of modules available.
     *
     * @param modules A non-empty list of modules to be added
     */
    public void addAvailableModules(List<Module> modules) {
        this.modulesAvailable = modules;
    }

    /**
     * Deletes one or more module(s) from list of modules taken if present.
     *
     * @param modules A non-empty list of modules to be deleted
     */
    public void deleteModules(List<Module> modules) {

    }

    /**
     * Changes the {@code Semester}'s status from currently being taken
     * to taken.
     */
    public void archive() {
        this.hasBeenTaken = true;
    }

    /**
     * Returns the list of modules taken in this semester.
     *
     * @return A list of modules taken
     */
    public List<Module> getModulesTaken() {
        return modulesTaken;
    }

    /**
     * Returns a list of modules that the user is available to take
     * in this semester.
     *
     * @return A list of available modules
     */
    public List<Module> getModulesAvailable() {
        return modulesAvailable;
    }
}