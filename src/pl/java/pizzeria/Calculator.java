package pl.java.pizzeria;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int dzielnik = 0;
        int dzielna = 0;
        int dzielenieWynik = 0;
        try {
            System.out.println("Podaj dzielną z zakresu od 20 do 50");
            Scanner odczyt = new Scanner(System.in);
            dzielna = odczyt.nextInt();

            System.out.println("Podaj dzielnik z zakresu od 0 do 5");
            odczyt = new Scanner(System.in);
            dzielnik = odczyt.nextInt();

            dzielenieWynik = podziel(dzielna, dzielnik);
        } catch (DividedByZeroException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Nieznany błąd " + ex.getMessage());
        } finally {
            System.out.println(dzielenieWynik);
        }
    }

    private static int podziel(int a, int b) throws DividedByZeroException {
        if (b == 0) {
            throw new DividedByZeroException("O nie dzielisz przez zero!");
        } else {
            return a / b;
        }
    }
}
