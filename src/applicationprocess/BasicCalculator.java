package applicationprocess;
import java.util.Scanner;

public class BasicCalculator {
    public class CalculatorProcessor {

        public String thucHienPhepTinh(double a, double b, char phepTinh) {
            switch (phepTinh) {
                case '+' -> {
                    return a + " + " + b + " = " + (a + b);
                }
                case '-' -> {
                    return a + " - " + b + " = " + (a - b);
                }
                case '*' -> {
                    return a + " * " + b + " = " + (a * b);
                }
                case '/' -> {
                    if (b != 0) {
                        return a + " / " + b + " = " + (a / b);
                    } else {
                        return "Loi: Khong the chia cho 0!";
                    }
                }
                default -> {
                    return "Phep tinh khong hop le!";
                }
            }
        }
    }
}
