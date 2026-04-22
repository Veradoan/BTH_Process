/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package applicationprocess;

/**
 *
 * @author Admin
 */


import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Days In Month");
            System.out.println("3. Linear Equation Solver");
            System.out.println("4. Max Of Numbers");
            System.out.println("5. Prime Checker");
            System.out.println("6. Rectangle Area");
            System.out.println("7. Sort Three Number");
            System.out.println("8. Taxi Fare Calculator");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    BasicCalculator basicCalculator = new BasicCalculator();
                    BasicCalculator.CalculatorProcessor calc = basicCalculator.new CalculatorProcessor();

                    System.out.print("Enter first number: ");
                    double a = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    double b = scanner.nextDouble();

                    System.out.print("Enter operator (+, -, *, /): ");
                    char op = scanner.next().charAt(0);

                    String result = calc.thucHienPhepTinh(a, b, op);
                    System.out.println("Result: " + result);
                }

                case 2 -> {
                    DaysInMonth dim = new DaysInMonth();

                    System.out.print("Enter month: ");
                    int month = scanner.nextInt();

                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();

                    System.out.println("Result: " + dim.tinhSoNgay(month, year));
                }

                case 3 -> {
                    LinearEquationSolver solver = new LinearEquationSolver();

                    System.out.print("Enter a: ");
                    double a = scanner.nextDouble();

                    System.out.print("Enter b: ");
                    double b = scanner.nextDouble();

                    solver.new PhuongTrinh(a, b);
                }

                case 4 -> {
                    System.out.print("Nhap a: ");
                    int a = scanner.nextInt();
                    System.out.print("Nhap b: ");
                    int b = scanner.nextInt();
                    System.out.print("Nhap c: ");
                    int c = scanner.nextInt();

                    int max = a;
                    if (b > max) max = b;
                    if (c > max) max = c;

                    System.out.println("So lon nhat cua ba so " + a + ", " + b + ", " + c + " la: " + max);
                }

                case 5 -> {
                    PrimeChecker primeChecker = new PrimeChecker();
                    primeChecker.checkPrime();
                }

                case 6 -> {
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();

                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();

                    double area = RectangleArea.calculateArea(width, height);
                    System.out.println("Rectangle area: " + area);
                }

                case 7 -> {
                    SortThreeNumber sortThreeNumber = new SortThreeNumber();
                    sortThreeNumber.sortNumbers();
                }

                case 8 -> {
                    System.out.print("Enter distance (km): ");
                    double distance = scanner.nextDouble();

                    double fare = TaxiFareCalculator.calculateFare(distance);
                    System.out.println("Taxi fare: " + fare + " VND");
                }

                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        scanner.close();
    }
}
