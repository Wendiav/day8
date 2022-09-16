package Operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Säg en siffra:");
        int a = scanner.nextInt();
        System.out.println("Säg en till siffra:");
        int b = scanner.nextInt();
        System.out.println("Säg en sista siffra");
        int c = scanner.nextInt();

        System.out.println("nu ska vi vilkadina siffror som är störst");
        System.out.println("Dina siffor är: " + a + "," + b + "och" + c);

        if (c > a && c > b) {

            //kommer bara köras om utrrycket i () == true
            System.out.println(c + " är den första siffran");
        }else if (a > b && a > c) {

            System.out.println(a + "är den största siffran");
        } else {

        }
        System.out.println(b + "är den största siffran");
    }
}
