package applicationprocess;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhap thang va nam
        System.out.print("Nhap thang: ");
        int thang = sc.nextInt();

        System.out.print("Nhap nam: ");
        int nam = sc.nextInt();

        int soNgay = 0;

        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                soNgay = 31;
            case 4, 6, 9, 11 ->
                soNgay = 30;
            case 2 -> {
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
            }
            default -> {
                System.out.println("Thang khong hop le!");
                return;
            }
        }

        System.out.println("In ra: " + soNgay + " ngay");

        sc.close();
    }
}
