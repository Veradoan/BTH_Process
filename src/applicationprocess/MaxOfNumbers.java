package applicationprocess;
import java.util.*;
public class MaxOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("Nhap c: ");
        int c = sc.nextInt();
        
        int max = a;
        
        if (b > max) {
            max = b;
        }
        
        if (c > max) {
            max = c;
        }
        
        System.out.println("So lon nhat cua ba so " + a + ", " + b + ", " + c + " la: " + max);
        
        sc.close();
    }   
}
