package applicationprocess;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        System.out.print("Chon phep tinh (+, -, *, /): ");
        char phepTinh = sc.next().charAt(0);

        System.out.print("Ket qua: ");
        switch (phepTinh) {
            case '+' -> System.out.println(a + " + " + b + " = " + (a + b));
            case '-' -> System.out.println(a + " - " + b + " = " + (a - b));
            case '*' -> System.out.println(a + " * " + b + " = " + (a * b));
            case '/' -> {
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Loi: Khong the chia cho 0!");
                }
            }
            default -> System.out.println("Phep tinh khong hop le!");
        }
        
        sc.close();
    }
}
