package Section09.AbstractClasses.Section01.AbstractClasses;

/**
 * @author Raffi
 */

/*Notice the abstract keyword.*/
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void breathe();

    public String getName() {
        return name;
    }
}
