/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applicationprocess;

/**
 *
 * @author Admin
 */
public class RectangleArea {

    public static double calculateArea(double width, double height) {
        if (width < 0 || height < 0) {
            // Returns 0 if dimensions are invalid (negative)
            return 0; 
        }
        return width * height;
    }
}

