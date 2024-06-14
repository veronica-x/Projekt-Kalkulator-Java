import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosty kalkulator - wykonuje operacje dodawania, odejmowania, mnożenia i dzielenia.");

        System.out.print("Wprowadź pierwszą liczbę: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Wprowadź operację (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Wprowadź drugą liczbę: ");
        double secondNumber = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Błąd: Próba dzielenia przez zero.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Błąd: Niepoprawny symbol operacji.");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("Wynik: " + result);
        }

        System.out.println("Naciśnij Enter, aby zakończyć działanie programu.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
