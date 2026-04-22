package applicationprocess;
import java.util.*;
public class LinearEquationSolver {
 public class PhuongTrinh {
    public PhuongTrinh(double a, double b) {
        if (a != 0) {
            double x = -b / a;
            System.out.println("Phuong trinh " + a + "x + " + b + " = 0 co nghiem: x = " + x);
        } else {
            if (b == 0) {
                System.out.println("Phuong trinh 0x + 0 = 0 vo so nghiem");
            } else {
                System.out.println("Phuong trinh 0x + " + b + " = 0 vo nghiem");
            }
        }
    }
 }
}
    