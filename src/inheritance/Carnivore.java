package inheritance;

/**
 * @author K Srinivaslu.
 */
public interface Carnivore {

    default void eatMeat() {
        System.out.println("Eating meat");
    }
}
