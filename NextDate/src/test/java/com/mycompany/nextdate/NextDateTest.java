/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.nextdate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class NextDateTest {
    
    public void testLeapYear() {
        assertEquals(true, NextDate.isLeapYear(2012)); // 2012 là năm nhuận
        assertEquals(false, NextDate.isLeapYear(2011)); // 2011 không phải năm nhuận
        assertEquals(true, NextDate.isLeapYear(2000)); // 2000 là năm nhuận (chia hết cho 400)
        assertEquals(false, NextDate.isLeapYear(1900)); // 1900 không phải năm nhuận (chia hết cho 100 nhưng không chia hết cho 400)
    }

    @Test
    public void testDaysInMonth() {
        assertEquals(31, NextDate.getDaysInMonth(1, 2021)); // Tháng 1
        assertEquals(28, NextDate.getDaysInMonth(2, 2021)); // Tháng 2 không nhuận
        assertEquals(29, NextDate.getDaysInMonth(2, 2020)); // Tháng 2 năm nhuận
        assertEquals(30, NextDate.getDaysInMonth(4, 2021)); // Tháng 4
    }

    @Test
    public void testNextDate() {
        // Ngày cuối tháng
        assertEquals("01/03/2012", NextDate.getNextDate(29, 2, 2012)); // Tháng 2 năm nhuận
        assertEquals("01/01/2013", NextDate.getNextDate(31, 12, 2012)); // Cuối năm

        // Ngày thông thường
        assertEquals("16/06/2012", NextDate.getNextDate(15, 6, 2012)); // Ngày thường
        assertEquals("02/03/2012", NextDate.getNextDate(1, 3, 2012)); // Đầu tháng 3

        // Trường hợp không hợp lệ
        assertEquals("Invalid date", NextDate.getNextDate(32, 1, 2012)); // Ngày vượt quá
        assertEquals("Invalid date", NextDate.getNextDate(0, 1, 2012)); // Ngày không hợp lệ
        assertEquals("Invalid date", NextDate.getNextDate(1, 13, 2012)); // Tháng vượt quá
        assertEquals("Invalid date", NextDate.getNextDate(1, 11, 2014)); // Năm vượt quá
    }
    
}
