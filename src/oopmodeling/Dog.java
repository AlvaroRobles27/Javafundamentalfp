package oopmodeling;

/**
 * @author Alvaro
 * @created 15/10/2026
 */

public class Dog {

    private String name;
    private String breed;
    private int age;
    private String color;
    private double weight;

    // Constructor que recibe todos los datos del perro
    public Dog(String name, String breed, int age, String color, double weight) {
        // Guardamos los datos recibidos en las variables del perro
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = "Desconocido";
        this.weight = 0.0;
    }

    public Dog(String name) {
        this.name = name;
        this.breed = "Desconocida";
        this.age = 0;
        this.color = "Desconocido";
        this.weight = 0.0;
    }
}
