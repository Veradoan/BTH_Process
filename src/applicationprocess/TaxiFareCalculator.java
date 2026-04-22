/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applicationprocess;

/**
 *
 * @author Admin
 */
public class TaxiFareCalculator {
  
   
    public static double calculateFare(double distance) {
        double totalFare = 0;

        if (distance <= 0) {
            return 0;
        } else if (distance <= 1) {
            // First kilometer: 15,000 VND
            totalFare = 15000;
        } else if (distance <= 30) {
            // From 2km to 30km: 13,500 VND per km
            totalFare = 15000 + (distance - 1) * 13500;
        } else {
            // From 31km onwards: 11,000 VND per km
            // 15,000 (1st km) + 391,500 (next 29km) + remaining km * 11,000
            totalFare = 15000 + (29 * 13500) + (distance - 30) * 11000;
        }

        return totalFare;
    }
}

