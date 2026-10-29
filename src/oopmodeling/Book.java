package oopmodeling;

/**
 * @author Alvaro
 * @created 16/10/2026
 */
public class Book {

    // Atributo público para modificarlo directo desde Main
    public String category;

    // Resto de atributos
    int id;
    String title;
    String author;
    int year;
    double price;

    // 1. Constructor por defecto vacío
    public Book() {
    }

    // 2. Constructor con 2 parámetros (id y title)
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // 3. Constructor completo con los 6 parámetros
    public Book(int id, String title, String author, int year, double price, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.category = category;
    }
}
public class Main {
    public static void main(String[] args) {

        // Objeto 1: Usando constructor por defecto
        Book b1 = new Book();
        b1.category = "Terror"; // Asignación manual con el punto

        // Objeto 2: Usando constructor con 2 parámetros
        Book b2 = new Book(1, "El Principito");
        b2.category = "Novela Histórica"; // Asignación manual con el punto

        // Objeto 3: Usando constructor completo le pasamos los 6 datos
        Book b3 = new Book(2, "1984", "George Orwell", 1949, 15.50, "Filosofía");

        // Mostrar categorías por consola
        System.out.println("Categoría del libro 1: " + b1.category);
        System.out.println("Categoría del libro 2: " + b2.category);
        System.out.println("Categoría del libro 3: " + b3.category);
    }
}