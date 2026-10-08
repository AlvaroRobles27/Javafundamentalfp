package oopmodeling;

/**
 * @author Alvaro
 * @created 08/10/2026
 */
public class Main {
    public static void mian(String[]args){
        Circle c1 = new Circle(2);
        Circle c2 = new Circle();
        System.out.println(c1.circumference());
        System.out.println(c2.circumference());
    }
}
