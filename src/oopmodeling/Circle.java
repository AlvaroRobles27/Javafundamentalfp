package oopmodeling;

/**
 * @author Alvaro
 * @created 08/10/2026
 */
public class Circle {
    //properties or attributes of a class
    private float radius;

    public final float PI = 3.14F;

    //constructors: We use constructors to create object

    /**
     * The main differences between a normal method and
     * a constructor
     */
    /**
     * Constructor of the class with parameters
     * @param radius
     */

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    //behaviours, functions or methods
    private float area(){
        return PI * radius * radius;
    }
    public float circumference(){
        return 2 * PI * radius;
    }
}
