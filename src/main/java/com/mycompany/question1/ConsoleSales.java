/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.question1;

import java.util.Arrays;

/**
 *
 * @author Amelia
 */
public class ConsoleSales {

    public static void main(String[] args) {
        int[][] sales = {{1000, 2000, 3000},
        {2000, 3000, 4000},
        {1500, 1100, 1200}};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        System.out.printf("""
                           ------------------------------------------------------------------------
                           GAMING CONSOLE REPORT
                           ------------------------------------------------------------------------
                                            %s
                          CAPE TOWN         %s
                          PORT ELIZABETH    %s
                          PRETORIA          %s
                           
                           """, Arrays.toString(consoles), Arrays.toString(sales[0]), Arrays.toString(sales[1]), Arrays.toString(sales[2]));
        System.out.printf("""
                          ------------------------------------------------------------------------
                          CONSOLE SALES TOTAL FOR EACH CITY
                          ------------------------------------------------------------------------
                          
                          """);
        for (int i = 0; i < sales.length; i++) {
            int sum = 0;
            for (int j = 0; j < sales[i].length; j++) {
                sum += sales[i][j];
            }
            System.out.println("%s\t%d".formatted(cities[i], sum));
        }
        System.out.println("------------------------------------------------------------------------");

    }
}
