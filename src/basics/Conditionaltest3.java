package basics;

import java.util.Scanner;

public class Conditionaltest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float money = scanner.nextFloat();
        if(money >= 1000000){
            System.out.println("I will buy a car");
        }
        else if(money < 1000000 && money > 500000){
            System.out.println("I travel more");
        }
        else if(money <= 500000 && money > 100000){
            System.out.println("I would invest all and buy a car");
        }
        else{
            System.out.println("I would eat outside everyday");
        }
    }
}
