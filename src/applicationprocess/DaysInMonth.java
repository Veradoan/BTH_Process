package applicationprocess;

import java.util.Scanner;

public class DaysInMonth {

    public boolean laNamNhuan(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
    }

    // Phuong thuc tinh so ngay
    public String tinhSoNgay(int thang, int nam) {
        int soNgay = 0;
        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                soNgay = 31;
            case 4, 6, 9, 11 ->
                soNgay = 30;
            case 2 -> {
                if (laNamNhuan(nam)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
            }
            default -> {
                return "Thang khong hop le!";
            }
        }
        return soNgay + " ngay";
    }
}
