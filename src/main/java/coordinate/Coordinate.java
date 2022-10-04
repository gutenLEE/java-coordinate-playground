package coordinate;

/**
 * @author gutenlee
 * @since 2022/10/04
 */
public abstract class Coordinate {

    public static final int X = 0;
    public static final int Y = 1;

    abstract boolean validate(String input);

    abstract double length();

    abstract void print();

}
