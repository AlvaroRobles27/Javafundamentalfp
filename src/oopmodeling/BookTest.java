package oopmodeling;

/**
 * @author Alvaro
 * @created 29/10/2026
 */
public class BookTest {


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
