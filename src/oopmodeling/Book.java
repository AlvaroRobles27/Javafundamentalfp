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
