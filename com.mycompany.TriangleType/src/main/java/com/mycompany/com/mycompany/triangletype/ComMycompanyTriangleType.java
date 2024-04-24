/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.com.mycompany.triangletype;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ComMycompanyTriangleType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second side: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third side: ");
        int c = scanner.nextInt();

        // Kiểm tra xem có phải là tam giác hay không
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("NotATriangle");
        } else if (a == b && b == c) {
            // Tam giác đều
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            // Tam giác cân
            System.out.println("Isosceles");
        } else {
            // Tam giác thường
            System.out.println("Scalene");
        }

        // Kiểm tra xem có phải là tam giác vuông hay không
        if (isRightTriangle(a, b, c)) {
            System.out.println("Right triangle");
        }

        scanner.close();
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        // Sắp xếp các cạnh để cạnh lớn nhất là cạnh c
        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);

        int x = sides[0];
        int y = sides[1];
        int z = sides[2];

        return (x * x + y * y == z * z);
    }
}
