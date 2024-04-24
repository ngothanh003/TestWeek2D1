/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nextdate;

/**
 *
 * @author LENOVO
 */
public class NextDate {

    // Kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // Số ngày trong mỗi tháng
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2: // Tháng 2 có 28 hoặc 29 ngày
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4: case 6: case 9: case 11: // Tháng 4, 6, 9, 11 có 30 ngày
                return 30;
            default: // Các tháng còn lại có 31 ngày
                return 31;
        }
    }

    // Hàm trả về ngày tiếp theo
    public static String getNextDate(int day, int month, int year) {
        int daysInMonth = getDaysInMonth(month, year);

        if ((day < 1 || day > daysInMonth) || (month < 1 || month > 12 ) || (year < 1812 || year > 2012)){
            return "Invalid date";
        }

        day++; // Tăng ngày lên 1

        if (day > daysInMonth) { // Nếu vượt quá số ngày trong tháng
            day = 1;
            month++;

            if (month > 12) { // Nếu vượt quá số tháng trong năm
                month = 1;
                year++;
            }
        }

        return String.format("%02d/%02d/%04d", day, month, year); // Định dạng ngày theo DD/MM/YYYY
    }

    public static void main(String[] args) {
        // Kiểm tra với một số ngày khác nhau
        System.out.println(getNextDate(28, 2, 2012)); // Năm nhuận, ngày cuối tháng 2
        System.out.println(getNextDate(31, 12, 2012)); // Ngày cuối cùng trong năm
        System.out.println(getNextDate(15, 6, 2012)); // Ngày thông thường
    }
}
