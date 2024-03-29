package solver;

import java.util.Collection;

/**
 * Configuration abstraction for the solver algorithm
 *
 * @author Giovanni Coppola
 */
public interface Configuration {

    /*
     * List here the methods that the configurations of all the
     * puzzles must implement.
     * The project writeup explains that there are other acceptable designs,
     * so use of this interface is not required. However, for full design
     * credit, use of a shared solver that requires the implementation of
     * a certain abstraction from all puzzles is required.
     */

    public boolean isSolution();
    public Collection<Configuration> getNeighbors();

}
