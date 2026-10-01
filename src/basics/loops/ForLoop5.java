package basics.loops;

import java.util.Scanner;

/**
 * The problem that we are going to resolve
 * We have a temperature sensor and a
 * fan connected to a microcontroller.
 * We have to program our microcontroller
 * in the following way:
 * 1 whenever the temperature is greater
 * than 40 degrees, turn on the fan
 * 2 otherwise turn it off
 * 
 * @author Alvaro
 * 24 sept 2026
 */
public class ForLoop5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la temperatura actual: ");
            double temperatura = scanner.nextDouble();
            

            boolean ventiladorEncendido = temperatura > 40;
            
            if (ventiladorEncendido) {
                System.out.println("La temperatura supera los 40°C -> Ventilador ENCENDIDO");
            } else {
                System.out.println("Temperatura normal -> Ventilador APAGADO");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}